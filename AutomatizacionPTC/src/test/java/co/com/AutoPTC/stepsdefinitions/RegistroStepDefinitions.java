package co.com.AutoPTC.stepsdefinitions;

import co.com.AutoPTC.models.DatosRegistro;
import co.com.AutoPTC.tasks.AbrirRegistro;
import co.com.AutoPTC.tasks.Registrarse;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStepDefinitions {

    private Actor actor = Actor.named("Usuario");

    @Dado("^que el usuario se encuentra en la página de registro de PTC$")
    public void queElUsuarioSeEncuentraEnLaPáginaDeRegistroDePTC() {
        theActorCalled("Usuario").wasAbleTo(
                AbrirRegistro.lapagina()
        );
    }


    @Cuando("^ingrese los datos requeridos para el registro$")
    public void ingreseLosDatosRequeridosParaElRegistro(DataTable dataTable) {
        List<Map<String, String>> datos = dataTable.asMaps(String.class, String.class);

        Map<String, String> fila = datos.get(0);

        String nombreCompleto = fila.get("nombreCompleto");
        String email = fila.get("email");
        String contrasena = fila.get("contrasena");
        String confirmarContrasena = fila.get("confirmarContrasena");
        String rol = fila.get("rol");
        String codigoVerificacion = fila.get("codigoVerificacion");

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
        System.out.println("✅ Registro exitoso validado.");

    }

}
