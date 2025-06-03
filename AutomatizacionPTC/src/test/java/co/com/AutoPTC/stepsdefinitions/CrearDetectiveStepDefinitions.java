package co.com.AutoPTC.stepsdefinitions;

import co.com.AutoPTC.models.DatosCrearContrato;
import co.com.AutoPTC.models.Detective;
import co.com.AutoPTC.question.ValidacionCrearContrato;
import co.com.AutoPTC.question.ValidacionCrearDetective;
import co.com.AutoPTC.tasks.CrearContrato;
import co.com.AutoPTC.tasks.CrearDetective;
import co.com.AutoPTC.tasks.NavegarA;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearDetectiveStepDefinitions
{
    @Dado("^que el usuario se encuentra en el formulario de creación de detective en PTC$")
    public void queElUsuarioSeEncuentraEnElFormularioDeCreacionDeDetectiveEnPTC() {
        theActorInTheSpotlight().attemptsTo(
                NavegarA.laCreacionDeDetective()
        );
    }

    @Cuando("^ingrese los datos requeridos del detective$")
    public void completaElFormularioDeDetectiveConLaInformacionRequerida(DataTable dataTable) {List<Detective> datos = dataTable.asList(Detective.class);
        Detective detective = datos.get(0);
        theActorInTheSpotlight().attemptsTo(CrearDetective.con(detective));
    }

    @Entonces("^se debe verificar que el cliente haya sido registrado correctamente y aparezca en la lista de detectives$")
    public void seDebeMostrarUnaConfirmacionDeCreacionExitosaDelDetective() {
        theActorInTheSpotlight().should(seeThat(ValidacionCrearDetective.esExitosa()));
    }
}
