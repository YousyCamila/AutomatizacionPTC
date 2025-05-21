package co.com.AutoPTC.stepsdefinitions;

import co.com.AutoPTC.models.CredencialesFormulario;
import co.com.AutoPTC.tasks.AbrirPagina;
import co.com.AutoPTC.tasks.PruebaFormulario;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormularioStepsDefinitions {
    @Dado("^que el usuario se encuentra en la página de contacto de PTC$")
    public void queElUsuarioSeEncuentraEnLaPáginaDeContactoDePTC() {
        theActorInTheSpotlight().attemptsTo(
                AbrirPagina.lapagina() // Asegúrate que este método abra la URL correcta
        );
    }


    @Cuando("completa el formulario con la información requerida")
    public void completaElFormularioConLaInformacionRequerida(DataTable dataTable) {
        List<CredencialesFormulario> datos = dataTable.asList(CredencialesFormulario.class);
        CredencialesFormulario contacto = datos.get(0);

        theActorInTheSpotlight().attemptsTo(
                PruebaFormulario.conDatos(contacto
                )
        );
    }



    @Cuando("^envía el formulario$")
    public void envíaElFormulario() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Entonces("^se debe mostrar una confirmación de envío exitoso del mensaje$")
    public void seDebeMostrarUnaConfirmaciónDeEnvíoExitosoDelMensaje() {
        // Write code here that turns the phrase above into concrete actions
    }

}
