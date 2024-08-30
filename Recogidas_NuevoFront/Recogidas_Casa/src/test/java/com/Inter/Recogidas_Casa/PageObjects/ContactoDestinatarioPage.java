package com.Inter.Recogidas_Casa.PageObjects;

import com.Inter.Recogidas_Casa.Utils.InteractorTime;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactoDestinatarioPage extends PageObject {

    public By txt_telefenodestinatario = By.xpath("//input[@formcontrolname='inputNumeroCelularDestinatario']");
    public By txt_correodestinatario = By.xpath("//input[@formcontrolname='inputCorreoElectronicoDestinatario']");
    public By btn_crearenvio = By.xpath("//button[@class='btn btn-primary']");
    InteractorTime interactorTime = new InteractorTime();
    WebDriverWait tiempo = new WebDriverWait(getDriver(), 30);
    public void crearenvio(){
        try {
            tiempo.until(ExpectedConditions.elementToBeClickable(btn_crearenvio));
            getDriver().findElement(txt_telefenodestinatario).sendKeys("3133160298");
            getDriver().findElement(btn_crearenvio).click();
            interactorTime.esperaMilis(1000);
        }catch (Exception e){
            throw new RuntimeException("No cargo ventana de contacto destinatario");
        }
    }

    public void crearenvioconvenio(){
        try {
            tiempo.until(ExpectedConditions.elementToBeClickable(btn_crearenvio));
            getDriver().findElement(txt_correodestinatario).sendKeys("reymon@gmail.com");
            getDriver().findElement(btn_crearenvio).click();
            interactorTime.esperaMilis(1000);
        }catch (Exception e){
            throw new RuntimeException("No cargo ventana de contacto destinatario");
        }
    }

}
