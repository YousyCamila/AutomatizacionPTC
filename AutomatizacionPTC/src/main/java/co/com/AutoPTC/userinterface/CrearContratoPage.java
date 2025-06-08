package co.com.AutoPTC.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearContratoPage {
    public static final Target BOTON_CREAR = Target.the("Botón Crear")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[1]/button[1]"));
    public static final Target SELECT_CLIENTE = Target.the("Selector de Cliente")
            .located(By.xpath("//*[@id=\"mui-component-select-idCliente\"]"));
    public static final Target SELECT_DETECTIVE = Target.the("Selector de Detective")
            .located(By.xpath("//*[@id=\"mui-component-select-idDetective\"]"));
    public static final Target INPUT_FECHA_INICIO = Target.the("Campo Fecha de Inicio")
            .located(By.xpath("/html/body/div/div/div/div/form/div/div[4]/div/div/input"));
    public static final Target INPUT_FECHA_CIERRE = Target.the("Campo Fecha de Cierre")
            .located(By.xpath("/html/body/div/div/div/div/form/div/div[5]/div/div/input"));
    public static final Target TEXTAREA_DESCRIPCION = Target.the("Descripción del Servicio")
            .located(By.xpath("/html/body/div/div/div/div/form/div/div[3]/div/div/textarea[1]"));
    public static final Target SELECT_METODO_PAGO = Target.the("Selector Método de Pago")
            .located(By.xpath("//*[@id=\"mui-component-select-metodoPago\"]"));
    public static final Target SELECT_TIPO_TARIFA = Target.the("Selector Tipo de Tarifa")
            .located(By.xpath("//*[@id=\"mui-component-select-tipoTarifa\"]"));
    public static final Target INPUT_TARIFA = Target.the("Campo Tarifa")
            .located(By.xpath("/html/body/div/div/div/div/form/div/div[8]/div/div/input"));
    public static final Target TEXTAREA_CLAUSULAS = Target.the("Cláusulas Adicionales")
            .located(By.xpath("/html/body/div/div/div/div/form/div/div[9]/div/div/textarea[1]"));
    public static final Target BOTON_CREAR_CONTRATO = Target.the("Botón Crear Contrato")
            .located(By.xpath("//*[@id=\"root\"]/div/div/div/form/div/div[10]/div[1]/button"));
    public static Target OPCION_CLIENTE(String cliente) {
        return Target.the("opción del cliente: " + cliente)
                .located(By.xpath("//ul[@role='listbox']//li[normalize-space(.)='" + cliente + "']"));
    }
    public static Target OPCION_DETECTIVE(String detective) {
        return Target.the("opción del detective: " + detective)
                .located(By.xpath("//ul[@role='listbox']//li[normalize-space(.)='" + detective + "']"));
    }
    public static Target OPCION_METODO_PAGO(String metodo) {
        return Target.the("opción del método de pago: " + metodo)
                .located(By.xpath("//ul[@role='listbox']//li[normalize-space(.)='" + metodo + "']"));
    }
    public static Target OPCION_TIPO_TARIFA(String tipo) {
        return Target.the("opción del tipo de tarifa: " + tipo)
                .located(By.xpath("//ul[@role='listbox']//li[normalize-space(.)='" + tipo + "']"));
    }
    public static Target BOTON_CONFIRMACION_CONTRATO_CREADO = Target.the ("Mensaje exitoso de edicion del cliente")
            .located(By.xpath("/html/body/div[2]/div/div[6]/button[1]"));
    public static final Target ULTIMO_CONTRATO = Target.the("último contrato de la tabla")
            .locatedBy("(//table//tbody//tr)[last()]");
}
