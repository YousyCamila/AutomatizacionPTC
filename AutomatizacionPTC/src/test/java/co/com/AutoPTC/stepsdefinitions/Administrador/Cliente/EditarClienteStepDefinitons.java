package co.com.AutoPTC.stepsdefinitions.Administrador.Cliente;

import co.com.AutoPTC.models.Administrador.Cliente.DatosEditarCliente;
import co.com.AutoPTC.question.Administrador.Cliente.ValidacionEdicionCliente;
import co.com.AutoPTC.tasks.Administrador.Cliente.EditarCliente;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;
import java.util.Map;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class EditarClienteStepDefinitons {




    @Cuando("^actualice los datos del cliente con la siguiente información$")
    public void actualiceLosDatosDelClienteConLaSiguienteInformación(DataTable dataTable) {
        List<Map<String, String>> listaDatos = dataTable.asMaps(String.class, String.class);
        Map<String, String> datos = listaDatos.get(0);

        String tipoDocumento = datos.get("tipo de documento");
        String numeroDocumento = datos.get("número de documento");
        String nombres = datos.get("nombres");
        String apellidos = datos.get("apellidos");
        String correoElectronico = datos.get("correo electrónico");

        DatosEditarCliente datosEditarCliente = new DatosEditarCliente(
                tipoDocumento,
                numeroDocumento,
                nombres,
                apellidos,
                correoElectronico
        );

        theActorInTheSpotlight().attemptsTo(
                EditarCliente.conDatos(datosEditarCliente)
        );
    }



    @Entonces("^se debe verificar que los datos del cliente hayan sido actualizados correctamente y se reflejen en la lista de clientes$")
    public void seDebeVerificarQueLosDatosDelClienteHayanSidoActualizadosCorrectamenteYSeReflejenEnLaListaDeClientes() {
       theActorInTheSpotlight().should(seeThat(ValidacionEdicionCliente.validacionEdicionCliente()));
    }


}







