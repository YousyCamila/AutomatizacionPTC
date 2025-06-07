package co.com.AutoPTC.tasks.Administrador.Cliente;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.AutoPTC.userinterface.Administrador.Cliente.EdicionCliente.ABRIR_GESTIONCLIENTES;
import static co.com.AutoPTC.userinterface.Administrador.Cliente.EdicionCliente.ABRIR_OPCIONES;
import static co.com.AutoPTC.userinterface.Administrador.Cliente.EliminacionCliente.*;


public class EliminarCliente implements Task {

    public static EliminarCliente ahora() {
        return Instrumented.instanceOf(EliminarCliente.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ABRIR_OPCIONES),
                Click.on(ABRIR_GESTIONCLIENTES),
                Click.on(botonEliminarClienteActivo()),
                //Click.on(BTN_ELIMINAR),
                Click.on(BTN_ACEPTAR_ELIMINAR)
                //Click.on(BTN_ACEPTAR)
        );

        String numeroDocumento = numeroDocumentoClienteActivo().resolveFor(actor).getText();
        actor.remember("numeroDocumentoCliente", numeroDocumento);
    }
}

