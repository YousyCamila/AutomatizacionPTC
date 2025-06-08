package co.com.AutoPTC.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible; // Importar isVisible
import net.serenitybdd.screenplay.waits.WaitUntil; // Importar WaitUntil

import java.time.Duration;

public class Navegacion implements Task {

    private final String opcion;

    public Navegacion(String opcion) {
        this.opcion = opcion;
    }

    public static Navegacion hacia(String opcion) {
        return instrumented(Navegacion.class, opcion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuLateral.ABRIR_OPCIONES_ADMIN),
                WaitUntil.the(MenuLateral.BOTON_MENU_LATERAL(opcion), isVisible()).forNoMoreThan(10).seconds(),
                Click.on(MenuLateral.BOTON_MENU_LATERAL(opcion))
        );
    }


    public static class MenuLateral {
        public static final Target ABRIR_OPCIONES_ADMIN = Target.the("Abrir menú de opciones")
                .located(By.xpath("//*[@id=\"root\"]/div/div[1]/div/button"));

        public static Target BOTON_MENU_LATERAL(String texto) {
            return Target.the("Item de menú lateral: " + texto)
                    .locatedBy("//li[contains(@class, 'MuiListItem-root') and .//span[normalize-space(text())='{0}']]")
                    .of(texto);
        }
    }
}