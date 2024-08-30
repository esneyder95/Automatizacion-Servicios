package com.Inter.Recogidas_Casa.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpresionGuiaPage extends PageObject {

    public By cargador = By.xpath("//app-cargador/div");
    public By btn_imprimirguia = By.xpath("//div[@class='successful-message preshipping-message']/div[2]/a");
    public By lbl_numeroguia = By.xpath("//p[@class='number']");
    WebDriverWait tiempo = new WebDriverWait(getDriver(), 30);
    public void impresionguia(){
        try {
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
            String guia = getDriver().findElement(lbl_numeroguia).getText();
            String sepracion[] = guia.split(" ");
            String numeroguia = sepracion[1];
            System.out.println("El numero de guia es: " + numeroguia);
            getDriver().findElement(btn_imprimirguia).click();
        }catch (Exception e){
            throw new RuntimeException("No cargo ventana de impresion de guia");
        }
    }

}
