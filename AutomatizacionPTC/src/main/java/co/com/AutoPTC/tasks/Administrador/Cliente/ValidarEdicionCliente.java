package co.com.AutoPTC.tasks.Administrador.Cliente;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.core.steps.Instrumented;

import static co.com.AutoPTC.userinterface.Administrador.Cliente.ValidarEditarCliente.*;

public class ValidarEdicionCliente implements Task {

    public static ValidarEdicionCliente conExito() {
        return Instrumented.instanceOf(ValidarEdicionCliente.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String numeroDocumento = actor.recall("numeroDocumentoCliente");

        actor.attemptsTo(
                Click.on(BTN_ACEPTAR),
                Clear.field(BUSCAR_CLIENTE),
                Enter.theValue(numeroDocumento).into(BUSCAR_CLIENTE),
                Click.on(BTN_BUSCAR_CLIENTE)

        );
    }
}
