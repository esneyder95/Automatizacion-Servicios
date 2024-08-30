package org.servicios.ListaRestricitiva.Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import org.servicios.ListaRestricitiva.Steps.Stepsservicios;

public class Admin extends PageObject {

    Stepsservicios stepsservicios = new Stepsservicios();
    int conteo = 0;

    @Given("Admitir envios APP {}")
    public void admitirenviosAPP(int numero_guias){
        conteo = numero_guias;
        stepsservicios.stepadmisionAPP();
    }

    @Given("Admitir envios Sitio WEB {} {} {}")
    public void admitirenviosSitioWEB(long Id,long Celular,int numero_guias){
        conteo = numero_guias;
        stepsservicios.stepadmisionWEB(Id,Celular);
    }

    @When("ingresar a lista restricitiva APP")
    public void ingresarlistaAPP(){
        stepsservicios.insertarlista();
        conteo--;
        while (conteo != 0){
            admitirenviosAPP(conteo);
            stepsservicios.insertarlista();
            conteo--;
        }
    }

    @When("ingresar a lista restricitiva Sitio WEB {} {}")
    public void ingresarlistaWEB(long Id, long Telefono){
        stepsservicios.insertarlista();
        conteo--;
        while (conteo != 0){
            admitirenviosSitioWEB(Id,Telefono,conteo);
            stepsservicios.insertarlista();
            conteo--;
        }
    }

    @Then("crear excel")
    public void crearexcel(){
        stepsservicios.crearexcel();
    }

}
