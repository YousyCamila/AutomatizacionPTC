package co.com.AutoPTC.stepsdefinitions.Administrador.Caso;

import co.com.AutoPTC.models.Administrador.Caso.ModelCrearCaso;
import co.com.AutoPTC.tasks.Administrador.Caso.CrearCaso;
import co.com.AutoPTC.utils.hooks.GeneradorDatosCrearCaso;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class CrearCasoStepDefinitions {

    @Cuando("^registre los datos del cliente con la siguiente información$")
    public void registreLosDatosDelClienteConLaSiguienteInformación(DataTable dataTable) {

        ModelCrearCaso datosAleatorios = GeneradorDatosCrearCaso.generarDatosAleatorios();


        OnStage.theActorInTheSpotlight().remember("datosCaso", datosAleatorios);


        OnStage.theActorInTheSpotlight().attemptsTo(
                CrearCaso.con(datosAleatorios)
        );
    }

    @Entonces("^se debe verificar que los datos del caso hayan sido registrados correctamente y se reflejen en la lista de casos$")
    public void seDebeVerificarQueLosDatosDelCasoHayanSidoRegistradosCorrectamenteYSeReflejenEnLaListaDeCasos() {

        throw new PendingException();
    }

}
