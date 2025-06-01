package co.com.AutoPTC.question;

import co.com.AutoPTC.userinterface.CrearContratoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static jxl.biff.FormatRecord.logger;

public class ValidacionCrearContrato implements Question<Boolean> {

    public static ValidacionCrearContrato validacionCrearContrato() {
        return new ValidacionCrearContrato();
    }

    @Override

    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(CrearContratoPage.MENSAJE_CONFIRMACION_CONTRATO_CREADO).viewedBy(actor).asString();
            return "El contrato se ha generado exitosamente.".equals(texto);
        } catch (Exception e) {
            logger.info(" No se encontró el texto o hubo un error: " + e.getMessage());
            return false;
        }
    }
}

