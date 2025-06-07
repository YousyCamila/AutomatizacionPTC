package co.com.AutoPTC.stepsdefinitions.Administrador.Cliente;

import co.com.AutoPTC.question.Administrador.Cliente.ValidacionEliminacionCliente;
import co.com.AutoPTC.tasks.Administrador.Cliente.EliminarCliente;
import co.com.AutoPTC.tasks.Administrador.Cliente.ValidarEdicionCliente;
import co.com.AutoPTC.tasks.Administrador.Cliente.ValidarEliminacionCliente;
import co.com.AutoPTC.tasks.Principal.ValidarYConfirmarAlerta;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EliminarClienteStepDefinitions {


    @Cuando("^presione el botón \"([^\"]*)\" correspondiente a un cliente activo$")
    public void presioneElBotónCorrespondienteAUnClienteActivo(String boton) {
        theActorInTheSpotlight().attemptsTo(
                EliminarCliente.ahora(),
                ValidarYConfirmarAlerta.conMensaje("Desactivado!")
        );
    }


    @Entonces("^el cliente debe aparecer con estado inactivo en la lista de clientes$")
    public void elClienteDebeAparecerConEstadoInactivoEnLaListaDeClientes() {
        theActorInTheSpotlight().attemptsTo(
                ValidarEliminacionCliente.eliminarClientePorNumeroDinamico()
        );

        theActorInTheSpotlight().should(
                seeThat(ValidacionEliminacionCliente.seMuestraClienteInactivo())
                        .orComplainWith(AssertionError.class, "El cliente no aparece como inactivo en la lista")
        );
    }

    }

