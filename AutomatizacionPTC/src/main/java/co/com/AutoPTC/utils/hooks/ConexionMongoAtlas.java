package co.com.AutoPTC.utils.hooks;

import com.mongodb.client.*;
import org.bson.Document;

public class ConexionMongoAtlas {

    private static final String URI = "mongodb+srv://dcamilaguerra:shadamy159@cluster0.xawys.mongodb.net/PTC?retryWrites=true&w=majority&appName=Cluster0";
    private static final String BASE_DATOS = "PTC";
    private static final String COLECCION = "users";

    public static boolean existeUsuarioPorCorreo(String email) {
        boolean existe = false;

        try (MongoClient mongoClient = MongoClients.create(URI)) {
            System.out.println("[INFO] Conectando a MongoDB Atlas...");

            MongoDatabase database = mongoClient.getDatabase(BASE_DATOS);
            MongoCollection<Document> collection = database.getCollection(COLECCION);

            System.out.println("[INFO] Consultando si existe el correo: " + email);

            Document query = new Document("email", email);
            Document resultado = collection.find(query).first();

            if (resultado != null) {
                System.out.println("[OK] Correo encontrado en la base de datos.");
                existe = true;
            } else {
                System.out.println("[WARN] Correo NO encontrado en la base de datos.");
            }

        } catch (Exception e) {
            System.out.println("[ERROR] Error al consultar MongoDB: " + e.getMessage());
        }

        return existe;
    }

}