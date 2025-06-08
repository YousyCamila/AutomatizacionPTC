package co.com.AutoPTC.utils.hooks;

import co.com.AutoPTC.models.DatosCrearContrato;
import java.util.UUID;

public class GeneradorDatosCrearContrato {

    public static String ultimaDescripcionGenerada;
    public static String ultimoClienteGenerado;
    public static String ultimoDetectiveGenerado;

    public static DatosCrearContrato generarContratoConDescripcionAleatoria() {
        ultimaDescripcionGenerada = "Servicio de recolección de info " + UUID.randomUUID().toString().substring(0, 20);
        ultimoClienteGenerado = "Fanny Sierra";
        ultimoDetectiveGenerado = "Luis Hernandez";

        return new DatosCrearContrato(
                ultimoClienteGenerado,
                ultimoDetectiveGenerado,
                ultimaDescripcionGenerada,
                "21-05-2025",
                "21-01-2025",
                "Pago en Efectivo",
                "Tarifa por Hora",
                "10.000",
                "Confidencialidad total"
        );
    }
}
