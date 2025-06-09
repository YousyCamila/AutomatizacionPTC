package co.com.AutoPTC.tasks.Administrador.Cliente;

import co.com.AutoPTC.models.DatosCrearCliente;
import co.com.AutoPTC.tasks.Principal.ValidarYConfirmarAlerta;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.AutoPTC.userinterface.Administrador.Cliente.CrearCliente.*;

public class CrearCliente implements Task {

    private final DatosCrearCliente datos;

    public CrearCliente(DatosCrearCliente datos) {
        this.datos = datos;
    }

    public static CrearCliente conDatos(DatosCrearCliente datos) {
        return Instrumented.instanceOf(CrearCliente.class).withProperties(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ABRIR_OPCIONES),
                Click.on(ABRIR_GESTIONCLIENTES),
                Click.on(BTN_CREAR_CLIENTE),

                Click.on(SELECT_TIPO_DOCUMENTO),
                Click.on(opcionTipoDocumento(datos.getTipoDocumento())),

                Click.on(INPUT_NUMERO_DOCUMENTO),
                Enter.theValue(datos.getNumeroDocumento()).into(INPUT_NUMERO_DOCUMENTO),

                Click.on(INPUT_NOMBRES),
                Enter.theValue(datos.getNombres()).into(INPUT_NOMBRES),

                Click.on(INPUT_APELLIDOS),
                Enter.theValue(datos.getApellidos()).into(INPUT_APELLIDOS),

                Click.on(INPUT_CORREO_ELECTRONICO),
                Enter.theValue(datos.getCorreoElectronico()).into(INPUT_CORREO_ELECTRONICO),

                Click.on(INPUT_FECHA_NACIMIENTO),
                Enter.theValue(datos.getFechaNacimiento()).into(INPUT_FECHA_NACIMIENTO),

                Click.on(BTN_GUARDAR_CLIENTE),

                ValidarYConfirmarAlerta.conMensaje("Creado!")
        );

        actor.remember("numeroDocumentoCliente", datos.getNumeroDocumento());
        actor.remember("nombreSoloCliente", datos.getNombres());
        actor.remember("nombreCliente", datos.getNombres() + " " + datos.getApellidos());
        actor.remember("correoCliente", datos.getCorreoElectronico());
    }
}
