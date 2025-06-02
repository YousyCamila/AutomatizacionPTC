package co.com.AutoPTC.utils.hooks;
import co.com.AutoPTC.models.DatosCrearContrato;
import co.com.AutoPTC.models.DatosCrearContrato;

import java.util.UUID;

public class GeneradorDatosCrearContrato {

    public static String ultimaDescripcionGenerada; // variable accesible

    public static DatosCrearContrato generarContratoConDescripcionAleatoria() {
        ultimaDescripcionGenerada = "Servicio de recoleccion de info " + UUID.randomUUID().toString().substring(0, 20);

        return new DatosCrearContrato(
                "Fanny Sierra",
                "Camila guerra",
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
