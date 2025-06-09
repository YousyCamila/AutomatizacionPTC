package co.com.AutoPTC.stepsdefinitions.Principal.Registro;

import co.com.AutoPTC.models.Principal.Registro.DatosRegistro;
import co.com.AutoPTC.question.Principal.Registro.ValidacionEmailEnMongo;
import co.com.AutoPTC.question.Principal.Registro.ValidacionRegistro;
import co.com.AutoPTC.tasks.AbrirPagina;
import co.com.AutoPTC.tasks.Principal.Registro.Registrarse;
import co.com.AutoPTC.utils.hooks.GenerarDatosDinamicosRegistro;
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
        String codigoVerificacion = datos.get("codigoVerificacion");
        String nombreCompleto = GenerarDatosDinamicosRegistro.generarNombreCompleto();
        String email = GenerarDatosDinamicosRegistro.generarCorreo();
        String contrasena = GenerarDatosDinamicosRegistro.generarContraseña();
        String confirmarContrasena = contrasena;
        String rol = datos.get("rol");


        DatosRegistro datosRegistro = new DatosRegistro(
                nombreCompleto,
                email,
                contrasena,
                confirmarContrasena,
                rol,
                codigoVerificacion
        );

        theActorInTheSpotlight().attemptsTo(
                Registrarse.conDatos(datosRegistro)
        );
    }



    @Entonces("^se debe verificar que el usuario haya sido registrado correctamente y redirigido a la página de inicio de sesión$")
    public void seDebeVerificarQueElUsuarioHayaSidoRegistradoCorrectamenteYRedirigidoALaPáginaDeInicioDeSesión() {
        //theActorInTheSpotlight().should(seeThat(ValidacionRegistro.validacionRegistro()));

        theActorInTheSpotlight().should(
                seeThat(ValidacionEmailEnMongo.existeEnBaseDeDatos()) // Validación en base de datos
        );

    }

}
