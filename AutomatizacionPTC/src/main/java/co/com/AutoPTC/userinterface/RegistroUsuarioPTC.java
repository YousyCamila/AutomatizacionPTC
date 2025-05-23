package co.com.AutoPTC.userinterface;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuarioPTC extends PageObject{

    public static Target INPUT_NOMBRE_COMPLETO = Target.the("Campo para ingresar el nombre completo")
            .located(By.id("fullName-input"));

    public static Target INPUT_EMAIL = Target.the("Campo para ingresar el correo electrónico")
            .located(By.id("correo"));

    public static Target INPUT_CONTRASENA = Target.the("Campo para ingresar la contraseña")
            .located(By.id("Contra"));

    public static Target INPUT_CONFIRMAR_CONTRASENA = Target.the("Campo para confirmar la contraseña")
            .located(By.id("confiContra"));

    public static Target SELECT_ROL = Target.the("Selector para elegir el rol")
            .located(By.id("role-select"));

    public static Target OPCION_ROL = Target.the("Opción de rol {0}")
            .locatedBy("//*[@id=\":r8:\"]/li[2]");
    public static Target INPUT_CODIGO_VERIFICACION = Target.the("Campo para ingresar el código de verificación")
            .located(By.id("CodigoVeri"));

    public static Target BOTON_REGISTRARSE = Target.the("Botón para enviar el formulario de registro")
            .located(By.id("Registrarse"));

}

