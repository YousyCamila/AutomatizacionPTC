package co.com.AutoPTC.tasks.Principal;

import co.com.AutoPTC.userinterface.Principal.AlertaSweetUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidarYConfirmarAlerta implements Task {

    private final String mensajeEsperado;

    public ValidarYConfirmarAlerta(String mensajeEsperado) {
        this.mensajeEsperado = mensajeEsperado;
    }

    public static ValidarYConfirmarAlerta conMensaje(String mensajeEsperado) {
        return new ValidarYConfirmarAlerta(mensajeEsperado);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(AlertaSweetUI.TITULO_ALERTA, isVisible()).forNoMoreThan(10).seconds()
        );

        String mensajeObtenido = Text.of(AlertaSweetUI.TITULO_ALERTA).viewedBy(actor).asString().trim();

        if (!mensajeObtenido.equalsIgnoreCase(mensajeEsperado)) {
            throw new AssertionError("Mensaje de alerta inesperado. Se esperaba: '" + mensajeEsperado + "', pero se obtuvo: '" + mensajeObtenido + "'");
        }

        actor.attemptsTo(
                Click.on(AlertaSweetUI.BOTON_OK_ALERTA)
        );
    }
}
