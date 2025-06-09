package co.com.AutoPTC.userinterface.Administrador.Cliente;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidarCrearCliente {
    public static Target BUSCAR_CLIENTE_CREAR = Target.the ("Campo para buscar el cliente")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/input"));

    public static Target BTN_BUSCAR_CLIENTE_CREAR = Target.the ("Boton para buscar el cliente")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/button"));

    public static Target campoValidarDocumento_CREAR(String numeroDocumento) {
        return Target.the("Campo documento del cliente " + numeroDocumento)
                .located(By.xpath("//table//tr[td[contains(text(),'" + numeroDocumento + "')]]/td[1]"));
    }

    public static Target campoValidarNombre_CREAR(String numeroDocumento) {
        return Target.the("Campo nombre del cliente con documento " + numeroDocumento)
                .located(By.xpath("//table//tr[td[contains(text(),'" + numeroDocumento + "')]]/td[2]"));
    }

    public static Target campoValidarCorreo_CREAR(String numeroDocumento) {
        return Target.the("Campo correo del cliente con documento " + numeroDocumento)
                .located(By.xpath("//table//tr[td[contains(text(),'" + numeroDocumento + "')]]/td[3]"));
    }
}
