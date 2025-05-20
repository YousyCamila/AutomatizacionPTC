package co.com.AutoPTC.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/editar_cliente_ptc.feature",
        glue = {"co.com.AutoPTC.stepsdefinitions", "co.com.AutoPTC.utils.hooks"},
        snippets = SnippetType.CAMELCASE)

public class EditarClienteRunner {
}
