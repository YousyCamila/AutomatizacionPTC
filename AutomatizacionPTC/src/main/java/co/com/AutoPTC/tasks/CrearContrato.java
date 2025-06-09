package co.com.AutoPTC.tasks;

import co.com.AutoPTC.models.DatosCrearContrato;
import co.com.AutoPTC.userinterface.CrearContratoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.AutoPTC.tasks.Esperar.unosSegundos;
import static co.com.AutoPTC.userinterface.CrearContratoPage.SELECT_DETECTIVE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CrearContrato implements Task {

    private final DatosCrearContrato datos;

    public CrearContrato(DatosCrearContrato datos) {
        this.datos = datos;
    }

    public static CrearContrato con(DatosCrearContrato datos) {
        return instrumented(CrearContrato.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Navegacion.hacia("Gestionar Contratos"),
                Click.on(CrearContratoPage.BOTON_CREAR),
                unosSegundos(1),

                Click.on(CrearContratoPage.SELECT_CLIENTE),
                WaitUntil.the(CrearContratoPage.OPCION_CLIENTE(datos.getCliente()), isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CrearContratoPage.OPCION_CLIENTE(datos.getCliente())),
                unosSegundos(01),


                Click.on(SELECT_DETECTIVE),
                Click.on(CrearContratoPage.INPUT_LUIS),

                unosSegundos(01),


                Enter.theValue(datos.getDescripcionServicio()).into(CrearContratoPage.TEXTAREA_DESCRIPCION),
                Enter.theValue(datos.getFechaInicio()).into(CrearContratoPage.INPUT_FECHA_INICIO),
                Enter.theValue(datos.getFechaCierre()).into(CrearContratoPage.INPUT_FECHA_CIERRE),

                Click.on(CrearContratoPage.SELECT_METODO_PAGO),
                WaitUntil.the(CrearContratoPage.OPCION_METODO_PAGO(datos.getMetodoPago()), isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CrearContratoPage.OPCION_METODO_PAGO(datos.getMetodoPago())),

                Click.on(CrearContratoPage.SELECT_TIPO_TARIFA),
                WaitUntil.the(CrearContratoPage.OPCION_TIPO_TARIFA(datos.getTipoTarifa()), isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CrearContratoPage.OPCION_TIPO_TARIFA(datos.getTipoTarifa())),

                Enter.theValue(datos.getTarifa()).into(CrearContratoPage.INPUT_TARIFA),
                Enter.theValue(datos.getClausulasAdicionales()).into(CrearContratoPage.TEXTAREA_CLAUSULAS),

                Click.on(CrearContratoPage.BOTON_CREAR_CONTRATO),
                unosSegundos(01),
                Click.on(CrearContratoPage.BOTON_CONFIRMACION_CONTRATO_CREADO),
                unosSegundos(02),
                Scroll.to(CrearContratoPage.ULTIMO_CONTRATO),
                unosSegundos(2)

        );
    }
}
