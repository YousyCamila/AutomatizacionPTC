package co.com.AutoPTC.tasks;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.bson.Document;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidarDatosEnMongo implements Task {

    private final String coleccion;
    private final String campoFiltro;
    private final String valorFiltro;
    private final Map<String, String> camposYValoresEsperados;

    private static final String URI = "mongodb+srv://dcamilaguerra:shadamy159@cluster0.xawys.mongodb.net/PTC?retryWrites=true&w=majority&appName=Cluster0";
    private static final String BASE_DATOS = "PTC";

    public ValidarDatosEnMongo(String coleccion, String campoFiltro, String valorFiltro, Map<String, String> camposYValoresEsperados) {
        this.coleccion = coleccion;
        this.campoFiltro = campoFiltro;
        this.valorFiltro = valorFiltro;
        this.camposYValoresEsperados = camposYValoresEsperados;
    }

    public static ValidarDatosEnMongo enColeccion(String coleccion, String campoFiltro, String valorFiltro, Map<String, String> camposYValoresEsperados) {
        return instrumented(ValidarDatosEnMongo.class, coleccion, campoFiltro, valorFiltro, camposYValoresEsperados);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try (MongoClient mongoClient = MongoClients.create(URI)) {
            MongoDatabase db = mongoClient.getDatabase(BASE_DATOS);
            MongoCollection<Document> collection = db.getCollection(coleccion);

            Document filtro = new Document(campoFiltro, valorFiltro);
            Document resultado = collection.find(filtro).first();

            if (resultado != null) {
                System.out.println("[BD] Documento encontrado. Validando campos...");

                for (Map.Entry<String, String> entry : camposYValoresEsperados.entrySet()) {
                    String campo = entry.getKey();
                    String valorEsperado = entry.getValue();
                    String valorEnBD = resultado.getString(campo);

                    System.out.println("[BD] " + campo + " → Esperado: " + valorEsperado + " | BD: " + valorEnBD);

                    if (!valorEsperado.equalsIgnoreCase(valorEnBD)) {
                        throw new AssertionError("[ERROR] El campo '" + campo + "' no coincide. Esperado: '" + valorEsperado + "', BD: '" + valorEnBD + "'");
                    }
                }

                System.out.println("[OK] Todos los campos coinciden en la base de datos.");

            } else {
                throw new AssertionError("[ERROR] Documento no encontrado en la colección '" + coleccion + "' con " + campoFiltro + ": " + valorFiltro);
            }

        } catch (Exception e) {
            throw new RuntimeException("[ERROR] Error validando en MongoDB: " + e.getMessage(), e);
        }
    }
}