package co.com.AutoPTC.tasks;

import co.com.AutoPTC.models.CredencialesFormulario;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.AutoPTC.userinterface.InicioFomulario.*;


public class PruebaFormulario implements Task {

    private final CredencialesFormulario credencial;

    public PruebaFormulario(CredencialesFormulario credencial) {
        this.credencial = credencial;
    }

    public static PruebaFormulario conDatos(CredencialesFormulario credencial) {
        return Instrumented.instanceOf(PruebaFormulario.class).withProperties(credencial);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(INPUT_Contactanos),

                Click.on(INPUT_USUARIO),
                Enter.theValue(credencial.getNombre()).into(INPUT_USUARIO),
                Click.on(INPUT_EMAIL),
                Enter.theValue(credencial.getCorreo()).into(INPUT_EMAIL),
                Click.on(INPUT_TEFONO),
                Enter.theValue(credencial.getTelefono()).into(INPUT_TEFONO),
                Click.on(INPUT_DESCRIBIR),
                Enter.theValue(credencial.getMensaje()).into(INPUT_DESCRIBIR),
                Click.on(BTN_INICIOSESION)
        );
    }
}
