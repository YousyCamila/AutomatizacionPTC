package co.com.AutoPTC.stepsdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class EditarClienteStepDefinitons {
    @Dado("^que el usuario se encuentra en la sección de edición de un cliente en PTC$")
    public void queElUsuarioSeEncuentraEnLaSecciónDeEdiciónDeUnClienteEnPTC() {
        throw new PendingException();
    }

    @Cuando("^actualice los datos del cliente con la siguiente información$")
    public void actualiceLosDatosDelClienteConLaSiguienteInformación(DataTable arg1) {
        throw new PendingException();
    }

    @Entonces("^se debe verificar que los datos del cliente hayan sido actualizados correctamente y se reflejen en la lista de clientes$")
    public void seDebeVerificarQueLosDatosDelClienteHayanSidoActualizadosCorrectamenteYSeReflejenEnLaListaDeClientes() {
        throw new PendingException();
    }
}
