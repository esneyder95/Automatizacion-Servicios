package com.Inter.Recogidas_Casa.PageObjects;

import com.Inter.Recogidas_Casa.Utils.DataRandom;
import com.Inter.Recogidas_Casa.Utils.InteractorTime;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CiudadEnvioPage extends PageObject {

    public By btn_agregarenvioasociado = By.xpath("//app-mensajes-listarrecogidasencasa[@class='ng-star-inserted']/div[3]/div/div/form/div[2]/a");
    public By cargador = By.xpath("//app-cargador/div");
    public By txt_ciudaddestino = By.xpath("//input[@formcontrolname='CiudadDestino']");
    public By check_clientecorporativo = By.xpath("//div[@class='checkbox']/label/span");
    public By txt_convenio = By.xpath("//input[@formcontrolname='ClienteConvenio']");
    public By slc_entregadonde = By.xpath("//select[@formcontrolname='TipoEntrega']");
    public By next = By.xpath("//a[@class='next-button']/img");
    DataRandom dataRandom = new DataRandom();
    InteractorTime interactorTime = new InteractorTime();
    WebDriverWait tiempo = new WebDriverWait(getDriver(), 30);

    public void pagocontado(){
        try {
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
        }catch (Exception e){
            throw new RuntimeException("No cargo pagina de cotizar preenvio");
        }
        interactorTime.esperaMilis(1000);
        try {
            getDriver().findElement(btn_agregarenvioasociado).click();
            interactorTime.esperaMilis(1000);
            try {
                tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
            }catch (Exception e){
                throw new RuntimeException("No cargo pagina de cotizar preenvio");
            }
            interactorTime.esperaMilis(1000);
            getDriver().findElement(txt_ciudaddestino).sendKeys(DataRandom.Ciudad());
            getDriver().findElement(txt_ciudaddestino).sendKeys(Keys.ARROW_DOWN);
            getDriver().findElement(txt_ciudaddestino).sendKeys(Keys.ENTER);
            getDriver().findElement(txt_ciudaddestino).sendKeys(Keys.TAB);
            interactorTime.esperaMilis(1000);
            getDriver().findElement(slc_entregadonde).sendKeys(Keys.ENTER);
            dataRandom.Donde();
            getDriver().findElement(slc_entregadonde).sendKeys(Keys.ENTER);
            interactorTime.esperaMilis(1000);
            getDriver().findElement(next).click();
        }catch (NoSuchElementException exception){
            getDriver().findElement(txt_ciudaddestino).sendKeys(DataRandom.Ciudad());
            getDriver().findElement(txt_ciudaddestino).sendKeys(Keys.ARROW_DOWN);
            getDriver().findElement(txt_ciudaddestino).sendKeys(Keys.ENTER);
            getDriver().findElement(txt_ciudaddestino).sendKeys(Keys.TAB);
            interactorTime.esperaMilis(1000);
            getDriver().findElement(slc_entregadonde).sendKeys(Keys.ENTER);
            dataRandom.Donde();
            getDriver().findElement(slc_entregadonde).sendKeys(Keys.ENTER);
            interactorTime.esperaMilis(1000);
            getDriver().findElement(next).click();
        }
    }

    public void pagocobro(){
        try {
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
        }catch (Exception e){
            throw new RuntimeException("No cargo pagina de cotizar preenvio");
        }
        interactorTime.esperaMilis(1000);
        try {
            getDriver().findElement(btn_agregarenvioasociado).click();
            interactorTime.esperaMilis(1000);
            try {
                tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
            }catch (Exception e){
                throw new RuntimeException("No cargo pagina de cotizar preenvio");
            }
            interactorTime.esperaMilis(1000);
            getDriver().findElement(txt_ciudaddestino).sendKeys("BOGOTA");
            getDriver().findElement(txt_ciudaddestino).sendKeys(Keys.ARROW_DOWN);
            getDriver().findElement(txt_ciudaddestino).sendKeys(Keys.ENTER);
            getDriver().findElement(txt_ciudaddestino).sendKeys(Keys.TAB);
            interactorTime.esperaMilis(1000);
            getDriver().findElement(slc_entregadonde).sendKeys(Keys.ENTER);
            dataRandom.Donde();
            getDriver().findElement(slc_entregadonde).sendKeys(Keys.ENTER);
            interactorTime.esperaMilis(1000);
            getDriver().findElement(next).click();
        }catch (NoSuchElementException exception){
            getDriver().findElement(txt_ciudaddestino).sendKeys("BOGOTA");
            getDriver().findElement(txt_ciudaddestino).sendKeys(Keys.ARROW_DOWN);
            getDriver().findElement(txt_ciudaddestino).sendKeys(Keys.ENTER);
            getDriver().findElement(txt_ciudaddestino).sendKeys(Keys.TAB);
            interactorTime.esperaMilis(1000);
            getDriver().findElement(slc_entregadonde).sendKeys(Keys.ENTER);
            dataRandom.Donde();
            getDriver().findElement(slc_entregadonde).sendKeys(Keys.ENTER);
            interactorTime.esperaMilis(1000);
            getDriver().findElement(next).click();
        }
    }

    public void pagoconvenio(){
        try {
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
        }catch (Exception e){
            throw new RuntimeException("No cargo pagina de cotizar preenvio");
        }
        interactorTime.esperaMilis(1000);
        try {
            getDriver().findElement(btn_agregarenvioasociado).click();
            interactorTime.esperaMilis(1000);
            try {
                tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
            }catch (Exception e){
                throw new RuntimeException("No cargo pagina de cotizar preenvio");
            }
            interactorTime.esperaMilis(1000);
            getDriver().findElement(txt_ciudaddestino).sendKeys("BOGOTA");
            getDriver().findElement(txt_ciudaddestino).sendKeys(Keys.ARROW_DOWN);
            getDriver().findElement(txt_ciudaddestino).sendKeys(Keys.ENTER);
            getDriver().findElement(txt_ciudaddestino).sendKeys(Keys.TAB);
            interactorTime.esperaMilis(1000);
            getDriver().findElement(check_clientecorporativo).click();
            getDriver().findElement(txt_convenio).sendKeys("17035");
            getDriver().findElement(txt_convenio).sendKeys(Keys.TAB);
            interactorTime.esperaMilis(1000);
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
            getDriver().findElement(next).click();
            interactorTime.esperaMilis(1000);
        }catch (NoSuchElementException exception){
            getDriver().findElement(txt_ciudaddestino).sendKeys("BOGOTA");
            getDriver().findElement(txt_ciudaddestino).sendKeys(Keys.ARROW_DOWN);
            getDriver().findElement(txt_ciudaddestino).sendKeys(Keys.ENTER);
            getDriver().findElement(txt_ciudaddestino).sendKeys(Keys.TAB);
            getDriver().findElement(check_clientecorporativo).click();
            getDriver().findElement(txt_convenio).sendKeys("17035");
            getDriver().findElement(txt_convenio).sendKeys(Keys.TAB);
            interactorTime.esperaMilis(1000);
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
            getDriver().findElement(next).click();
            interactorTime.esperaMilis(1000);
        }
    }

}
