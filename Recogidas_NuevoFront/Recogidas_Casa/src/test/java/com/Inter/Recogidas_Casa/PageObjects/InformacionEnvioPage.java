package com.Inter.Recogidas_Casa.PageObjects;

import com.Inter.Recogidas_Casa.Utils.InteractorTime;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InformacionEnvioPage extends PageObject {

    public By btn_finalizar = By.xpath("//a[@class='btn btn-link']");
    public By cargador = By.xpath("//app-cargador/div");
    InteractorTime interactorTime = new InteractorTime();
    WebDriverWait tiempo = new WebDriverWait(getDriver(), 30);
    public void finalizarenvio(){
        try {
            tiempo.until(ExpectedConditions.elementToBeClickable(btn_finalizar));
            getDriver().findElement(btn_finalizar).click();
            interactorTime.esperaMilis(1000);
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
        }catch (Exception e){
            throw new RuntimeException("No carga detalle del envio");
        }
    }

}
