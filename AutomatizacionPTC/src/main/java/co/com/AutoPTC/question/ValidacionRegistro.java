package co.com.AutoPTC.question;


import co.com.AutoPTC.userinterface.ValidarRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Text;
import static jxl.biff.FormatRecord.logger;
import net.serenitybdd.screenplay.Question;

public class ValidacionRegistro implements Question<Boolean> {

    public static ValidacionRegistro validacionRegistro() {
        return new ValidacionRegistro();
    }

    @Override

    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(ValidarRegistro.IMPUT_RESPONDER).viewedBy(actor).asString();
            logger.info("Texto encontrado: " + texto);
            return "Iniciar sesión".equalsIgnoreCase(texto.trim());
        } catch (Exception e) {
            logger.info("❌ No se encontró el texto o hubo un error: " + e.getMessage());
            return false;
        }
    }
}

