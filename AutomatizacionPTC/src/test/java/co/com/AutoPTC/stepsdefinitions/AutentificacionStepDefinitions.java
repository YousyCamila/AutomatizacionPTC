package co.com.AutoPTC.stepsdefinitions;
import static org.hamcrest.Matchers.is;
import co.com.AutoPTC.question.ValidacionLogin;
import co.com.AutoPTC.tasks.AbrirPagina;
import co.com.AutoPTC.tasks.IniciarSesion;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutentificacionStepDefinitions {

    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion de PTC$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesionDePTC() {
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.lapagina());
    }

    @Cuando("^ingrese las credenciales correctas \\(usuario, contrasena y rol\\)$")
    public void ingreseLasCredencialesCorrectasUsuarioContrasenaYRol(DataTable datos) {
        List<Map<String, String>> data = datos.asMaps(String.class, String.class);
        String correo = data.get(0).get("correos");
        String contraseña = data.get(0).get("contraseña");
        String rol = data.get(0).get("rol");

        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.con(correo, contraseña, rol)
        );
    }
    @Entonces("^se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su panel correspondiente$")
    public void seDebeVerificarQueElUsuarioHayaSidoAutenticadoCorrectamenteYRedirigidoASuPanelCorrespondiente() {
        boolean loginExitoso = ValidacionLogin.validacionLogin().answeredBy(theActorInTheSpotlight());
        if (!loginExitoso) {
            throw new AssertionError("La autenticación no fue exitosa o el panel correspondiente no es visible.");
        }
    }
}
