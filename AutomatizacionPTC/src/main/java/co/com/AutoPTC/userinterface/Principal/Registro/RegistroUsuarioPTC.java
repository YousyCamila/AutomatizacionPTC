package co.com.AutoPTC.userinterface.Principal.Registro;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuarioPTC extends PageObject{


    public static Target BTN_INICIOSE = Target.the("boton para iniciar sesion")
            .located(By.xpath("//*[@id=\"root\"]/div/header/div/a[3]"));

    public static Target BTN_REGISTRAR = Target.the("Boton para registarse")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/button[2]"));


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
            .locatedBy("//li[contains(text(),'{0}')]");


    public static Target INPUT_CODIGO_VERIFICACION = Target.the("Campo para ingresar el código de verificación")
            .located(By.id("CodigoVeri"));

    public static Target BOTON_REGISTRARSE = Target.the("Botón para enviar el formulario de registro")
            .located(By.id("Registrarse"));

    public static Target SELECT_TIPO_DOCUMENTO = Target.the("Selector para elegir el tipo de documento")
            .located(By.xpath("//*[@id=\"mui-component-select-tipoDocumento\"]"));

    public static Target INPUT_NUMERO_DOCUMENTO = Target.the("Campo para ingresar el número de documento")
            .located(By.id("//*[@id=\":r1b:\"]"));

    public static Target INPUT_NOMBRES = Target.the("Campo para ingresar los nombres")
            .located(By.id("//*[@id=\":r1c:\"]"));

    public static Target INPUT_APELLIDOS = Target.the("Campo para ingresar los apellidos")
            .located(By.id("//*[@id=\":r1d:\"]"));

    public static Target INPUT_FECHA_NACIMIENTO = Target.the("Campo para ingresar la fecha de nacimiento")
            .located(By.id("fechaNacimiento"));

    public static Target BOTON_GUARDAR = Target.the("Botón para guardar el segundo formulario")
            .located(By.id("guardarRegistro"));

}

