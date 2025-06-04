package co.com.AutoPTC.utils.hooks;

import co.com.AutoPTC.models.Administrador.Caso.ModelCrearCaso;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GeneradorDatosCrearCaso {

    private static final List<String> TIPOS_CASO = Arrays.asList(
            "Cadena de Custodia",
            "Investigacion de Extorsión",
            "Estudios de Seguridad",
            "Investigación de Infidelidades",
            "Investigación de Robos Empresariales",
            "Antecedentes",
            "Recuperación de Vehículos"
    );

    private static final List<String> CLIENTES = Arrays.asList(
            "Camila Rincon",
            "Camila Guerra",
            "Adriana Lucia Cardenas Galeano",
            "Fanny Sierra",
            "Daniel Cabiativa",
            "prueba 1",
            "ANDRES DUARTE",
            "FERNANDO TRUJILLO",
            "prueba string",
            "kjshdhshdsj ksjdshsjjdh",
            "Danna Camila Guerra Rincon",
            "FFFF KKS"
    );

    private static final List<String> DETECTIVES = Arrays.asList(
            "YOYIS guerra",
            "MARTIN EMILIO GUERRA RODRIGUEZ",
            "RIO CAMORYaso",
            "JSHAKHSKH KAJSIHAH",
            "LUIS HERNANDEZ",
            "JUAN ALBERTO DUARTE SIERRA",
            "SANTIAGO AVILA",
            "JUAN SEBASTIAN ORDOÑEZ SIERRA",
            "EJEMPLO PEREZ SIERRA",
            "PEDRO GUTIÉRREZ",
            "PEDRO ROJAS"
    );

    private static final Random random = new Random();

    public static ModelCrearCaso generarDatosAleatorios() {
        String tipoCaso = TIPOS_CASO.get(random.nextInt(TIPOS_CASO.size()));
        String cliente = CLIENTES.get(random.nextInt(CLIENTES.size()));
        String detective = DETECTIVES.get(random.nextInt(DETECTIVES.size()));

        return new ModelCrearCaso(tipoCaso, cliente, detective);
    }
}
