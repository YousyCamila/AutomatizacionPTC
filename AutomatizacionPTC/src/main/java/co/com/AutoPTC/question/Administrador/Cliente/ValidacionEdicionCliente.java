package co.com.AutoPTC.question.Administrador.Cliente;

import co.com.AutoPTC.userinterface.Administrador.Cliente.ValidarEditarCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidacionEdicionCliente implements Question<Boolean> {

    public static ValidacionEdicionCliente seMuestraElClienteEditado() {
        return new ValidacionEdicionCliente();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroDocumentoEsperado = actor.recall("numeroDocumentoCliente");

        try {
            String numeroDocumentoEnTabla = Text.of(ValidarEditarCliente.CAMPO_VALIDAR)
                    .viewedBy(actor)
                    .asString()
                    .trim();
            return numeroDocumentoEsperado.equals(numeroDocumentoEnTabla);

        } catch (Exception e) {
            System.out.println("Error al validar la edición del cliente: " + e.getMessage());
            return false;
        }
    }
}
