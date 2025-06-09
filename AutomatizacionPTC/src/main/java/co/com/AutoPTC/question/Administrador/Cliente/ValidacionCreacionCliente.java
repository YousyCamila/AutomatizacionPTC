package co.com.AutoPTC.question.Administrador.Cliente;

import co.com.AutoPTC.userinterface.Administrador.Cliente.ValidarCrearCliente;
import co.com.AutoPTC.userinterface.Administrador.Cliente.ValidarEditarCliente;
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
        String numeroDocumentoEsperado = actor.recall("numeroDocumentoCliente");
        String nombreEsperado = actor.recall("nombreCliente");
        String correoEsperado = actor.recall("correoCliente");

        try {
            String numeroDocumentoEnPantalla = Text.of(ValidarCrearCliente.campoValidarDocumento_CREAR(numeroDocumentoEsperado))
                    .viewedBy(actor).asString().trim();

            String nombreEnPantalla = Text.of(ValidarCrearCliente.campoValidarNombre_CREAR(numeroDocumentoEsperado))
                    .viewedBy(actor).asString().trim();

            String correoEnPantalla = Text.of(ValidarCrearCliente.campoValidarCorreo_CREAR(numeroDocumentoEsperado))
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
