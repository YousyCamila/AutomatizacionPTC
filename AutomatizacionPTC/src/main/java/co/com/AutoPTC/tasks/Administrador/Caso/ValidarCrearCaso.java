package co.com.AutoPTC.tasks.Administrador.Caso;

import co.com.AutoPTC.userinterface.Administrador.Caso.CreacionCaso;
import co.com.AutoPTC.userinterface.Administrador.Caso.ValidacionCreacionCaso;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidarCrearCaso implements Task {

    public static ValidarCrearCaso conExito() {
        return Instrumented.instanceOf(ValidarCrearCaso.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        String idCaso = actor.recall("idCasoNuevo");


        actor.attemptsTo(

                Clear.field(ValidacionCreacionCaso.BTN_CAMPOBUSQUEDA),
                Enter.theValue(idCaso).into(ValidacionCreacionCaso.BTN_CAMPOBUSQUEDA),
                Click.on(ValidacionCreacionCaso.BTN_BUSCAR)
        );
    }
}
