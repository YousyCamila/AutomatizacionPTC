package co.com.AutoPTC.stepsdefinitions.Administrador.Cliente;

import co.com.AutoPTC.models.Administrador.Cliente.DatosEditarCliente;
import co.com.AutoPTC.question.Administrador.Cliente.ValidacionEdicionCliente;
import co.com.AutoPTC.tasks.Administrador.Cliente.EditarCliente;
import co.com.AutoPTC.tasks.Administrador.Cliente.ValidarEdicionCliente;
import co.com.AutoPTC.tasks.Principal.ValidarYConfirmarAlerta;
import co.com.AutoPTC.utils.hooks.GeneradorDatosDinamicos;
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

        String tipoDocumento = GeneradorDatosDinamicos.generarTipoDocumento();
        String numeroDocumento = GeneradorDatosDinamicos.generarDocumento(tipoDocumento);
        String nombres = GeneradorDatosDinamicos.generarNombre();
        String apellidos = GeneradorDatosDinamicos.generarApellido();
        String correoElectronico = GeneradorDatosDinamicos.generarCorreo();

        DatosEditarCliente datosEditarCliente = new DatosEditarCliente(
                tipoDocumento,
                numeroDocumento,
                nombres,
                apellidos,
                correoElectronico
        );

        theActorInTheSpotlight().remember("datosEditados", datosEditarCliente);
        theActorInTheSpotlight().attemptsTo(
                EditarCliente.conDatos(datosEditarCliente),
                ValidarYConfirmarAlerta.conMensaje("Actualización exitosa")
        );
    }

    @Entonces("^se debe verificar que los datos del cliente hayan sido actualizados correctamente y se reflejen en la lista de clientes$")
    public void seDebeVerificarQueLosDatosDelClienteHayanSidoActualizadosCorrectamenteYSeReflejenEnLaListaDeClientes() {
        theActorInTheSpotlight().attemptsTo(
                ValidarEdicionCliente.conExito()
        );

        theActorInTheSpotlight().should(
                seeThat(ValidacionEdicionCliente.seMuestraElClienteEditado())
                        .orComplainWith(AssertionError.class, "El cliente editado no se muestra correctamente en la lista")
        );
    }


}







