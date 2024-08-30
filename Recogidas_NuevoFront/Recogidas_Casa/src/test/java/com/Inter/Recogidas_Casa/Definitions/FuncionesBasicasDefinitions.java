package com.Inter.Recogidas_Casa.Definitions;

import com.Inter.Recogidas_Casa.PageObjects.Recogidas_pagos;
import com.Inter.Recogidas_Casa.Steps.DiferentesPagosSteps;
import com.Inter.Recogidas_Casa.Steps.FuncionesBasicasSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import org.junit.BeforeClass;

public class FuncionesBasicasDefinitions extends PageObject {

    DiferentesPagosSteps diferentesPagosSteps = new DiferentesPagosSteps();
    FuncionesBasicasSteps funcionesBasicasSteps = new FuncionesBasicasSteps();
    Recogidas_pagos recogidas_pagos = new Recogidas_pagos();

    @BeforeClass
    public void cotizoenvio(){
        recogidas_pagos.OpenRecogidas();
        recogidas_pagos.ingresolistarrecogidas();
        diferentesPagosSteps.agregarpreenvio();
        diferentesPagosSteps.pagocobro();
    }
    @Given("El campo de ingreso de direccion destinatario")
    public void campodirecciondestinatario(){
        cotizoenvio();
        funcionesBasicasSteps.identificaciondestinatariocongeo();
    }

    @When("Ingreso direccion no georeferenciada")
    public void ingresoenviocongeo(){
        funcionesBasicasSteps.ubicaciondestinatariocongeo();
    }

    @Then("El mensaje de alerta se visualiza")
    public void geoexitosa(){
        funcionesBasicasSteps.validarmensajegeo();
    }

}
