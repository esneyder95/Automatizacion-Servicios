package com.Inter.Recogidas_Casa.PageObjects;

import com.Inter.Recogidas_Casa.Utils.DataRandom;
import com.Inter.Recogidas_Casa.Utils.InteractorTime;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PesoEnvioPage extends PageObject {

    public By txt_peso = By.xpath("//input[@formcontrolname='Peso']");
    public By slc_paquete = By.xpath("//select[@formcontrolname='TipoPaquete']");
    public By cargador = By.xpath("//app-cargador/div");
    public By next = By.xpath("//a[@class='next-button']/img");
    InteractorTime interactorTime = new InteractorTime();
    DataRandom dataRandom = new DataRandom();
    WebDriverWait tiempo = new WebDriverWait(getDriver(), 30);

    public void peso(){
        try {
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
        }catch (Exception e){
            throw new RuntimeException("No cargo pagina de cotizar preenvio");
        }
        getDriver().findElement(txt_peso).sendKeys("1");
        getDriver().findElement(txt_peso).sendKeys(Keys.TAB);
        try {
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
        }catch (Exception e){
            throw new RuntimeException("No cargo pagina de cotizar preenvio");
        }
        getDriver().findElement(slc_paquete).sendKeys(Keys.ENTER);
        dataRandom.paquete();
        getDriver().findElement(slc_paquete).sendKeys(Keys.ENTER);
        interactorTime.esperaMilis(1000);
        getDriver().findElement(next).click();
    }

}
