package co.com.AutoPTC.userinterface.Principal;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AlertaSweetUI {
    public static final Target TITULO_ALERTA = Target.the("título de alerta")
            .located(By.xpath("//*[@id='swal2-title']"));

    public static final Target BOTON_OK_ALERTA = Target.the("botón OK de la alerta")
            .located(By.xpath("/html/body/div[2]/div/div[6]/button[1]"));

}

