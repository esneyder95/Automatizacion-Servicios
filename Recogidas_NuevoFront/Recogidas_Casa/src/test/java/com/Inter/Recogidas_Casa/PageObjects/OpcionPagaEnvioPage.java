package com.Inter.Recogidas_Casa.PageObjects;

import com.Inter.Recogidas_Casa.Steps.DiferentesPagosSteps;
import com.Inter.Recogidas_Casa.Utils.InteractorTime;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpcionPagaEnvioPage extends PageObject {

    public By cargador = By.xpath("//app-cargador/div");
    public By next = By.xpath("//a[@class='next-button']/img");
    public By btn_opcionyo = By.xpath("//div[@class='form-group radio-buttons pay-form']/div[1]/label/span");
    public By btn_opcionquienrecibe = By.xpath("//div[@class='form-group radio-buttons pay-form']/div[2]/label/span");
    InteractorTime interactorTime = new InteractorTime();
    WebDriverWait tiempo = new WebDriverWait(getDriver(), 30);
    public void pagocontado(){
        try {
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
        }catch (Exception e){
            throw new RuntimeException("No cargo la venta de quien paga");
        }
        try {
            getDriver().findElement(btn_opcionyo).click();
            getDriver().findElement(next).click();
            interactorTime.esperaMilis(1000);
        }catch (NoSuchElementException exception){
        }
    }
    public void pagocobro(){
        try {
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
            getDriver().findElement(btn_opcionquienrecibe).click();
            getDriver().findElement(next).click();
            interactorTime.esperaMilis(1000);
        }catch (Exception e){
            throw new RuntimeException("No cargo la venta de quien paga");
        }
    }

}
