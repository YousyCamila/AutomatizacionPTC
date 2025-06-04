package co.com.AutoPTC.question.Administrador.Detective;

import co.com.AutoPTC.models.Administrador.Detective.Detective;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.AutoPTC.userinterface.Administrador.Detective.CreacionDetective.*;

public class ValidacionCrearDetective implements Question<Boolean> {

    public static ValidacionCrearDetective esExitosa() {
        return new ValidacionCrearDetective();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeVisible = MENSAJE_CONFIRMACION_EXITO.resolveFor(actor).isVisible();

        

        Detective detective = actor.recall("datosDetective");

        // ✅ Aquí usamos withArguments directamente sobre el Target
        boolean existePorCedula = FILA_POR_CEDULA
                .resolveAllFor(actor)
                .stream()
                .anyMatch(elemento -> elemento.getText().contains(detective.getNumeroDocumento()));

        boolean existePorNombreApellido = FILA_POR_NOMBRE_APELLIDO
                .of(detective.getNombres(), detective.getApellidos())
                .resolveAllFor(actor)
                .size() > 0;

        return mensajeVisible && (existePorCedula || existePorNombreApellido);
    }
}
