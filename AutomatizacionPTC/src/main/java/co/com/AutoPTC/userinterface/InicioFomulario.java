package co.com.AutoPTC.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class InicioFomulario extends PageObject {

    public static Target INPUT_Contactanos = Target.the(" Ingreso al formulario").located(By.xpath("//*[@id=\"root\"]/div/header/div/a[2]"));

    public static Target INPUT_USUARIO = Target.the(" Ingreso del Usuario").located(By.xpath("//*[@id=\":r4:\"]"));
    public static Target INPUT_EMAIL = Target.the("Ingreso del password").located(By.xpath("//*[@id=\":r5:\"]"));

    public static Target   INPUT_TEFONO      = Target.the("ingreso del telefono").located(By.xpath("//*[@id=\":r6:\"]"));
    public static Target     INPUT_DESCRIBIR    = Target.the("ingreso de la descripcion").located(By.xpath("//*[@id=\":r7:\"]"));
    public static Target BTN_ENVIAR = Target.the("Boton inicio sesion").located(By.xpath("//*[@id=\"root\"]/div/div/div[1]/form/button"));

    public static Target MENSAJE_FORMULARIO = Target.the("Mensaje de contacto").located(By.xpath("//*[@id=\"swal2-title\"]"));

    public static Target BTON_DE_CONTINUAR = Target.the("boton continuar al inicio de sesion").located(By.xpath("/html/body/div[2]/div/div[6]/button[1]"));


    public static Target INPUT_CORRREO = Target.the("input").located(By.xpath("/html/body/div/div/div[2]/div/form/div[1]/div/input"));
    public static Target INPUT_CONTRASEÑA = Target.the("input").located(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div/input"));


    public static Target INPUT_ROLES = Target.the("selector de rol").located(By.xpath("//div[@role='combobox']"));
    public static Target opcionRol(String rol) {
        return Target.the("opción de rol").located(By.xpath("//li[text()='" + rol + "']"));
    }
    public static Target BTN_INICIAR = Target.the("boton").located(By.xpath("/html/body/div/div/div[2]/div/form/button[1]"));


    public static Target INPUT_INICIAR_SESION = Target.the("boton inicio sesion").located(By.xpath("/html/body/div/div/header/div/a[3]"));

    public static Target BOTON_RESPONDER_SOLICITUDES = Target.the("boton responder solicitudes").located(By.xpath("/html/body/div/div/div[1]/div/div[2]/button"));

    public static Target BOTON_ORDENAR = Target.the("boton ordenar").located(By.xpath("/html/body/div/div/div/div/table/thead/tr/th[6]/button"));
    public static Target BOTON_ORDENAR_ULTIMO = Target.the("boton ordenar").located(By.xpath("/html/body/div/div/div/div/table/thead/tr/th[6]/button"));


    public static final Target FILAS_TABLA = Target.the("filas de la tabla")
            .located(By.cssSelector("table tbody tr"));

}














