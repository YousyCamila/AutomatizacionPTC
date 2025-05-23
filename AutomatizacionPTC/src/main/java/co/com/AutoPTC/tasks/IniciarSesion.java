package co.com.AutoPTC.tasks;

import co.com.AutoPTC.userinterface.InicioSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class IniciarSesion implements Task {

    private final String correo;
    private final String contraseña;
    private final String rol;

    public IniciarSesion(String correo, String contraseña, String rol) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public static IniciarSesion con(String correo, String contraseña, String rol) {
        return Tasks.instrumented(IniciarSesion.class, correo, contraseña, rol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(InicioSesionPage.LOGIN_PAGE),
                Enter.theValue(correo).into(InicioSesionPage.INPUT_USUARIO),
                Enter.theValue(contraseña).into(InicioSesionPage.INPUT_CONTRASENA),
                Click.on(InicioSesionPage.DROPDOWN_ROL),
                Click.on(InicioSesionPage.OPCION_ROL(rol)),
                Click.on(InicioSesionPage.BOTON_INGRESAR)
        );
    }
}

