package com.Inter.Recogidas_Casa.PageObjects;

import com.Inter.Recogidas_Casa.Utils.InteractorTime;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListarServiciosPage extends PageObject {

    public By cargador = By.xpath("//app-cargador/div");
    public By next = By.xpath("//a[@class='next-button hide-tablet-mobile']/img");
    public By btn_continuarservicios = By.className("btn btn-primary button-continue show-tablet-mobile");
    public By btn_primerservicio = By.xpath("//div[@class='services-cards']/ul/li");
    InteractorTime interactorTime = new InteractorTime();
    WebDriverWait tiempo = new WebDriverWait(getDriver(), 30);
    public void listarservicios(){
        try {
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
            getDriver().findElement(btn_primerservicio).click();
            try {
                getDriver().findElement(btn_continuarservicios).click();
            }catch (NoSuchElementException exception){
                try {
                    getDriver().findElement(next).click();
                }catch (Exception e){
                    throw new RuntimeException("No se encontro boton de continuar");
                }
            }
            interactorTime.esperaMilis(1000);
        }catch (Exception e){
            throw new RuntimeException("No cargo pagina de listado de servicios");
        }
    }

}
