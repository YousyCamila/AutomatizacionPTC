package co.com.AutoPTC.question;
import static co.com.AutoPTC.userinterface.InicioFomulario.MENSAJE_FORMULARIO;
import static jxl.biff.FormatRecord.logger;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidacionFormulario implements Question<Boolean> {

    public static ValidacionFormulario validacionFormulario() {
        return new ValidacionFormulario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJE_FORMULARIO).viewedBy(actor).asString();
            return "Formulario Enviado".equals(texto);
        } catch (Exception e) {
            logger.info(" Error");
            return false;
        }
    }
}