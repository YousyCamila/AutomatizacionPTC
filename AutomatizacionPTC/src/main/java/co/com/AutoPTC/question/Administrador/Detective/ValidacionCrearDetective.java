package co.com.AutoPTC.question.Administrador.Detective;

import co.com.AutoPTC.models.Administrador.Detective.Detective;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;

import java.util.List;

import static co.com.AutoPTC.userinterface.Administrador.Detective.CreacionDetective.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacionCrearDetective implements Question<Boolean> {

    public static ValidacionCrearDetective esExitosa() {
        return new ValidacionCrearDetective();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println("DEBUG: Iniciando la validación de creación de detective exitosa.");

        boolean mensajeVisible = MENSAJE_CONFIRMACION_EXITO.resolveFor(actor).isVisible();
        System.out.println("DEBUG: ¿Mensaje de confirmación de éxito visible? " + mensajeVisible);

        Detective detective = actor.recall("datosDetective");
        if (detective != null) {
            System.out.println("DEBUG: Datos del detective recordados:");
            System.out.println("DEBUG:   Nombre: " + detective.getNombres());
            System.out.println("DEBUG:   Apellido: " + detective.getApellidos());
            System.out.println("DEBUG:   Documento: " + detective.getNumeroDocumento());
        } else {
            System.err.println("ERROR: No se pudieron recordar los datos del detective. 'datosDetective' es nulo.");
            return false;
        }

        actor.attemptsTo(
                WaitUntil.the(BOTON_OK, isVisible()).forNoMoreThan(8).seconds(),
                WaitUntil.the(BOTON_OK, isEnabled()).forNoMoreThan(8).seconds(),
                Click.on(BOTON_OK)
        );
        System.out.println("DEBUG: Se hizo clic en el botón OK de la confirmación.");

        String nombreParaBusqueda = detective.getNombres().toUpperCase();
        actor.attemptsTo(
                WaitUntil.the(CAMPO_BUSQUEDA, isEnabled()).forNoMoreThan(8).seconds(),
                Enter.theValue(nombreParaBusqueda).into(CAMPO_BUSQUEDA)
        );
        System.out.println("DEBUG: Se esperó al campo de búsqueda y se ingresó el nombre '" + nombreParaBusqueda + "'.");

        actor.attemptsTo(
                Click.on(BUSCAR)
        );
        System.out.println("DEBUG: Se hizo clic en el botón Buscar.");

        String numeroDocumentoUpper = detective.getNumeroDocumento().toUpperCase();
        String nombresUpper = detective.getNombres().toUpperCase();
        String apellidosUpper = detective.getApellidos().toUpperCase();


        List<WebElementFacade> elementosPorCedula = FILA_POR_CEDULA
                .of(numeroDocumentoUpper)
                .resolveAllFor(actor);

        boolean existePorCedula = elementosPorCedula.stream()
                .anyMatch(elemento -> {
                    String textoElemento = elemento.getText();
                    System.out.println("DEBUG: Texto de elemento evaluado para Cédula: '" + textoElemento + "'");
                    return textoElemento.contains(numeroDocumentoUpper);
                });
        System.out.println("DEBUG: ¿Detective encontrado por Cédula (" + numeroDocumentoUpper + ")? " + existePorCedula);
        System.out.println("DEBUG: Cantidad de elementos encontrados por Cédula: " + elementosPorCedula.size());

        List<WebElementFacade> elementosPorNombreApellido = FILA_POR_NOMBRE_APELLIDO_EN_UNA_CELDA
                .of(nombresUpper, apellidosUpper)
                .resolveAllFor(actor);

        boolean existePorNombreApellido = elementosPorNombreApellido.size() > 0;
        System.out.println("DEBUG: ¿Detective encontrado por Nombre y Apellido unificados ('" + nombresUpper + " " + apellidosUpper + "')? " + existePorNombreApellido);
        System.out.println("DEBUG: Cantidad de elementos encontrados por Nombre y Apellido: " + elementosPorNombreApellido.size());
        if (!elementosPorNombreApellido.isEmpty()) {
            for (WebElement elemento : elementosPorNombreApellido) {
                System.out.println("DEBUG: Texto de elemento evaluado para Nombre/Apellido: '" + elemento.getText() + "'");
            }
        }

        boolean resultadoFinal = mensajeVisible && (existePorCedula || existePorNombreApellido);
        System.out.println("DEBUG: Resultado final de la validación de creación de detective: " + resultadoFinal);

        return resultadoFinal;
    }
}