package co.com.AutoPTC.userinterface.Administrador.Cliente;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EliminacionCliente {

    public static Target BTN_ELIMINAR = Target.the("Boton para eliminar el cliente")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/table/tbody/tr[2]/td[5]/button[3]"));

    public static Target BTN_ACEPTAR_ELIMINAR = Target.the("Boton para eliminar el cliente")
            .located(By.xpath("/html/body/div[2]/div/div[6]/button[1]"));

    public static Target BTN_ACEPTAR= Target.the("Boton para eliminar el cliente")
            .located(By.xpath("/html/body/div[2]/div/div[6]/button[1]"));



}
