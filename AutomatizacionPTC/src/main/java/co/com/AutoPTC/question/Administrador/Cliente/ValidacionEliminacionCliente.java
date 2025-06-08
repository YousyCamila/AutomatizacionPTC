package co.com.AutoPTC.question.Administrador.Cliente;

import co.com.AutoPTC.userinterface.Administrador.Cliente.ValidarEliminarCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidacionEliminacionCliente implements Question<Boolean> {

    public static ValidacionEliminacionCliente seMuestraClienteInactivo() {
        return new ValidacionEliminacionCliente();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String estadoCliente = Text.of(ValidarEliminarCliente.CAMPO_VALIDAR_ELI)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            return estadoCliente.equalsIgnoreCase("Inactivo");

        } catch (Exception e) {
            System.out.println("Error al validar la eliminación del cliente: " + e.getMessage());
            return false;
        }
    }
}
