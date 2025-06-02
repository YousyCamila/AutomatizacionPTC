package co.com.AutoPTC.stepsdefinitions;

import co.com.AutoPTC.question.ValidacionEliminacionDetective;
import co.com.AutoPTC.tasks.EliminarDetective;
import co.com.AutoPTC.tasks.ValidarEliminacionDetective;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import co.com.AutoPTC.tasks.ValidarEliminacionDetective;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EliminarDetectiveStepDefinitions {

    @Cuando("^presione el botón \"([^\"]*)\" correspondiente a un detective activo$")
    public void presioneElBotonCorrespondienteAUnDetectiveActivo(String boton) {
        theActorInTheSpotlight().attemptsTo(
                EliminarDetective.ahora()
        );
    }

    @Entonces("^el detective debe aparecer con estado inactivo en la lista de detectives$")
    public void elDetectiveDebeAparecerConEstadoInactivoEnLaListaDeDetectives() {
        theActorInTheSpotlight().attemptsTo(
                ValidarEliminacionDetective.eliminarDetectivePorNumeroDinamico()
        );

        theActorInTheSpotlight().should(
                seeThat(ValidacionEliminacionDetective.seMuestraDetectiveInactivo())
                        .orComplainWith(AssertionError.class, "El detective no aparece como inactivo en la lista")
        );
    }



}
