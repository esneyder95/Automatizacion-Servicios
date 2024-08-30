package com.Inter.Recogidas_Casa.Steps;

import com.Inter.Recogidas_Casa.PageObjects.IndentificacionDestinatarioPage;
import com.Inter.Recogidas_Casa.PageObjects.UbicacionDestinatarioPage;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class FuncionesBasicasSteps extends PageObject {

    IndentificacionDestinatarioPage indentificacionDestinatarioPage = new IndentificacionDestinatarioPage();
    UbicacionDestinatarioPage ubicacionDestinatarioPage = new UbicacionDestinatarioPage();
    @Step
    public void identificaciondestinatariocongeo(){
        indentificacionDestinatarioPage.identificaciondestinatario();
    }

    @Step
    public void ubicaciondestinatariocongeo(){
        ubicacionDestinatarioPage.destinatariocongeo();
    }

    @Step
    public void validarmensajegeo(){
        ubicacionDestinatarioPage.mensajegeo();
    }

}
