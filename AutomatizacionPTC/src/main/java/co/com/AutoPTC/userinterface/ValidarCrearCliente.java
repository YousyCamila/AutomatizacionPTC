package co.com.AutoPTC.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarCrearCliente {
    public static final Target MENSAJE_CONFIRMACION = Target.the("Mensaje de confirmación de cliente creado exitosamente")
            .located(By.xpath("//*[@id=\"swal2-title\"]"));
}
