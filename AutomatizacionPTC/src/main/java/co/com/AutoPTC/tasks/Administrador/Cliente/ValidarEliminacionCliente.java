package co.com.AutoPTC.tasks.Administrador.Cliente;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import co.com.AutoPTC.userinterface.Administrador.Cliente.ValidarEliminarCliente;

import static co.com.AutoPTC.userinterface.Administrador.Cliente.ValidarEliminarCliente.*;

public class ValidarEliminacionCliente implements Task {

    public static ValidarEliminacionCliente eliminarClientePorNumeroDinamico() {
        return Instrumented.instanceOf(ValidarEliminacionCliente.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroDocumento = TD_NUMERO_DOCUMENTO.resolveFor(actor).getText();

        actor.remember("numeroDocumentoCliente", numeroDocumento);

        actor.attemptsTo(
                Click.on(BUSCAR_CLIENTE_ELI),
                Clear.field(BUSCAR_CLIENTE_ELI),
                Enter.theValue(numeroDocumento).into(BUSCAR_CLIENTE_ELI),
                Click.on(BTN_BUSCAR_CLIENTE_ELI)
        );
    }
}

