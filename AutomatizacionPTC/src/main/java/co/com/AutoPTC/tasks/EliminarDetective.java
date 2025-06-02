package co.com.AutoPTC.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import co.com.AutoPTC.userinterface.EliminacionDetective;

import static co.com.AutoPTC.tasks.Esperar.unosSegundos;

public class EliminarDetective implements Task {

    public static EliminarDetective ahora() {
        return Instrumented.instanceOf(EliminarDetective.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EliminacionDetective.ABRIR_OPCIONES),
                unosSegundos(01),
                Click.on(EliminacionDetective.ABRIR_GESTIONDETECTIVES),
                unosSegundos(01),
                Click.on(EliminacionDetective.BTN_ELIMINAR),
                unosSegundos(01),
                Click.on(EliminacionDetective.BTN_ACEPTAR_ELIMINAR),
                unosSegundos(01),
                Click.on(EliminacionDetective.BTN_ACEPTAR),
                unosSegundos(03)
        );
    }

}