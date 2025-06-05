package co.com.AutoPTC.tasks.Administrador.Caso;

import co.com.AutoPTC.models.Administrador.Caso.ModelCrearCaso;
import co.com.AutoPTC.models.Administrador.Cliente.DatosEditarCliente;
import co.com.AutoPTC.userinterface.Administrador.Caso.CreacionCaso;
import co.com.AutoPTC.userinterface.Administrador.Caso.ValidacionCreacionCaso;
import jdk.internal.org.jline.utils.ShutdownHooks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CrearCaso implements Task {

private final ModelCrearCaso datos;

    public CrearCaso(ModelCrearCaso datos) {
        this.datos = datos;
    }

public static CrearCaso con(ModelCrearCaso datos){
    return instrumented(CrearCaso.class,datos);
}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CreacionCaso.BTON_OPCIONES),
                Click.on(CreacionCaso.BTON_OPCION),
                Click.on(CreacionCaso.BTON_CREAR_CASO),
                Click.on(CreacionCaso.SELECT_CASO),
                Click.on(CreacionCaso.opcionTipoCaso(datos.getNombreCaso())),
                Click.on(CreacionCaso.SELECT_CLIENTE),
                Click.on(CreacionCaso.opcionNombrePersona(datos.getNombreCliente())),
                Click.on(CreacionCaso.SELECT_DETECTIVE),
                Click.on(CreacionCaso.opcionDetectivePorNombre(datos.getNombreDetective())),
                Click.on(CreacionCaso.BTN_GUARDAR),
                Click.on(ValidacionCreacionCaso.BTN_ACEPTAR)
        );

        // Espera explícita para el ID que aparece solo luego de guardar
        actor.attemptsTo(
                WaitUntil.the(CreacionCaso.LBL_ID_CASO, isVisible()).forNoMoreThan(15).seconds()
        );

        // Captura el ID ya visible y con texto
        String idCaso = Text.of(CreacionCaso.LBL_ID_CASO).viewedBy(actor).asString().trim();

        // Verificación simple para evitar ID vacío
        if(idCaso.isEmpty()){
            throw new AssertionError("No se pudo capturar el ID del caso creado.");
        }

        System.out.println("ID capturado después de crear el caso: " + idCaso);

        actor.remember("idCasoNuevo", idCaso);

        actor.remember("casoNuevo", datos.getNombreCaso());
        actor.remember("clienteDelCaso", datos.getNombreCliente());
        actor.remember("detectiveDelCaso", datos.getNombreDetective());
    }
}