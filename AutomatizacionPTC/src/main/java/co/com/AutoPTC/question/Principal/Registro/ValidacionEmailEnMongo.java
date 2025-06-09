package co.com.AutoPTC.question.Principal.Registro;

import co.com.AutoPTC.utils.hooks.ConexionMongoAtlas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionEmailEnMongo implements Question<Boolean> {

    public static ValidacionEmailEnMongo existeEnBaseDeDatos() {
        return new ValidacionEmailEnMongo();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String email = actor.recall("emailRegistrado"); // recuperar desde memoria
        return ConexionMongoAtlas.existeUsuarioPorCorreo(email);
    }
}