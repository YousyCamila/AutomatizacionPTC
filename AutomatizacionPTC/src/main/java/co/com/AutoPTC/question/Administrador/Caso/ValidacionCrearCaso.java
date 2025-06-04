
package co.com.AutoPTC.question.Administrador.Caso;

        import co.com.AutoPTC.userinterface.Administrador.Caso.ValidacionCreacionCaso;
        import net.serenitybdd.screenplay.Actor;
        import net.serenitybdd.screenplay.Question;
        import net.serenitybdd.screenplay.questions.Text;

public class ValidacionCrearCaso implements Question<Boolean> {

    public static ValidacionCrearCaso seMuestraElCasoCreado() {
        return new ValidacionCrearCaso();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String casoEsperado = actor.recall("casoNuevo");
        String clienteEsperado = actor.recall("clienteDelCaso");
        String detectiveEsperado = actor.recall("detectiveDelCaso");

        try {
            String casoEnPantalla = Text.of(ValidacionCreacionCaso.CAMPO_VALIDAR_NOMBRE_CASO)
                    .viewedBy(actor).asString().trim();

            String clienteEnPantalla = Text.of(ValidacionCreacionCaso.CAMPO_VALIDAR_CLIENTE)
                    .viewedBy(actor).asString().trim();

            String detectiveEnPantalla = Text.of(ValidacionCreacionCaso.CAMPO_VALIDAR_DETECTIVE)
                    .viewedBy(actor).asString().trim();

            return casoEsperado.equalsIgnoreCase(casoEnPantalla)
                    && clienteEsperado.equalsIgnoreCase(clienteEnPantalla)
                    && detectiveEsperado.equalsIgnoreCase(detectiveEnPantalla);

        } catch (Exception e) {
            System.out.println("Error al validar la creación del caso: " + e.getMessage());
            return false;
        }
    }
}

