package co.com.AutoPTC.tasks;

import co.com.AutoPTC.models.Detective;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.core.steps.Instrumented;

import static co.com.AutoPTC.tasks.Esperar.unosSegundos;
import static co.com.AutoPTC.userinterface.CreacionDetective.*; // Asegúrate de tener este paquete y la clase UserInterface con los selectores
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearDetective implements Task {

    private final Detective datos;

    public CrearDetective(Detective datos) { this.datos = datos; }

    public static CrearDetective con(Detective datos) { return instrumented(CrearDetective.class, datos); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ABRIR_DROPTWON_TIPO_DOCUMENTO),
                unosSegundos(2),
                Click.on(OPCION_TIPO_DOCUMENTO(datos.getTipoDocumento())),

                Enter.theValue(datos.getNumeroDocumento()).into(INPUT_NUMERO_DOCUMENTO),
                Enter.theValue(datos.getNombres()).into(INPUT_NOMBRES),
                Enter.theValue(datos.getApellidos()).into(INPUT_APELLIDOS),
                Enter.theValue(datos.getCorreoElectronico()).into(INPUT_CORREO_ELECTRONICO),
                Enter.theValue(datos.getFechaNacimiento()).into(INPUT_FECHA_NACIMIENTO)
        );

        for (String especialidad : datos.getEspecialidades()) {
            actor.attemptsTo(
                    Click.on(checkboxEspecialidad(especialidad))
            );
        }
        actor.attemptsTo(
                Click.on(BOTON_GUARDAR_DETECTIVE)
        );
    }
}