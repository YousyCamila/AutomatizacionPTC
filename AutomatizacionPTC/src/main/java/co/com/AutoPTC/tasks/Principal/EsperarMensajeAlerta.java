package co.com.AutoPTC.tasks.Principal;

import co.com.AutoPTC.userinterface.Principal.AlertaSweetUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EsperarMensajeAlerta implements Task {

    public static EsperarMensajeAlerta aparezca() {
        return new EsperarMensajeAlerta();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(AlertaSweetUI.TITULO_ALERTA, isVisible()).forNoMoreThan(10).seconds()
        );
    }
}
