package co.com.AutoPTC.stepsdefinitions;

import co.com.AutoPTC.models.DatosEditarCliente;
import co.com.AutoPTC.tasks.AbrirPagina;
import co.com.AutoPTC.tasks.EditarCliente;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import java.util.List;
import java.util.Map;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class EditarClienteStepDefinitons {



    @Cuando("^actualice los datos del cliente con la siguiente información$")
    public void actualiceLosDatosDelClienteConLaSiguienteInformación(DataTable arg1) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        throw new PendingException();
    }

    @Entonces("^se debe verificar que los datos del cliente hayan sido actualizados correctamente y se reflejen en la lista de clientes$")
    public void seDebeVerificarQueLosDatosDelClienteHayanSidoActualizadosCorrectamenteYSeReflejenEnLaListaDeClientes() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }



}







