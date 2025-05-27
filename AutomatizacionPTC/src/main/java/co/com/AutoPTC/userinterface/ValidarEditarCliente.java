package co.com.AutoPTC.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidarEditarCliente {

    public static Target MENSAJE_CONFIRMACION = Target.the ("Mensaje exitoso de edicion del cliente")
            .located(By.xpath("//*[@id=\"swal2-title\"]"));
}
