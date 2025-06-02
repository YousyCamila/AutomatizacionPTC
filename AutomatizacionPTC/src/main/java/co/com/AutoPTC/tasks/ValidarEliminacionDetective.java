package co.com.AutoPTC.tasks;

import co.com.AutoPTC.userinterface.ValidarEliminarDetective;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ValidarEliminacionDetective implements Task {

    public static ValidarEliminacionDetective eliminarDetectivePorNumeroDinamico() {
        return Instrumented.instanceOf(ValidarEliminacionDetective.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroDocumento = ValidarEliminarDetective.TD_NUMERO_DOCUMENTO.resolveFor(actor).getText();
        System.out.println("Número de documento detectado: " + numeroDocumento);

        actor.remember("numeroDocumentoDetective", numeroDocumento);

        actor.attemptsTo(
                Clear.field(ValidarEliminarDetective.CAMPO_BUSQUEDA_DOCUMENTO),
                Enter.theValue(numeroDocumento).into(ValidarEliminarDetective.CAMPO_BUSQUEDA_DOCUMENTO),
                Click.on(ValidarEliminarDetective.BOTON_BUSCAR_DETECTIVE)
        );
    }
}
