package com.inter.mouse.Steps;

import com.inter.mouse.PageObjects.ListarRecogidasPage;
import com.inter.mouse.PageObjects.UrlPortalPage;
import net.thucydides.core.annotations.Step;

public class DiferentesPagosSteps {

    ListarRecogidasPage listarRecogidasPage = new ListarRecogidasPage();
    UrlPortalPage urlPortalPage = new UrlPortalPage();

    @Step
    public void agregarpreenvio(){listarRecogidasPage.listarecogidas();
    }

    @Step
    public void portalclientes(){
        urlPortalPage.openportalclientes();
        urlPortalPage.iniciosesion();
    }

}
