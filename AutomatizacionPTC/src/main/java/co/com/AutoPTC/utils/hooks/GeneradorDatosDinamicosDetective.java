package co.com.AutoPTC.utils.hooks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;

public class GeneradorDatosDinamicosDetective {

    private static final String[] OPCION_TIPO_DOCUMENTO = {
            "Cedula",
            "Pasaporte"
    };

    private static final String[] NOMBRES = {
            "Carlos", "María", "Luis", "Ana", "Pedro", "Laura", "José", "Camila",
            "Juan", "Diana", "Andrés", "Paula", "Miguel", "Valentina", "Daniel", "Sara"
    };

    private static final String[] APELLIDOS = {
            "Gómez", "Rodríguez", "Martínez", "López", "Hernández", "Díaz", "Torres",
            "Ramírez", "Moreno", "Rojas", "Gutiérrez", "Castro", "Ortiz", "Vargas"
    };

    private static final String[] ESPECIALIDADES = {
            "cadenaCustodia", "investigacionExtorsion", "estudiosSeguridad", "investigacionInfidelidades", "investigacionRobosEmpresariales", "antecedentes", "recuperacionVehiculos"
    };


    private static final Random random = new Random();

    public static String generarTipoDocumento() {
        int index = random.nextInt(OPCION_TIPO_DOCUMENTO.length);
        return OPCION_TIPO_DOCUMENTO[index];
    }

    public static String generarDocumento(String tipoDocumento) {
        switch (tipoDocumento) {
            case "Cédula":
                return generarNumeros(10);
            case "Pasaporte":
                return generarLetras(3) + generarNumeros(3);
            default:
                return "0000000000";
        }
    }

    public static String generarCorreo() {
        return "detective." + UUID.randomUUID().toString().substring(0, 6) + "@autoptc.com";
    }

    public static String generarNombre() {
        return NOMBRES[random.nextInt(NOMBRES.length)];
    }

    public static String generarApellido() {
        return APELLIDOS[random.nextInt(APELLIDOS.length)];
    }

    public static String generarFechaNacimiento() {
        LocalDate fechaActual = LocalDate.now();
        int anioMin = fechaActual.minusYears(65).getYear();
        int anioMax = fechaActual.minusYears(18).getYear();
        int anioAleatorio = random.nextInt(anioMax - anioMin + 1) + anioMin;

        int mesAleatorio = random.nextInt(12) + 1;
        int diaAleatorio = random.nextInt(28) + 1;

        LocalDate fechaGenerada = LocalDate.of(anioAleatorio, mesAleatorio, diaAleatorio);

        return fechaGenerada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public static String generarEspecialidad() {
        int index = random.nextInt(ESPECIALIDADES.length);
        return ESPECIALIDADES[index];
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
