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

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("usuario");
    }
    @Dado("^que el usuario se encuentra en la sección de edición de un cliente en PTC$")
    public void queElUsuarioSeEncuentraEnLaSecciónDeEdiciónDeUnClienteEnPTC(){
    theActorCalled("Usuario").wasAbleTo(
            AbrirPagina.lapagina()
        );
    }

    @Cuando("^actualice los datos del cliente con la siguiente información$")
    public void actualiceLosDatosDelClienteConLaSiguienteInformación(DataTable dataTable) {
        List<Map<String, String>> datos = dataTable.asMaps(String.class, String.class);

        // Como solo hay un registro, se toma el primero
        Map<String, String> fila = datos.get(0);

        DatosEditarCliente datosEditarCliente = new DatosEditarCliente(
                fila.get("tipo de documento"),
                fila.get("número de documento"),
                fila.get("nombres"),
                fila.get("apellidos"),
                fila.get("correo electrónico")
        );

        theActorInTheSpotlight().attemptsTo(
                EditarCliente.conDatos(datosEditarCliente)
        );
    }

    @Entonces("^se debe verificar que los datos del cliente hayan sido actualizados correctamente y se reflejen en la lista de clientes$")
    public void seDebeVerificarQueLosDatosDelClienteHayanSidoActualizadosCorrectamenteYSeReflejenEnLaListaDeClientes() {
        throw new PendingException();
    }
}
