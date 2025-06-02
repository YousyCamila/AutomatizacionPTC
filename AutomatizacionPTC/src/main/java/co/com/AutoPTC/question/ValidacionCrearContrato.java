package co.com.AutoPTC.question;

import co.com.AutoPTC.utils.hooks.GeneradorDatosCrearContrato;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidacionCrearContrato implements Question<Boolean> {

    public static ValidacionCrearContrato validacionCrearContrato() {
        return new ValidacionCrearContrato();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String descripcionEsperada = GeneradorDatosCrearContrato.ultimaDescripcionGenerada;

            // Buscar la descripción en el DOM
            Target descripcionEnTabla = Target.the("descripcion recién creada")
                    .locatedBy("//*[contains(text(),'" + descripcionEsperada + "')]");

            return descripcionEnTabla.resolveFor(actor).isVisible();
        } catch (Exception e) {
            return false;
        }
    }
}
