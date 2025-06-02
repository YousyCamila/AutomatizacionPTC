package co.com.AutoPTC.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarEliminarDetective {

    public static final Target CAMPO_BUSQUEDA_DOCUMENTO = Target.the("Campo para buscar el detective por número de documento")
            .located(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/input"));

    public static final Target BOTON_BUSCAR_DETECTIVE = Target.the("Botón para buscar el detective")
            .located(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/button"));

    public static final Target CAMPO_ESTADO_DETECTIVE = Target.the("Campo que muestra el estado del detective")
            .located(By.xpath("/html/body/div/div/div[2]/div[2]/table/tbody/tr/td[4]/div/span"));

    public static final Target TD_NUMERO_DOCUMENTO = Target.the("Número de documento del detective en la tabla")
            .located(By.xpath("/html/body/div/div/div[2]/div[2]/table/tbody/tr/td[1]"));
}
