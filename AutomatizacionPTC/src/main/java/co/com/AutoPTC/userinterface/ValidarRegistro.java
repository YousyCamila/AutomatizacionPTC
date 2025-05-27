package co.com.AutoPTC.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidarRegistro {

    public static final Target IMPUT_RESPONDER = Target.the("Campo para validar que se registro exitosamente")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div/h1"));
}
