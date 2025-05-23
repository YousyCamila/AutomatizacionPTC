package co.com.AutoPTC.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioSesionPage {
    public static final Target LOGIN_PAGE = Target.the("enlace de login")
            .located(By.xpath("//a[contains(@href, 'login')]"));
    public static final Target INPUT_USUARIO = Target.the("campo de usuario")
            .located(By.xpath("//*[@id=\":r2:\"]"));
    public static final Target INPUT_CONTRASENA = Target.the("campo de contraseña")
            .located(By.xpath("//*[@id=\":r3:\"]"));

    public static final Target DROPDOWN_ROL = Target.the("campo selector de rol")
            .located(By.xpath("//div[@role='combobox' and contains(@class, 'MuiSelect-select')]"));
    public static Target OPCION_ROL(String rol) {
        return Target.the("opción " + rol)
                .located(By.xpath("//li[@data-value='" + rol.toLowerCase() + "' or text()='" +
                        rol.substring(0,1).toUpperCase() + rol.substring(1).toLowerCase() + "']"));
    }
    public static final Target BOTON_INGRESAR = Target.the("botón de ingresar")
            .located(By.xpath("//button[@type='submit']"));

    public static final Target PANEL = Target.the("contenedor MuiBox")
            .located(By.className("MuiBox-root"));
}
