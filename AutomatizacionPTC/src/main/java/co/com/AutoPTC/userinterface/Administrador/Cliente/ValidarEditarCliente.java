package co.com.AutoPTC.userinterface.Administrador.Cliente;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidarEditarCliente {


    public static Target BTN_ACEPTAR = Target.the ("Mensaje exitoso de edicion del cliente")
            .located(By.xpath("/html/body/div[2]/div/div[6]/button[1]"));


    public static Target BUSCAR_CLIENTE = Target.the ("Campo para buscar el cliente")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/input"));

    public static Target BTN_BUSCAR_CLIENTE = Target.the ("Boton para buscar el cliente")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/button"));

    public static Target CAMPO_VALIDAR = Target.the ("Validacion exitosa")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/table/tbody/tr/td[1]"));

    public static Target campoValidarDocumento(String numeroDocumento) {
        return Target.the("Campo documento del cliente " + numeroDocumento)
                .located(By.xpath("//table//tr[td[contains(text(),'" + numeroDocumento + "')]]/td[1]"));
    }

    public static Target campoValidarNombre(String numeroDocumento) {
        return Target.the("Campo nombre del cliente con documento " + numeroDocumento)
                .located(By.xpath("//table//tr[td[contains(text(),'" + numeroDocumento + "')]]/td[2]"));
    }

    public static Target campoValidarCorreo(String numeroDocumento) {
        return Target.the("Campo correo del cliente con documento " + numeroDocumento)
                .located(By.xpath("//table//tr[td[contains(text(),'" + numeroDocumento + "')]]/td[3]"));
    }
}
