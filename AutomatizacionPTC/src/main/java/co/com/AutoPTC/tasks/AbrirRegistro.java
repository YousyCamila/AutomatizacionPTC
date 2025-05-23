package co.com.AutoPTC.tasks;

import co.com.AutoPTC.userinterface.InicioRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirRegistro implements Task {

    InicioRegistro inicioRegistro;

    public static AbrirRegistro lapagina() {
        return Tasks.instrumented(AbrirRegistro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(inicioRegistro));
    }
}
