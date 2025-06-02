package co.com.AutoPTC.utils.hooks;

import java.util.Random;
import java.util.UUID;

public class GenerarDatosDinamicosRegistro {

    private static final String[] NOMBRES = {
            "CARLOS", "MARÍA", "LUIS", "ANA", "PEDRO", "LAURA", "JOSÉ", "CAMILA",
            "JUAN", "DIANA", "ANDRÉS", "PAULA", "MIGUEL", "VALENTINA", "DANIEL", "SARA"
    };

    private static final String[] APELLIDOS = {
            "GÓMEZ", "RODRÍGUEZ", "MARTÍNEZ", "LÓPEZ", "HERNÁNDEZ", "DÍAZ", "TORRES",
            "RAMÍREZ", "MORENO", "ROJAS", "GUTIÉRREZ", "CASTRO", "ORTIZ", "VARGAS"
    };


    private static final Random random = new Random();

    public static String generarNombreCompleto() {
        String nombre = NOMBRES[random.nextInt(NOMBRES.length)];
        String segundoNombre = NOMBRES[random.nextInt(NOMBRES.length)];
        String apellido1 = APELLIDOS[random.nextInt(APELLIDOS.length)];
        String apellido2 = APELLIDOS[random.nextInt(APELLIDOS.length)];
        return nombre + " " + segundoNombre + " " + apellido1 + " " + apellido2;
    }

    public static String generarCorreo() {
        String nombre = NOMBRES[random.nextInt(NOMBRES.length)].toLowerCase();
        String apellido = APELLIDOS[random.nextInt(APELLIDOS.length)].toLowerCase();
        String sufijo = UUID.randomUUID().toString().substring(0, 5);
        return nombre + apellido + sufijo + "@mail.com";
    }

    public static String generarContraseña() {
        return "Clave" + (100 + random.nextInt(900)); // Ej: Clave123
    }



}
