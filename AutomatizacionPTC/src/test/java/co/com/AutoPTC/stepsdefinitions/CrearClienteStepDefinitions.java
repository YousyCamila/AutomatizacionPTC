package co.com.AutoPTC.stepsdefinitions;

import co.com.AutoPTC.models.DatosCrearCliente;
import co.com.AutoPTC.question.ValidacionCreacionCliente;
import co.com.AutoPTC.question.ValidacionRegistro;
import co.com.AutoPTC.tasks.CrearCliente;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearClienteStepDefinitions {
    @Cuando("^ingrese los datos requeridos del cliente$")
    public void ingreseLosDatosRequeridosDelCliente(DataTable dataTable) {
        List<Map<String, String>> listaDatos = dataTable.asMaps(String.class, String.class);
        Map<String, String> datos = listaDatos.get(0);

        String tipoDocumento = datos.get("tipo de documento");
        String numeroDocumento = datos.get("número de documento");
        String nombres = datos.get("nombres");
        String apellidos = datos.get("apellidos");
        String correoElectronico = datos.get("correo electrónico");
        String fechaNacimiento = datos.get("fecha de nacimiento");

        DatosCrearCliente datosCrearCliente = new DatosCrearCliente(
                tipoDocumento,
                numeroDocumento,
                nombres,
                apellidos,
                correoElectronico,
                fechaNacimiento
        );

        theActorInTheSpotlight().attemptsTo(
                CrearCliente.conDatos(datosCrearCliente)
        );
    }

    @Entonces("^se debe verificar que el cliente haya sido registrado correctamente y aparezca en la lista de clientes$")
    public void seDebeVerificarQueElClienteHayaSidoRegistradoCorrectamenteYAparezcaEnLaListaDeClientes() {
        theActorInTheSpotlight().should(
                seeThat(ValidacionCreacionCliente.validacionCreacionCliente())
        );
    }
}
