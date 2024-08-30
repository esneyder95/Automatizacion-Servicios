package com.inter.mouse.PageObjects;

import com.inter.mouse.Utils.InteractorTime;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListarRecogidasPage extends PageObject {

    public By btn_agregarenvio = By.xpath("//tbody[@class='mdc-data-table__content']/tr/td[8]/a");
    WebDriverWait tiempo = new WebDriverWait(getDriver(), 30);
    InteractorTime interactorTime = new InteractorTime();
    public void listarecogidas(){
        try {
            tiempo.until(ExpectedConditions.elementToBeClickable(btn_agregarenvio));
            getDriver().findElement(btn_agregarenvio).click();
            interactorTime.esperaMilis(10000);
            getDriver().close();
        }catch (NoSuchElementException exception){
            getDriver().close();
        }catch (TimeoutException exception){
            getDriver().close();
        }

    }
}
