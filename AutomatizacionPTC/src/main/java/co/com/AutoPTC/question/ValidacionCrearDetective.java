package co.com.AutoPTC.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.AutoPTC.userinterface.CreacionDetective.MENSAJE_CONFIRMACION_EXITO;

public class ValidacionCrearDetective implements Question<Boolean> {

    public static ValidacionCrearDetective esExitosa() {
        return new ValidacionCrearDetective();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return MENSAJE_CONFIRMACION_EXITO.resolveFor(actor).isVisible();
    }
}
