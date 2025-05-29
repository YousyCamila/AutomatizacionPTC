package co.com.AutoPTC.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearDetective {

    public static final Target CREAR_CLIENTE = Target.the("Selector para crear Cliente")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[1]/button[1]"));

    public static final Target ABRIR_DROPTWON = Target.the("Droptown para tipo de documento")
            .locatedBy(String.valueOf(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/form/div/div[1]/div/div/div")));

    public static Target OPCION_TIPO_DOCUMENTO (String tipoDocumento) {
        return Target.the("opción " + tipoDocumento)
                .located(By.xpath("//li[@data-value='" + tipoDocumento + "']"));
    }




}
