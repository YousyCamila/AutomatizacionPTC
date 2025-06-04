package co.com.AutoPTC.userinterface.Administrador.Caso;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CreacionCaso {

    public static Target BTON_OPCIONES = Target.the("Botón para editar cliente")
            .located(By.xpath("//*[@id=\"root\"]/div/div[1]/div/button"));

    public static Target BTON_OPCION = Target.the("Botón para editar cliente")
            .located(By.xpath("/html/body/div[2]/div[3]/ul/li[3]/div"));

    public static Target BTON_CREAR_CASO = Target.the("Boton para crear el caso")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/button"));

    public static Target SELECT_CASO = Target.the("Boton para elegir el caso")
            .located(By.xpath("//*[@id=\"mui-component-select-nombreCaso\"]"));

    public static Target opcionTipoCaso(String tipo) {
        return Target.the("Seleccionar tipo de caso: " + tipo)
                .located(By.xpath("//li[@role='option' and @data-value='" + tipo + "']"));
    }

    public static Target SELECT_CLIENTE = Target.the("Boton para elegir el cliente")
            .located(By.xpath("//*[@id=\"mui-component-select-idCliente\"]"));

    public static Target opcionNombrePersona(String nombrePersona) {
        return Target.the("Seleccionar persona: " + nombrePersona)
                .located(By.xpath("//li[@role='option' and normalize-space(.)='" + nombrePersona + "']"));
    }

    public static Target SELECT_DETECTIVE = Target.the("Boton para elegir el detective")
            .located(By.xpath("//*[@id=\"mui-component-select-idDetective\"]"));

    public static Target opcionDetectivePorNombre(String nombreDetective) {
        return Target.the("Seleccionar detective con nombre: " + nombreDetective)
                .located(By.xpath("//ul[@role='listbox']/li[@role='option' and contains(normalize-space(.), '" + nombreDetective + "')]"));
    }
    
    public static Target BTN_GUARDAR = Target.the("Boton para guardar el caso")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/form/div/div[4]/div/button[2]"));


    public static final Target LBL_ID_CASO = Target.the("ID del caso creado")
            .locatedBy("//td[contains(@class,'MuiTableCell-root') and contains(@class,'MuiTableCell-body') and contains(@class,'MuiTableCell-sizeMedium')]");

}
