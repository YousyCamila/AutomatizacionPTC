    package co.com.AutoPTC.tasks.Administrador.Detective;

    import co.com.AutoPTC.tasks.Navegacion;
    import net.serenitybdd.screenplay.Actor;
    import net.serenitybdd.screenplay.Task;
    import net.serenitybdd.screenplay.actions.Click;
    import net.serenitybdd.core.steps.Instrumented;

    import static co.com.AutoPTC.tasks.Esperar.unosSegundos;
    import static co.com.AutoPTC.userinterface.Administrador.Detective.CreacionDetective.*;
    import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

    public class NavegarA implements Task {

        public static NavegarA laCreacionDeDetective() {
            return Instrumented.instanceOf(NavegarA.class).withProperties();
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Navegacion.hacia("Gestionar Detectives"),
                    Click.on(ABRIR_CREACION_DETECTIVES)
            );
        }
    }