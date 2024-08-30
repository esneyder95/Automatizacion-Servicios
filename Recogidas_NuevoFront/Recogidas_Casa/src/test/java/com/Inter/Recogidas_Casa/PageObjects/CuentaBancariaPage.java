package com.Inter.Recogidas_Casa.PageObjects;

import com.Inter.Recogidas_Casa.Utils.InteractorTime;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CuentaBancariaPage extends PageObject {

    public By next = By.xpath("//a[@class='next-button']/img");
    public By cargador = By.xpath("//app-cargador/div");
    InteractorTime interactorTime = new InteractorTime();
    WebDriverWait tiempo = new WebDriverWait(getDriver(), 30);

    public void cuentabancaria(){
        try {
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
        }catch (Exception e){
            throw new RuntimeException("No cargo la venta de quien paga");
        }
        try {
            getDriver().findElement(next).click();
            interactorTime.esperaMilis(1000);
        }catch (Exception e){
            throw new RuntimeException("El cliente remitente no tiene una cuenta bancaria inscrita");
        }
    }

}
