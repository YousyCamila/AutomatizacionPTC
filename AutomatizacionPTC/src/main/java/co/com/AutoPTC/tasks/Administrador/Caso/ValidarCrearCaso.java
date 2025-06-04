package co.com.AutoPTC.tasks.Administrador.Caso;

import co.com.AutoPTC.tasks.Administrador.Caso.CrearCaso;
import co.com.AutoPTC.userinterface.Administrador.Caso.ValidacionCreacionCaso;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class ValidarCrearCaso implements Task {

    public static ValidarCrearCaso conExito() {
        return Instrumented.instanceOf(ValidarCrearCaso.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //String nuevoCaso = actor.recall("casoNuevo");
        //String cliente = actor.recall("clienteDelCaso");
        //String detective = actor.recall("detectiveDelCaso");
        String idCaso = actor.recall("idCasoNuevo");


        actor.attemptsTo(
                Click.on(ValidacionCreacionCaso.BTN_ACEPTAR),
                Clear.field(ValidacionCreacionCaso.BTN_CAMPOBUSQUEDA ),
                Enter.theValue(idCaso).into(ValidacionCreacionCaso.BTN_CAMPOBUSQUEDA),
                Click.on(ValidacionCreacionCaso.BTN_BUSCAR)
        );
    }
}
