package co.com.AutoPTC.tasks.Administrador.Caso;

import co.com.AutoPTC.models.Administrador.Caso.ModelCrearCaso;
import co.com.AutoPTC.models.Administrador.Cliente.DatosEditarCliente;
import co.com.AutoPTC.userinterface.Administrador.Caso.CreacionCaso;
import jdk.internal.org.jline.utils.ShutdownHooks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.Tasks.instrumented;

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
            Click.on (CreacionCaso.BTON_OPCION),
            Click.on(CreacionCaso.BTON_CREAR_CASO),
            Click.on(CreacionCaso.SELECT_CASO),
            Click.on(CreacionCaso.opcionTipoCaso(datos.getNombreCaso())),
            Click.on(CreacionCaso.SELECT_CLIENTE),
            Click.on(CreacionCaso.opcionNombrePersona(datos.getNombreCliente())),
            Click.on(CreacionCaso.SELECT_DETECTIVE),
            Click.on(CreacionCaso.opcionDetectivePorNombre(datos.getNombreDetective())),
            Click.on(CreacionCaso.BTN_GUARDAR)
    );

    String idCaso = Text.of(CreacionCaso.LBL_ID_CASO).viewedBy(actor).asString();
    actor.remember("idCasoNuevo", idCaso);


    actor.remember("casoNuevo", datos.getNombreCaso());
    actor.remember("clienteDelCaso", datos.getNombreCliente());
    actor.remember("detectiveDelCaso", datos.getNombreDetective());
}

}
