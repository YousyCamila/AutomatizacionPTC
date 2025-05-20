package co.com.AutoPTC.stepsdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class RegistroStepDefinitions {

    @Dado("^que el usuario se encuentra en la página de registro de PTC$")
    public void queElUsuarioSeEncuentraEnLaPáginaDeRegistroDePTC() {
        throw new PendingException();
    }

    @Cuando("^ingrese los datos requeridos para el registro$")
    public void ingreseLosDatosRequeridosParaElRegistro(DataTable arg1) {
        throw new PendingException();
    }

    @Entonces("^se debe verificar que el usuario haya sido registrado correctamente y redirigido a la página de inicio de sesión$")
    public void seDebeVerificarQueElUsuarioHayaSidoRegistradoCorrectamenteYRedirigidoALaPáginaDeInicioDeSesión() {

        throw new PendingException();
    }

}
