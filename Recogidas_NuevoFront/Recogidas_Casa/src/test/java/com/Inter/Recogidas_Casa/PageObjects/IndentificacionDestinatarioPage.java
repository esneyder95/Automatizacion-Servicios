package com.Inter.Recogidas_Casa.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndentificacionDestinatarioPage extends PageObject {

    public By txt_documentodestinatario = By.xpath("//input[@formcontrolname='inputIdentificacionDestinatario']");
    public By txt_nombredestinatario = By.xpath("//input[@formcontrolname='inputNombresDestinatario']");
    public By txt_apellidodestinatario = By.xpath("//input[@formcontrolname='inputApellidosDestinatario']");
    public By cargador = By.xpath("//app-cargador/div");
    public By next = By.xpath("//a[@class='next-button']/img");
    WebDriverWait tiempo = new WebDriverWait(getDriver(), 30);
    public void identificaciondestinatario(){
        try {
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
            tiempo.until(ExpectedConditions.elementToBeClickable(next));
            getDriver().findElement(txt_documentodestinatario).sendKeys("41778013");
            getDriver().findElement(txt_nombredestinatario).sendKeys("LUZ MARINA");
            getDriver().findElement(txt_apellidodestinatario).sendKeys("ROMERO GARCIA");
            getDriver().findElement(next).click();
        }catch (Exception e){
            throw new RuntimeException("No cargo ventana de identificacion destinatario");
        }
    }

    public void identificaciondestinatarioconvenio(){
        try {
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
            getDriver().findElement(next).click();
        }catch (Exception e){
            throw new RuntimeException("No cargo ventana de identificacion destinatario");
        }
    }

}
