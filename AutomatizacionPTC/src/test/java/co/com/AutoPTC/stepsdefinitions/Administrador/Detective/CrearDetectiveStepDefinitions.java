package co.com.AutoPTC.stepsdefinitions.Administrador.Detective;

import co.com.AutoPTC.models.Administrador.Detective.Detective;
import co.com.AutoPTC.question.Administrador.Detective.ValidacionCrearDetective;
import co.com.AutoPTC.tasks.Administrador.Detective.CrearDetective;
import co.com.AutoPTC.tasks.Administrador.Detective.NavegarA;
import co.com.AutoPTC.utils.hooks.GeneradorDatosDinamicosDetective;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearDetectiveStepDefinitions
{
    @Dado("^que el usuario se encuentra en el formulario de creación de detective en PTC$")
    public void queElUsuarioSeEncuentraEnElFormularioDeCreacionDeDetectiveEnPTC() {
        theActorInTheSpotlight().attemptsTo(
                NavegarA.laCreacionDeDetective()
        );
    }

    @Cuando("^ingrese los datos requeridos del detective de forma aleatoria$")
    public void ingreseLosDatosRequeridosDelDetectiveDeFormaAleatoria() {

        String tipoDocumento = GeneradorDatosDinamicosDetective.generarTipoDocumento();
        String numeroDocumento = GeneradorDatosDinamicosDetective.generarDocumento(tipoDocumento);
        String nombres = GeneradorDatosDinamicosDetective.generarNombre();
        String apellidos = GeneradorDatosDinamicosDetective.generarApellido();
        String correoElectronico = GeneradorDatosDinamicosDetective.generarCorreo();
        String fechaNacimiento = GeneradorDatosDinamicosDetective.generarFechaNacimiento();
        String especialidades = GeneradorDatosDinamicosDetective.generarEspecialidad();

        Detective detective = new Detective(
                tipoDocumento,
                numeroDocumento,
                nombres,
                apellidos,
                correoElectronico,
                fechaNacimiento,
                especialidades
        );
        theActorInTheSpotlight().remember("datosDetective", detective);
        theActorInTheSpotlight().attemptsTo(CrearDetective.con(detective));
    }

    @Entonces("^se debe verificar que el cliente haya sido registrado correctamente y aparezca en la lista de detectives$")
    public void seDebeMostrarUnaConfirmacionDeCreacionExitosaDelDetective() {
        theActorInTheSpotlight().should(seeThat(ValidacionCrearDetective.esExitosa()));
    }
}
