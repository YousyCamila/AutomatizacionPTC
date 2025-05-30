package co.com.AutoPTC.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreacionDetective {

    public static final Target ABRIR_OPCIONES_ADMIN = Target.the("Abrir menu de opciones")
            .located(By.xpath("//*[@id=\"root\"]/div/div[1]/div/button"));
    public static final Target ABRIR_GESTION_DETECTIVES = Target.the("Abrir gestion de detective")
            .located(By.xpath("/html/body/div[2]/div[3]/ul/li[2]/div/div[2]/span"));
    public static final Target ABRIR_CREACION_CLIENTES = Target.the("Selector para opcion para crear detective")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[1]/button[1]"));
    public static final Target ABRIR_DROPTWON_TIPO_DOCUMENTO = Target.the("Droptown para tipo de documento")
            .locatedBy(String.valueOf(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/form/div/div[1]/div/div/div")));
    public static Target OPCION_TIPO_DOCUMENTO (String tipoDocumento) {
        return Target.the("opción " + tipoDocumento)
                .located(By.xpath("//li[@data-value='" + tipoDocumento + "']"));
    }
    public static final Target INPUT_NUMERO_DOCUMENTO = Target.the("Agregar numero de documento")
            .locatedBy(String.valueOf(By.xpath("//*[@id=\":r96:\"]")));
    public static final Target INPUT_NOMBRES = Target.the("Agregar nombres")
            .locatedBy(String.valueOf(By.xpath("//*[@id=\":r97:\"]")));
    public static final Target INPUT_APELLIDOS = Target.the("Agregar apellidos")
            .locatedBy(String.valueOf(By.xpath("//*[@id=\":r98:\"]")));
    public static final Target INPUT_CORREO_ELECTRONICO = Target.the("Agregar correo")
            .locatedBy(String.valueOf(By.xpath("//*[@id=\":r99:\"]")));
    public static final Target INPUT_FECHA_NACIMIENTO = Target.the("Agregar fecha de nacimiento")
            .locatedBy(String.valueOf(By.xpath("//*[@id=\":r9a:\"]")));
    public static Target checkboxEspecialidad(String especialidad) {
        return Target.the("checkbox de especialidad " + especialidad).located(By.xpath(
                "//label[./span[contains(@class, 'MuiTypography-root') and contains(text(), '" + especialidad + "')]]//input[@type='checkbox']"
        ));
    }
    public static final Target BOTON_GUARDAR_DETECTIVE  = Target.the("Guardar y crear Detective")
            .locatedBy(String.valueOf(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/form/div/div[8]/div/button[2]")));

    public static final Target MENSAJE_CONFIRMACION_EXITO = Target.the("Mensaje de exito")
            .locatedBy(String.valueOf(By.xpath("//*[@id=\"swal2-html-container\"]")));
}
