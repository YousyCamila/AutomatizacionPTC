package co.com.AutoPTC.stepsdefinitions.Principal.Registro;

import co.com.AutoPTC.models.Principal.Registro.DatosRegistro;
import co.com.AutoPTC.question.Principal.Registro.ValidacionRegistro;
import co.com.AutoPTC.tasks.AbrirPagina;
import co.com.AutoPTC.tasks.Principal.Registro.Registrarse;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;


import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStepDefinitions {

    private Actor actor = Actor.named("Usuario");

    @Dado("^que el usuario se encuentra en la página de registro de PTC$")
    public void queElUsuarioSeEncuentraEnLaPáginaDeRegistroDePTC() {
        theActorCalled("Usuario").wasAbleTo(
                AbrirPagina.lapagina()
        );
    }

    @Cuando("^ingrese los datos requeridos para el registro$")
    public void ingreseLosDatosRequeridosParaElRegistro(DataTable dataTable) {
        Map<String, String> datos = dataTable.asMap(String.class, String.class);

        String nombreCompleto = datos.get("nombreCompleto");
        String email = datos.get("correoElectrónico");
        String contrasena = datos.get("contraseña");
        String confirmarContrasena = datos.get("confirmarContrasena");
        String rol = datos.get("rol");
        String codigoVerificacion = datos.get("codigoVerificacion");
        //String tipoDocumento = datos.get("tipoDocumento");
        //String numeroDocumento = datos.get("numeroDocumento");
        //String nombres = datos.get("nombres");
        //String apellidos = datos.get("apellidos");
        //String fechaNacimiento = datos.get("fechaNacimiento");

        DatosRegistro datosRegistro = new DatosRegistro(
                nombreCompleto,
                email,
                contrasena,
                confirmarContrasena,
                rol,
                codigoVerificacion
                //tipoDocumento,
                //numeroDocumento,
                //nombres,
                //apellidos,
                //fechaNacimiento
        );

        theActorInTheSpotlight().attemptsTo(
                Registrarse.conDatos(datosRegistro)
        );
    }



    @Entonces("^se debe verificar que el usuario haya sido registrado correctamente y redirigido a la página de inicio de sesión$")
    public void seDebeVerificarQueElUsuarioHayaSidoRegistradoCorrectamenteYRedirigidoALaPáginaDeInicioDeSesión() {
        theActorInTheSpotlight().should(seeThat(ValidacionRegistro.validacionRegistro()));

    }

}
