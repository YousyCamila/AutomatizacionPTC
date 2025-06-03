package co.com.AutoPTC.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.core.steps.Instrumented;

import static co.com.AutoPTC.tasks.Esperar.unosSegundos;
import static co.com.AutoPTC.userinterface.CreacionDetective.*;

public class NavegarA implements Task {

    public static NavegarA laCreacionDeDetective() {
        return Instrumented.instanceOf(NavegarA.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ABRIR_OPCIONES_ADMIN),
                Click.on(ABRIR_GESTION_DETECTIVES),
                Click.on(ABRIR_CREACION_CLIENTES),
                unosSegundos(3)
        );
    }
}
