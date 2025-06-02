package co.com.AutoPTC.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility; // Para verificar la visibilidad

import static co.com.AutoPTC.userinterface.InicioSesionPage.PANEL;
import java.util.logging.Logger; // Importación correcta para Logger

public class ValidacionLogin implements Question<Boolean> {
    private static final Logger logger = Logger.getLogger(ValidacionLogin.class.getName());

    public static ValidacionLogin validacionLogin() {
        return new ValidacionLogin();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            boolean isPanelVisible = Visibility.of(PANEL).viewedBy(actor).asBoolean();

            if (isPanelVisible) {
                logger.info("El elemento del panel correspondiente (PANEL) es visible. Login exitoso.");
            } else {
                logger.warning("El elemento del panel correspondiente (PANEL) NO es visible. Posible fallo en el login.");
            }
            return isPanelVisible;
        } catch (Exception e) {
            logger.severe("Ocurrió un error crítico al intentar verificar la visibilidad del PANEL: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}