package co.com.AutoPTC.runners.Suits;
import co.com.AutoPTC.runners.Administrador.Caso.CrearCasoRunner;
import co.com.AutoPTC.runners.Administrador.Cliente.CrearClienteRunner;
import co.com.AutoPTC.runners.Administrador.Cliente.EdicionClienteRunner;
import co.com.AutoPTC.runners.Administrador.Cliente.EliminarClienteRunner;
import co.com.AutoPTC.runners.Administrador.Detective.CrearDetectiveRunner;
import co.com.AutoPTC.runners.CrearContratoRunner;
import co.com.AutoPTC.runners.EliminarDetectiveRunner;
import co.com.AutoPTC.runners.Principal.Login.AutentificacionRunner;
import co.com.AutoPTC.runners.Principal.Registro.RegistrarseRunner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        RegistrarseRunner.class,
        AutentificacionRunner.class,
        CrearClienteRunner.class,
        EdicionClienteRunner.class,
        EliminarClienteRunner.class,
        CrearDetectiveRunner.class,
        CrearCasoRunner.class,
        EliminarDetectiveRunner.class,
        CrearContratoRunner.class
})
public class SuitPrincipal {

}
