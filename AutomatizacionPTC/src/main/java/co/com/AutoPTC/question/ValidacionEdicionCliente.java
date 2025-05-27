package co.com.AutoPTC.question;

import co.com.AutoPTC.userinterface.ValidarEditarCliente;
import co.com.AutoPTC.userinterface.ValidarRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static jxl.biff.FormatRecord.logger;

public class ValidacionEdicionCliente implements Question<Boolean> {

    public static ValidacionEdicionCliente validacionEdicionCliente() {
        return new ValidacionEdicionCliente();
    }

    @Override

    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(ValidarEditarCliente.MENSAJE_CONFIRMACION).viewedBy(actor).asString();
            return "Actualización exitosa".equals(texto);
        } catch (Exception e) {
            logger.info(" No se encontró el texto o hubo un error: " + e.getMessage());
            return false;
        }
    }
}

