package co.com.AutoPTC.question.Principal;

import co.com.AutoPTC.userinterface.Principal.AlertaSweetUI;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.questions.Text;

public class ValidacionMensajeAlerta implements Question<Boolean> {

    private final String mensajeEsperado;

    public ValidacionMensajeAlerta(String mensajeEsperado) {
        this.mensajeEsperado = mensajeEsperado;
    }

    public static ValidacionMensajeAlerta esIgualA(String mensajeEsperado) {
        return new ValidacionMensajeAlerta(mensajeEsperado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String mensajeObtenido = Text.of(AlertaSweetUI.TITULO_ALERTA).viewedBy(actor).asString().trim();

            Serenity.recordReportData()
                    .withTitle("Mensaje de alerta obtenido")
                    .andContents(mensajeObtenido);

            Serenity.recordReportData()
                    .withTitle("Mensaje esperado")
                    .andContents(mensajeEsperado);

            return mensajeObtenido.equalsIgnoreCase(mensajeEsperado);

        } catch (Exception e) {
            System.out.println("Error al validar mensaje de alerta: " + e.getMessage());
            return false;
        }
    }
}
