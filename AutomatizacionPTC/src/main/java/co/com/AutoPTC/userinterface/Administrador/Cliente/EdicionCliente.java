package co.com.AutoPTC.userinterface.Administrador.Cliente;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class EdicionCliente {

    public static Target ABRIR_OPCIONES = Target.the("Botón para editar cliente")
            .located(By.xpath("//*[@id=\"root\"]/div/div[1]/div/button"));

    public static Target ABRIR_GESTIONCLIENTES = Target.the("Botón para editar cliente")
            .located(By.xpath("/html/body/div[2]/div[3]/ul/li[1]/div"));

    public static Target BTN_EDITAR_CLIENTE = Target.the("Botón para editar cliente")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/table/tbody/tr[2]/td[5]/button[2]"));


    public static Target SELECT_TIPO_DOCUMENTO = Target.the("Selector para editar el tipo de documento")
            .located(By.xpath("//*[@id=\"mui-component-select-tipoDocumento\"]"));

    public static Target opcionTipoDocumento(String tipo) {
        return Target.the("Seleccionar tipo de documento: " + tipo)
                .located(By.xpath("//li[@role='option' and @data-value='" + tipo + "']"));
    }

    public static Target INPUT_NUMERO_DOCUMENTO = Target.the("Campo para editar el número de documento")
            .located(By.name("numeroDocumento"));

    public static Target INPUT_NOMBRES = Target.the("Campo para editar los nombres")
            .located(By.name("nombres"));

    public static Target INPUT_APELLIDOS = Target.the("Campo para editar los apellidos")
            .located(By.name("apellidos"));

    public static Target INPUT_CORREO_ELECTRONICO = Target.the("Campo para editar el correo electrónico")
            .located(By.name("correo"));

    public static Target INPUT_FECHA_NACIMIENTO = Target.the("Campo para editar la fecha de nacimiento")
            .located(By.xpath("//*[@id=\":r7v:\"]"));

    public static Target BOTON_GUARDAR_CAMBIOS = Target.the("Botón para guardar los cambios del cliente")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/form/div[2]/button[2]"));

}

