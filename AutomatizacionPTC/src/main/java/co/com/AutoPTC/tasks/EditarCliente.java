package co.com.AutoPTC.tasks;

import co.com.AutoPTC.models.DatosEditarCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.core.steps.Instrumented;

import static co.com.AutoPTC.userinterface.EdicionCliente.*;

public class EditarCliente implements Task {

    private final DatosEditarCliente datos;

    public EditarCliente(DatosEditarCliente datos) {
        this.datos = datos;
    }

    public static EditarCliente conDatos(DatosEditarCliente datos) {
        return Instrumented.instanceOf(EditarCliente.class).withProperties(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ABRIR_OPCIONES),
                Click.on(ABRIR_GESTIONCLIENTES),
                Click.on(BTN_EDITAR_CLIENTE),

                Click.on(SELECT_TIPO_DOCUMENTO),
                Click.on(opcionTipoDocumento(datos.getTipoDocumento())),

                Enter.theValue(datos.getNumeroDocumento()).into(INPUT_NUMERO_DOCUMENTO),
                Enter.theValue(datos.getNombres()).into(INPUT_NOMBRES),
                Enter.theValue(datos.getApellidos()).into(INPUT_APELLIDOS),
                Enter.theValue(datos.getCorreoElectronico()).into(INPUT_CORREO_ELECTRONICO),

                Click.on(BOTON_GUARDAR_CAMBIOS)
        );
    }
}
