package co.com.AutoPTC.tasks;

import co.com.AutoPTC.userinterface.CrearContratoPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import co.com.AutoPTC.userinterface.EliminacionDetective;

import static co.com.AutoPTC.tasks.Esperar.unosSegundos;

public class EliminarDetective implements Task {

    public static EliminarDetective ahora() {
        return Instrumented.instanceOf(EliminarDetective.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Navegacion.hacia("Gestionar Detectives"),
                Click.on(EliminacionDetective.ABRIR_BOTON_EDITAR),
                unosSegundos(01),
                Click.on(EliminacionDetective.ACTIVAR_DETECTIVE),
                unosSegundos(01),
                Click.on(EliminacionDetective.GUARDAR_CON_DETECTIVE_ACTIVO),
                unosSegundos(01),
                Click.on(EliminacionDetective.BOTON_CONFIRMAR_GUARDADO),
                unosSegundos(01),
                Click.on(EliminacionDetective.BTN_ELIMINAR),
                unosSegundos(01),
                Click.on(EliminacionDetective.BTN_ACEPTAR_ELIMINAR),
                unosSegundos(01),
                Click.on(EliminacionDetective.BTN_ACEPTAR),
                unosSegundos(02)

        );
    }
}