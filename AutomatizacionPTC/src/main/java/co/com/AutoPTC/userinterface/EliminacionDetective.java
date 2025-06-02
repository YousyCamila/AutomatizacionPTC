package co.com.AutoPTC.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EliminacionDetective {


    public static Target ABRIR_OPCIONES = Target.the("Botón para editar cliente")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("/html/body/div/div/div[1]/div/button"));


    public static Target ABRIR_GESTIONDETECTIVES = Target.the("Botón para editar cliente")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("/html/body/div[2]/div[3]/ul/li[2]/div"));

    public static final Target BTN_ELIMINAR = Target.the("Botón para eliminar el detective")
            .located(By.xpath("/html/body/div/div/div[2]/div[2]/table/tbody/tr[10]/td[5]/button[3]"));

    public static final Target BTN_ACEPTAR_ELIMINAR = Target.the("Botón para confirmar eliminación del detective")
            .located(By.xpath("/html/body/div[2]/div/div[6]/button[1]"));

    public static Target BTN_ACEPTAR= Target.the("Boton para eliminar el cliente")
            .located(By.xpath("/html/body/div[2]/div/div[6]/button[1]"));

}