package com.Inter.Recogidas_Casa.Definitions;

import com.Inter.Recogidas_Casa.PageObjects.Recogidas_pagos;
import com.Inter.Recogidas_Casa.Steps.DiferentesPagosSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import org.junit.BeforeClass;

public class DiferentesPagosDefinitions extends PageObject {

    DiferentesPagosSteps diferentesPagosSteps = new DiferentesPagosSteps();
    Recogidas_pagos recogidas_pagos = new Recogidas_pagos();

    @BeforeClass
    public void ingresorecogidas(){
        recogidas_pagos.OpenRecogidas();
        recogidas_pagos.ingresolistarrecogidas();
    }
    @Given("Usuario frecuente agrega un envio")
    public void ingreso_pagina(){
        ingresorecogidas();
        diferentesPagosSteps.agregarpreenvio();
    }

    @When("Ingreso cotizacion de envio de contado")
    public void datos_envios_FormaPagoContado(){diferentesPagosSteps.pagocontado();}

    @When("Ingreso cotizacion de envio al cobro")
    public void datos_envios_FormaPagoCobro(){diferentesPagosSteps.pagocobro();}

    @When("Ingreso cotizacion de envio pago en casa al contado")
    public void datos_envios_FormaPagoCasaContado(){diferentesPagosSteps.pagocasacontado();}

    @When("Ingreso cotizacion de envio pago en casa al cobro")
    public void datos_envios_FormaPagoCasaCobro(){diferentesPagosSteps.pagocasacobro();}
    @When("Ingreso cotizacion de envio convenio")
    public void datos_envios_FormaPagoConvenio(){diferentesPagosSteps.pagoconvenio();}

    @Then("El envio se crea exitosamente")
    public void envioexitoso(){diferentesPagosSteps.envioexitoso();}


}
