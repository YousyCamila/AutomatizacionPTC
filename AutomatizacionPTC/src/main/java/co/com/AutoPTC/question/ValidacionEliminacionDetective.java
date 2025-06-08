package co.com.AutoPTC.question;

import co.com.AutoPTC.userinterface.ValidarEliminarDetective;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidacionEliminacionDetective implements Question<Boolean> {

    public static ValidacionEliminacionDetective seMuestraDetectiveInactivo() {
        return new ValidacionEliminacionDetective();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String nombre = Text.of(ValidarEliminarDetective.CAMPO_NOMBRE_DETECTIVE).viewedBy(actor).asString().trim();
            String cedula = Text.of(ValidarEliminarDetective.TD_NUMERO1_DOCUMENTO).viewedBy(actor).asString().trim();
            String estado = Text.of(ValidarEliminarDetective.CAMPO_ESTADO_DETECTIVE).viewedBy(actor).asString().trim();

            return nombre.equalsIgnoreCase("CAMILA GUERRA") &&
                    cedula.equalsIgnoreCase("1234568545") &&
                    estado.equalsIgnoreCase("Inactivo");

        } catch (Exception e) {
            System.out.println("Error al validar la DESACTIVACION del detective: " + e.getMessage());
            return false;
        }
    }
}
