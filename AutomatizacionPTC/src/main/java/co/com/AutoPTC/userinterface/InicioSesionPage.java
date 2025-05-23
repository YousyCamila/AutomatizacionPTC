package co.com.AutoPTC.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioSesionPage {

    public static final Target BOTON_INICIOSESION = Target.the("BOTON PARA EL FORMULARO DE INICIAR SESION")
            .located(By.xpath("//*[@id=\"root\"]/div/header/div/a[3]"));
    public static final Target INPUT_USUARIO = Target.the("campo de usuario")
            .located(By.id("corr-select"));
    public static final Target INPUT_CONTRASENA = Target.the("campo de contraseña")
            .located(By.id("cont-select"));
    public static final Target SELECT_ROL = Target.the("selector de rol")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[3]/div/div"));

    public static Target OPCION_ROL = Target.the("Opción de rol ")
            .located( By.xpath("//*[@id=\":r5:\"]/li[2]"));
    public static final Target BOTON_INGRESAR = Target.the("botón de ingresar")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/button[1]"));
}


