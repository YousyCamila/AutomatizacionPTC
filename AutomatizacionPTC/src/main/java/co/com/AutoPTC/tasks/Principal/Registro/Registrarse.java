package co.com.AutoPTC.tasks.Principal.Registro;

import co.com.AutoPTC.models.Principal.Registro.DatosRegistro;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.AutoPTC.userinterface.Principal.Registro.RegistroUsuarioPTC.*;

public class Registrarse implements Task {

    private DatosRegistro datosRegistro;

    public Registrarse(DatosRegistro datosRegistro) {
        this.datosRegistro = datosRegistro;
    }

    public static Registrarse conDatos(DatosRegistro datosRegistro) {
        return Instrumented.instanceOf(Registrarse.class).withProperties(datosRegistro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_INICIOSE),
                Click.on(BTN_REGISTRAR),
                Click.on(INPUT_NOMBRE_COMPLETO),
                Enter.theValue(datosRegistro.getNombreCompleto()).into(INPUT_NOMBRE_COMPLETO),
                Enter.theValue(datosRegistro.getEmail()).into(INPUT_EMAIL),
                Enter.theValue(datosRegistro.getContrasena()).into(INPUT_CONTRASENA),
                Enter.theValue(datosRegistro.getConfirmarContrasena()).into(INPUT_CONFIRMAR_CONTRASENA),
                Scroll.to(SELECT_ROL),
                Click.on(SELECT_ROL),
                Click.on(OPCION_ROL.of(datosRegistro.getRol())),
                Enter.theValue(datosRegistro.getCodigoVerificacion()).into(INPUT_CODIGO_VERIFICACION),
                Click.on(BOTON_REGISTRARSE)
               // Enter.theValue(datosRegistro.getTipoDocumento()).into(SELECT_TIPO_DOCUMENTO),
                //Enter.theValue(datosRegistro.getNumeroDocumento()).into(INPUT_NUMERO_DOCUMENTO),
                //Enter.theValue(datosRegistro.getNombres()).into(INPUT_NOMBRES),
                //Enter.theValue(datosRegistro.getApellidos()).into(INPUT_APELLIDOS),
                //Enter.theValue(datosRegistro.getFechaNacimiento()).into(INPUT_FECHA_NACIMIENTO),
                //Click.on(BOTON_GUARDAR)
        );
    }
}
