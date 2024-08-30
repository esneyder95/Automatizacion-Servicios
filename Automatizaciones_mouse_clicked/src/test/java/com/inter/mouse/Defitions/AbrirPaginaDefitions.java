package com.inter.mouse.Defitions;

import com.inter.mouse.PageObjects.AbrirUrlPage;
import com.inter.mouse.Steps.DiferentesPagosSteps;
import io.cucumber.java.en.Given;
import net.serenitybdd.core.pages.PageObject;

public class AbrirPaginaDefitions extends PageObject {

    AbrirUrlPage abrirUrl = new AbrirUrlPage();
    DiferentesPagosSteps diferentesPagosSteps = new DiferentesPagosSteps();

    int i = 0;

    @Given("Usuario frecuente agrega un envio")
    public void ingresopagina(){
        while (i == 0) {
            abrirUrl.openrecogidas();
            abrirUrl.ingresolistarrecogidas();
            diferentesPagosSteps.agregarpreenvio();
            diferentesPagosSteps.portalclientes();
        }
    }

}
