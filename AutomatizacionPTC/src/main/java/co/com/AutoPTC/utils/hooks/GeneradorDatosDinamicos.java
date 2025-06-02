package co.com.AutoPTC.utils.hooks;

import java.util.Random;
import java.util.UUID;

public class GeneradorDatosDinamicos {

    private static final String[] TIPOS_DOCUMENTO = {
            "Cédula",
            "Pasaporte",
            "Cédula de Extranjería"
    };

    private static final String[] NOMBRES = {
            "Carlos", "María", "Luis", "Ana", "Pedro", "Laura", "José", "Camila",
            "Juan", "Diana", "Andrés", "Paula", "Miguel", "Valentina", "Daniel", "Sara"
    };

    private static final String[] APELLIDOS = {
            "Gómez", "Rodríguez", "Martínez", "López", "Hernández", "Díaz", "Torres",
            "Ramírez", "Moreno", "Rojas", "Gutiérrez", "Castro", "Ortiz", "Vargas"
    };

    private static final Random random = new Random();

    public static String generarTipoDocumento() {
        int index = random.nextInt(TIPOS_DOCUMENTO.length);
        return TIPOS_DOCUMENTO[index];
    }

    public static String generarDocumento(String tipoDocumento) {
        switch (tipoDocumento) {
            case "Cédula":
            case "Cédula de Extranjería":
                return generarNumeros(10);
            case "Pasaporte":
                return generarLetras(3) + generarNumeros(3);
            default:
                return "0000000000";
        }
    }

    public static String generarCorreo() {
        return "cliente" + UUID.randomUUID().toString().substring(0, 6) + "@gmail.com";
    }

    public static String generarNombre() {
        return NOMBRES[random.nextInt(NOMBRES.length)];
    }

    public static String generarApellido() {
        return APELLIDOS[random.nextInt(APELLIDOS.length)];
    }


    private static String generarNumeros(int longitud) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    private static String generarLetras(int longitud) {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            sb.append(letras.charAt(random.nextInt(letras.length())));
        }
        return sb.toString();
    }
}
