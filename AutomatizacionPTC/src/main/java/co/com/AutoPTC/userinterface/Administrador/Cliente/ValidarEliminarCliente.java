package co.com.AutoPTC.userinterface.Administrador.Cliente;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidarEliminarCliente {


    public static Target BUSCAR_CLIENTE_ELI = Target.the ("Campo para buscar el cliente")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/input"));

    public static Target BTN_BUSCAR_CLIENTE_ELI = Target.the ("Boton para buscar el cliente")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/button"));

    public static Target CAMPO_VALIDAR_ELI = Target.the ("Validacion exitosa")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/table/tbody/tr/td[4]/div"));

    public static final Target TD_NUMERO_DOCUMENTO = Target.the("Número de documento del cliente en la tabla")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/table/tbody/tr[2]/td[1]"));

}
