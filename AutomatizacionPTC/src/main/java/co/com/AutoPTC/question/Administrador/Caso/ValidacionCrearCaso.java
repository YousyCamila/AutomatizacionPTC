
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
            String casoEnPantalla = Text.of(ValidacionCreacionCaso.campoValidarNombreCaso(casoEsperado))
                    .viewedBy(actor).asString().trim();

            String clienteEnPantalla = Text.of(ValidacionCreacionCaso.campoValidarCliente(casoEsperado))
                    .viewedBy(actor).asString().trim();

            String detectiveEnPantalla = Text.of(ValidacionCreacionCaso.campoValidarDetective(casoEsperado))
                    .viewedBy(actor).asString().trim();


            System.out.println("casoEsperado: " + casoEsperado + " | casoEnPantalla: " + casoEnPantalla);
            System.out.println("clienteEsperado: " + clienteEsperado + " | clienteEnPantalla: " + clienteEnPantalla);
            System.out.println("detectiveEsperado: " + detectiveEsperado + " | detectiveEnPantalla: " + detectiveEnPantalla);

            return casoEsperado.equalsIgnoreCase(casoEnPantalla)
                    && clienteEsperado.equalsIgnoreCase(clienteEnPantalla)
                    && detectiveEsperado.equalsIgnoreCase(detectiveEnPantalla);

        } catch (Exception e) {
            System.out.println("Error al validar la creación del caso: " + e.getMessage());
            return false;
        }
    }
}

