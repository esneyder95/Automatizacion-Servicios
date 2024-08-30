package com.Inter.Recogidas_Casa.Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"}
        ,features="src/test/resources/features"
        ,glue="com.Inter.Recogidas_Casa"
        ,tags = "@Pruebas_Regresion"
)

public class RunnerRecogidas {

}
