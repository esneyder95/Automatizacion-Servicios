package org.servicios.ListaRestricitiva.Runner;

import static org.junit.Assert.assertTrue;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"}
        ,features="src/test/resources/features"
        ,glue="org.servicios.ListaRestricitiva"
        ,tags = "@ListaR_PagosEnvios"
)

public class Runner {

}
