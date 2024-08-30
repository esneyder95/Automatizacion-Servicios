package com.Inter.Recogidas_Casa.PageObjects;

import com.Inter.Recogidas_Casa.Utils.InteractorTime;
import net.bytebuddy.implementation.bytecode.Throw;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContenidoEnvioPage extends PageObject {

    public By txt_contenido = By.xpath("//textarea[@formcontrolname='ContenidoEnvio']");
    public By next = By.xpath("//a[@class='next-button']/img");
    WebDriverWait tiempo = new WebDriverWait(getDriver(), 30);

    public void contenido(){
        try {
            tiempo.until(ExpectedConditions.elementToBeClickable(txt_contenido));
        }catch (Exception e){
            throw new RuntimeException("No cargo la ventana de contenido");
        }
        getDriver().findElement(txt_contenido).sendKeys("Cartas");
        getDriver().findElement(next).click();
    }

}
