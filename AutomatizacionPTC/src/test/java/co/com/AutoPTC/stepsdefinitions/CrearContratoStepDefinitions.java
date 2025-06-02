package co.com.AutoPTC.stepsdefinitions;

import co.com.AutoPTC.models.DatosCrearContrato;
import co.com.AutoPTC.question.ValidacionCrearContrato;
import co.com.AutoPTC.question.ValidacionFormulario;
import co.com.AutoPTC.tasks.AbrirPagina;
import co.com.AutoPTC.tasks.CrearContrato;
import co.com.AutoPTC.utils.hooks.GeneradorDatosCrearContrato;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearContratoStepDefinitions {

    @Cuando("^completa el formulario de contrato con la información requerida$")
    public void completaElFormularioDeContratoConLaInformacionRequerida(DataTable dataTable) {
        DatosCrearContrato contrato = GeneradorDatosCrearContrato.generarContratoConDescripcionAleatoria();
        theActorInTheSpotlight().attemptsTo(CrearContrato.con(contrato));
    }


    @Entonces("^se debe mostrar una confirmación de creación exitosa del contrato$")
    public void seDebeMostrarUnaConfirmacionDeCreacionExitosaDelContrato() {
        theActorInTheSpotlight().should(seeThat(ValidacionCrearContrato.validacionCrearContrato()));
    }
}
