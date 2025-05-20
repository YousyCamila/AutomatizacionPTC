package co.com.AutoPTC.stepsdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class CrearClienteStepDefinitions {
    @Dado("^que el usuario se encuentra en el formulario de creación de cliente en PTC$")
    public void queElUsuarioSeEncuentraEnElFormularioDeCreaciónDeClienteEnPTC() {
        throw new PendingException();
    }

    @Cuando("^ingrese los datos requeridos del cliente$")
    public void ingreseLosDatosRequeridosDelCliente(DataTable arg1) {
        throw new PendingException();
    }

    @Entonces("^se debe verificar que el cliente haya sido registrado correctamente y aparezca en la lista de clientes$")
    public void seDebeVerificarQueElClienteHayaSidoRegistradoCorrectamenteYAparezcaEnLaListaDeClientes() {
        throw new PendingException();
    }
}
