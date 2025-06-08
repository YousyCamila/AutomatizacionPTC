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
        String nombreEsperado = actor.recall("nombreCliente");
        String correoEsperado = actor.recall("correoCliente");

        try {
            String numeroDocumentoEnPantalla = Text.of(ValidarEditarCliente.campoValidarDocumento(numeroDocumentoEsperado))
                    .viewedBy(actor).asString().trim();

            String nombreEnPantalla = Text.of(ValidarEditarCliente.campoValidarNombre(numeroDocumentoEsperado))
                    .viewedBy(actor).asString().trim();

            String correoEnPantalla = Text.of(ValidarEditarCliente.campoValidarCorreo(numeroDocumentoEsperado))
                    .viewedBy(actor).asString().trim();

            System.out.println("Documento esperado: " + numeroDocumentoEsperado + " | Documento en pantalla: " + numeroDocumentoEnPantalla);
            System.out.println("Nombre esperado: " + nombreEsperado + " | Nombre en pantalla: " + nombreEnPantalla);
            System.out.println("Correo esperado: " + correoEsperado + " | Correo en pantalla: " + correoEnPantalla);

            return numeroDocumentoEsperado.equalsIgnoreCase(numeroDocumentoEnPantalla)
                    && nombreEsperado.equalsIgnoreCase(nombreEnPantalla)
                    && correoEsperado.equalsIgnoreCase(correoEnPantalla);

        } catch (Exception e) {
            System.out.println("Error al validar la edición del cliente: " + e.getMessage());
            return false;
        }
    }
}
