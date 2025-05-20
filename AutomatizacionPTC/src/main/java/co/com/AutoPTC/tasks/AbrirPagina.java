package co.com.AutoPTC.tasks;

import co.com.AutoPTC.userinterface.InicioPTC;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    InicioPTC inicioPTC;

    public static AbrirPagina lapagina(){return Tasks.instrumented(AbrirPagina.class);}

    @Override

    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(inicioPTC));
    }
}
