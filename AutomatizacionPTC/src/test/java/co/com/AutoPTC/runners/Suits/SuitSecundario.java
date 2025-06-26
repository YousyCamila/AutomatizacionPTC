package co.com.AutoPTC.runners.Suits;

import co.com.AutoPTC.runners.Administrador.Caso.CrearCasoRunner;
import co.com.AutoPTC.runners.Administrador.Cliente.CrearClienteRunner;
import co.com.AutoPTC.runners.Administrador.Cliente.EdicionClienteRunner;
import co.com.AutoPTC.runners.Administrador.Detective.CrearDetectiveRunner;
import co.com.AutoPTC.runners.Principal.Login.AutentificacionRunner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        AutentificacionRunner.class,
       CrearClienteRunner.class,
      EdicionClienteRunner.class
})
public class SuitSecundario {
}
