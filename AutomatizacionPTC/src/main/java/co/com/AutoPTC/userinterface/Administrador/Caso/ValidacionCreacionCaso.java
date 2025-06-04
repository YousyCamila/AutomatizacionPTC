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



}


