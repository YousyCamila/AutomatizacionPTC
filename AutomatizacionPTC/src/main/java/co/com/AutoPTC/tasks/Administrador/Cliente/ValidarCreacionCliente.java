package co.com.AutoPTC.tasks.Administrador.Cliente;

import co.com.AutoPTC.userinterface.Administrador.Cliente.ValidarCrearCliente;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class ValidarCreacionCliente implements Task {

    public static ValidarCreacionCliente con() {
        return Instrumented.instanceOf(ValidarCreacionCliente.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String numeroDocumento = actor.recall("numeroDocumentoCliente");

        actor.attemptsTo(

                Clear.field(ValidarCrearCliente.BUSCAR_CLIENTE_CREAR),
                Enter.theValue(numeroDocumento).into(ValidarCrearCliente.BUSCAR_CLIENTE_CREAR),
                Click.on(ValidarCrearCliente.BTN_BUSCAR_CLIENTE_CREAR)

        );
    }
}
