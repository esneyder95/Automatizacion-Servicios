package com.Inter.Recogidas_Casa.PageObjects;

import com.Inter.Recogidas_Casa.Utils.InteractorTime;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListarRecogidasPage extends PageObject {

    public By btn_agregarenvio = By.xpath("//tbody[@class='mdc-data-table__content']/tr[2]/td[8]/a");
    WebDriverWait tiempo = new WebDriverWait(getDriver(), 30);
    InteractorTime interactorTime = new InteractorTime();
    public void listarecogidas(){
        tiempo.until(ExpectedConditions.elementToBeClickable(btn_agregarenvio));
        getDriver().findElement(btn_agregarenvio).click();
        interactorTime.esperaMilis(1000);
    }

}
