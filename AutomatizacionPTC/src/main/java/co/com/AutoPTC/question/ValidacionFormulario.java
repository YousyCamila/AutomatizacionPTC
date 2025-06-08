package co.com.AutoPTC.question;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebElement;
import java.util.List;
import static co.com.AutoPTC.userinterface.InicioFomulario.FILAS_TABLA;
import static jxl.biff.FormatRecord.logger;

public class ValidacionFormulario implements Question<Boolean> {

    public static ValidacionFormulario validacionFormulario() {
        return new ValidacionFormulario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {

            String nombre = actor.recall("nombreFormulario");
            String correos = actor.recall("correoFormulario");
            String telefono = actor.recall("telefonoFormulario");
            String descripcion = actor.recall("mensajeFormulario");

            List<WebElementFacade> filas = FILAS_TABLA.resolveAllFor(actor);

            for (WebElement fila : filas) {
                String textoFila = fila.getText().toLowerCase();
                if (textoFila.contains(nombre.toLowerCase()) &&
                        textoFila.contains(correos.toLowerCase()) &&
                        textoFila.contains(telefono) &&
                        textoFila.contains(descripcion.toLowerCase())) {
                    return true;
                }
            }

            logger.info("No se encontró la fila con los datos esperados.");
            return false;

        } catch (Exception e) {
            logger.info("Error en la validación del formulario y la tabla: " + e.getMessage());
            return false;
        }
    }
}
