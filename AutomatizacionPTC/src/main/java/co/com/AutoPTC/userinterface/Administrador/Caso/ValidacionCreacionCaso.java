package co.com.AutoPTC.userinterface.Administrador.Caso;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidacionCreacionCaso {

    public static Target BTN_ACEPTAR = Target.the("Boton para aceptar la alerta")
            .located(By.xpath("/html/body/div[2]/div/div[6]/button[1]"));
    public static Target BTN_CAMPOBUSQUEDA = Target.the("Campo para buscar el caso ")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/input"));
    public static Target BTN_BUSCAR = Target.the("Boton para buscar el caso")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/button"));
    public static Target campoValidarNombreCaso(String idCaso) {
        return Target.the("Campo que muestra el nombre del caso con id " + idCaso)
                .located(By.xpath("//table//tr[td[contains(text(),'" + idCaso + "')]]/td[2]"));
    }
    public static Target campoValidarCliente(String idCaso) {
        return Target.the("Campo cliente del caso " + idCaso)
                .located(By.xpath("//table//tr[td[contains(text(),'" + idCaso + "')]]/td[3]"));
    }
    public static Target campoValidarDetective(String idCaso) {
        return Target.the("Campo detective del caso " + idCaso)
                .located(By.xpath("//table//tr[td[contains(text(),'" + idCaso + "')]]/td[4]"));
    }





}


