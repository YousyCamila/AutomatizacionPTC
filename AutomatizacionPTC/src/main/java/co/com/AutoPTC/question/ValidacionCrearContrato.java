package co.com.AutoPTC.question;

import co.com.AutoPTC.userinterface.CrearContratoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCrearContrato implements Question<Boolean> {

    public static ValidacionCrearContrato validacionCrearContrato() {
        return new ValidacionCrearContrato();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            return CrearContratoPage.DESCRIPCION_EN_TABLA.resolveFor(actor).isVisible()
                    && CrearContratoPage.CLIENTE_EN_TABLA.resolveFor(actor).isVisible()
                    && CrearContratoPage.DETECTIVE_EN_TABLA.resolveFor(actor).isVisible();
        } catch (Exception e) {
            return false;
        }
    }
}
