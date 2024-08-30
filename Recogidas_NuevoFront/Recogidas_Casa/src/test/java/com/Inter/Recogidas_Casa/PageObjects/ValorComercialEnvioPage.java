package com.Inter.Recogidas_Casa.PageObjects;

import com.Inter.Recogidas_Casa.Utils.InteractorTime;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValorComercialEnvioPage extends PageObject {

    public By txt_valorcomercial = By.xpath("//input[@formcontrolname='ValorComercial']");
    public By btn_nopagocasa = By.xpath("//div[@class='form-group radio-buttons']/div[2]/div[2]/label/span");
    public By btn_pagocasa = By.xpath("//div[@class='form-group radio-buttons']/div[2]/div[1]/label/span");
    public By cargador = By.xpath("//app-cargador/div");
    public By next = By.xpath("//a[@class='next-button']/img");
    InteractorTime interactorTime = new InteractorTime();
    WebDriverWait tiempo = new WebDriverWait(getDriver(), 30);

    public void pagocontado(){
        interactorTime.esperaMilis(1000);
        try {
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
            getDriver().findElement(txt_valorcomercial).sendKeys("50000");
            getDriver().findElement(txt_valorcomercial).sendKeys(Keys.TAB);
        }catch (Exception e){
            throw new RuntimeException("No cargo la ventana de valor comercial");
        }
        try {
            getDriver().findElement(btn_nopagocasa).click();
            getDriver().findElement(next).click();
            interactorTime.esperaMilis(1000);
        }catch (ElementNotInteractableException exception){
            getDriver().findElement(next).click();
            interactorTime.esperaMilis(1000);
        }
    }

    public void pagocasa(){
        interactorTime.esperaMilis(1000);
        try {
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
            getDriver().findElement(txt_valorcomercial).sendKeys("50000");
            getDriver().findElement(txt_valorcomercial).sendKeys(Keys.TAB);
            getDriver().findElement(btn_pagocasa).click();
            getDriver().findElement(next).click();
            interactorTime.esperaMilis(1000);
        }catch (Exception e) {
            throw new RuntimeException("No cargo la ventana de valor comercial");
        }
    }

}
