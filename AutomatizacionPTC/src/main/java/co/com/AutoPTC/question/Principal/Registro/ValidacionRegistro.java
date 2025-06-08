package co.com.AutoPTC.question.Principal.Registro;


import co.com.AutoPTC.userinterface.Principal.Registro.ValidarRegistro;
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
            return "Iniciar sesión".equals(texto);
        } catch (Exception e) {
            logger.info(" No se encontró el texto o hubo un error: " + e.getMessage());
            return false;
        }
    }
}

