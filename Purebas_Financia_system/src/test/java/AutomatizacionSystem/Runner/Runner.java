package AutomatizacionSystem.Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "pretty"
        ,features="src/test/resources/features"
        ,glue="com.inter.mouse"
        ,tags = "@Pruebas_Regresion"
)

public class Runner extends PageObject {
}
