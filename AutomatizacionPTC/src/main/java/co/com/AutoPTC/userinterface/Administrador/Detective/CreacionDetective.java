package co.com.AutoPTC.userinterface.Administrador.Detective;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreacionDetective {

    public static final Target ABRIR_OPCIONES_ADMIN = Target.the("Abrir menu de opciones")
            .located(By.xpath("//*[@id=\"root\"]/div/div[1]/div/button"));
    public static final Target ABRIR_GESTION_DETECTIVES = Target.the("Abrir gestion de detective")
            .located(By.xpath("/html/body/div[2]/div[3]/ul/li[2]/div/div[2]/span"));
    public static final Target ABRIR_CREACION_DETECTIVES = Target.the("Selector para opcion para crear detective")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[1]/button[1]"));
    public static final Target ABRIR_DROPDOWN_TIPO_DOCUMENTO = Target.the("Dropdown para tipo de documento")
            .located(By.xpath("//label[contains(text(), 'Tipo de Documento')]/following-sibling::div"));
    public static Target OPCION_TIPO_DOCUMENTO(String tipoDocumento) {
        return Target.the("Opción " + tipoDocumento)
                .located(By.xpath("//ul[@role='listbox']//li[normalize-space(.)='" + tipoDocumento + "']"));
    }
    public static final Target INPUT_NUMERO_DOCUMENTO =
            Target.the("Campo número de documento")
                    .located(By.xpath("//label[text()='Número de Documento']/following-sibling::div//input"));
    public static final Target INPUT_NOMBRES = Target.the("Campo nombres")
            .located(By.xpath("//label[normalize-space(text())='Nombres']/following-sibling::div//input"));
    public static final Target INPUT_APELLIDOS = Target.the("Campo apellidos")
            .located(By.xpath("//label[normalize-space(text())='Apellidos']/following-sibling::div//input"));
    public static final Target INPUT_CORREO_ELECTRONICO = Target.the("Campo correo electrónico")
            .located(By.xpath("//label[normalize-space(text())='Correo Electrónico']/following-sibling::div//input"));
    public static final Target INPUT_FECHA_NACIMIENTO = Target.the("Campo fecha de nacimiento")
            .located(By.xpath("//label[normalize-space(text())='Fecha de Nacimiento']/following-sibling::div//input"));
    public static Target checkboxEspecialidad(String especialidades) {
        return Target.the("Checkbox de especialidad " + especialidades)
                .located(By.xpath("//label[contains(@class, 'MuiFormControlLabel-root') and .//span[normalize-space(text())='" + especialidades + "']]"));
    }
    public static final Target BOTON_GUARDAR_DETECTIVE = Target.the("Botón guardar detective")
            .located(By.xpath("//button[normalize-space(text())='Guardar' or contains(., 'Guardar')]"));
    public static final Target MENSAJE_CONFIRMACION_EXITO = Target.the("Mensaje de confirmación de éxito")
            .located(By.id("swal2-html-container"));
    public static final Target BOTON_OK = Target.the("botón OK de alerta")
            .located(By.xpath("//div[contains(@class, 'swal2-actions')]/button[contains(@class, 'swal2-confirm') and text()='OK']"));
    public static final Target BUSCAR = Target.the("botón para buscar")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/button"));
    public static final Target CAMPO_BUSQUEDA = Target.the("campo de búsqueda de detective")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/input"));
    public static final Target FILA_POR_CEDULA = Target.the("fila de la tabla por cédula '{0}'")
            .locatedBy("//tbody[contains(@class,'MuiTableBody-root')]//tr[./td[1][contains(text(),'{0}')]]");
    public static final Target FILA_POR_NOMBRE_APELLIDO_EN_UNA_CELDA = Target.the("fila de la tabla por nombre '{0}' y apellido '{1}'")
            .locatedBy("//tbody[contains(@class,'MuiTableBody-root')]//tr[./td[2][contains(text(),'{0}') and contains(text(),'{1}')]]");
}
