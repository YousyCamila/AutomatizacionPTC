package co.com.AutoPTC.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EliminacionDetective {
    public static final Target BTN_ELIMINAR = Target.the("Botón para eliminar el detective")
            .located(By.xpath("/html/body/div/div/div[2]/div[2]/table/tbody/tr[2]/td[5]/button[3]"));
    public static final Target BTN_ACEPTAR_ELIMINAR = Target.the("Botón para confirmar eliminación del detective")
            .located(By.xpath("/html/body/div[2]/div/div[6]/button[1]"));
    public static Target BTN_ACEPTAR= Target.the("Boton para eliminar el cliente")
            .located(By.xpath("/html/body/div[2]/div/div[6]/button[1]"));
    public static Target ABRIR_BOTON_EDITAR= Target.the("Boton para eliminar el cliente")
            .located(By.xpath("/html/body/div/div/div[2]/div[2]/table/tbody/tr[2]/td[5]/button[2]"));
    public static Target ACTIVAR_DETECTIVE= Target.the("Boton para eliminar el cliente")
            .located(By.xpath("/html/body/div/div/div[2]/div/div/form/div[1]/div[9]/label/span[1]/span[1]/input"));
    public static Target GUARDAR_CON_DETECTIVE_ACTIVO= Target.the("Boton para eliminar el cliente")
            .located(By.xpath("/html/body/div/div/div[2]/div/div/form/div[2]/button[2]"));
    public static Target BOTON_CONFIRMAR_GUARDADO= Target.the("Boton para eliminar el cliente")
            .located(By.xpath("/html/body/div[2]/div/div[6]/button[1]\n"));
}

