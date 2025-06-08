package co.com.AutoPTC.question.Administrador.Cliente;

import co.com.AutoPTC.userinterface.ValidarCrearCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static jxl.biff.FormatRecord.logger;

public class ValidacionCreacionCliente implements Question<Boolean> {

    public static ValidacionCreacionCliente validacionCreacionCliente() {
        return new ValidacionCreacionCliente();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(ValidarCrearCliente.MENSAJE_CONFIRMACION).viewedBy(actor).asString();
            return "Registro exitoso".equals(texto);
        } catch (Exception e) {
            logger.info("No se encontró el mensaje o hubo un error: " + e.getMessage());
            return false;
        }
    }
}
