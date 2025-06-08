package co.com.AutoPTC.stepsdefinitions.Administrador.Cliente;

import co.com.AutoPTC.models.DatosCrearCliente;
import co.com.AutoPTC.question.Administrador.Cliente.ValidacionCreacionCliente;

import co.com.AutoPTC.tasks.Administrador.Cliente.CrearCliente;
import co.com.AutoPTC.utils.hooks.GeneradorDatosDinamicosCliente;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearClienteStepDefinitions {
    @Cuando("^ingrese los datos requeridos del cliente$")
    public void ingreseLosDatosRequeridosDelDetectiveDeFormaAleatoria() {

        String tipoDocumento = GeneradorDatosDinamicosCliente.generarTipoDocumento();
        String numeroDocumento = GeneradorDatosDinamicosCliente.generarDocumento(tipoDocumento);
        String nombres = GeneradorDatosDinamicosCliente.generarNombre();
        String apellidos = GeneradorDatosDinamicosCliente.generarApellido();
        String correoElectronico = GeneradorDatosDinamicosCliente.generarCorreo();
        String fechaNacimiento = GeneradorDatosDinamicosCliente.generarFechaNacimiento();

        DatosCrearCliente datosCrearCliente = new DatosCrearCliente(
                tipoDocumento,
                numeroDocumento,
                nombres,
                apellidos,
                correoElectronico,
                fechaNacimiento
        );
        theActorInTheSpotlight().remember("datosCliente", datosCrearCliente);
        theActorInTheSpotlight().attemptsTo(CrearCliente.conDatos(datosCrearCliente));    }

    @Entonces("^se debe verificar que el cliente haya sido registrado correctamente y aparezca en la lista de clientes$")
    public void seDebeVerificarQueElClienteHayaSidoRegistradoCorrectamenteYAparezcaEnLaListaDeClientes() {
        theActorInTheSpotlight().should(
                seeThat(ValidacionCreacionCliente.validacionCreacionCliente())
        );
    }
}
