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

}















