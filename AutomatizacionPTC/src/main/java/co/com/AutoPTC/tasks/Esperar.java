package co.com.AutoPTC.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Performable;

public class Esperar {
    public static Performable unosSegundos(int segundos) {
        return new Task() {


            @Override
            public <T extends Actor> void performAs(T actor) {
                try {
                    Thread.sleep(segundos * 1000L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
    }
}
