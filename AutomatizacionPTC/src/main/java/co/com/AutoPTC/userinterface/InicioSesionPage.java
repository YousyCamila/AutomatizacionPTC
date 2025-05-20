package co.com.AutoPTC.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioSesionPage {
    public static final Target INPUT_USUARIO = Target.the("campo de usuario")
            .located(By.xpath("//*[@id=\":r2:\"]"));
    public static final Target INPUT_CONTRASENA = Target.the("campo de contraseña")
            .located(By.xpath("//*[@id=\":r3:\"]"));
    public static final Target SELECT_ROL = Target.the("selector de rol")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[3]/div/div"));
    public static final Target BOTON_INGRESAR = Target.the("botón de ingresar")
            .located(By.id("btnIngresar"));
}
