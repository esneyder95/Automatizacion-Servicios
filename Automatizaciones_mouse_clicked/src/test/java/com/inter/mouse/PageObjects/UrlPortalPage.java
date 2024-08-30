package com.inter.mouse.PageObjects;

import com.inter.mouse.Utils.InteractorTime;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UrlPortalPage extends PageObject {

    public static String Url;

    public By usuario = By.xpath("//input[@formcontrolname='Usuario']");
    public By clave = By.xpath("//input[@formcontrolname='Clave']");
    public By iniciarsesion = By.xpath("//button[@class='btn btn-primary bs-btn']");
    public By cuentainscritas = By.xpath("//div[@class='d-flex flex-wrap align-items-end justify-content-between align-content-stretch gap-3 tarjetas-accion']/div[1]/button");
    public By informacion = By.xpath("//table[@class='table table-interrapidisimo fs-responsive']/tbody/tr[1]/td[5]/div/div/a[1]");
    public By volver = By.xpath("//a[@class='btn btn-outline-primary rounded-pill w-100 btn-primary']");
    public By cerrarsesion= By.xpath("//div[@class='container-lg container-fluid']/div[2]/ul/li[2]/a");
    public By atras = By.xpath("//ul[@class='navbar-nav mb-2 mb-lg-0 gap-3']/li[2]/a");

    WebDriverWait tiempo = new WebDriverWait(getDriver(), 30);

    InteractorTime interactorTime = new InteractorTime();

    JavascriptExecutor js = (JavascriptExecutor) getDriver();

    public void openportalclientes(){
        try {
            EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
            Url = variables.getProperty("webdriver.Url2");
            getDriver().get(Url);
        }catch (Exception e){
            throw new RuntimeException("La pagina web no carga " + e);
        }
    }

    public void iniciosesion(){
        try {
            tiempo.until(ExpectedConditions.elementToBeClickable(usuario));
            getDriver().findElement(usuario).sendKeys("e");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("s");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("n");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("e");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("i");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("d");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("e");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("r");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("-");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("2");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("8");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("9");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("5");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("@");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("h");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("o");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("t");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("m");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("a");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("i");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("l");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys(".");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("c");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("o");
            interactorTime.esperaMilis(500);
            getDriver().findElement(usuario).sendKeys("m");
            interactorTime.esperaMilis(10000);
            getDriver().findElement(clave).sendKeys("F");
            interactorTime.esperaMilis(500);
            getDriver().findElement(clave).sendKeys("a");
            interactorTime.esperaMilis(500);
            getDriver().findElement(clave).sendKeys("b");
            interactorTime.esperaMilis(500);
            getDriver().findElement(clave).sendKeys("i");
            interactorTime.esperaMilis(500);
            getDriver().findElement(clave).sendKeys("a");
            interactorTime.esperaMilis(500);
            getDriver().findElement(clave).sendKeys("n");
            interactorTime.esperaMilis(500);
            getDriver().findElement(clave).sendKeys("g");
            interactorTime.esperaMilis(500);
            getDriver().findElement(clave).sendKeys("u");
            interactorTime.esperaMilis(500);
            getDriver().findElement(clave).sendKeys("t");
            interactorTime.esperaMilis(500);
            getDriver().findElement(clave).sendKeys("1");
            interactorTime.esperaMilis(500);
            getDriver().findElement(clave).sendKeys("9");
            interactorTime.esperaMilis(500);
            getDriver().findElement(clave).sendKeys("9");
            interactorTime.esperaMilis(500);
            getDriver().findElement(clave).sendKeys("5");
            //interactorTime.esperaMilis(500);
            //getDriver().findElement(clave).sendKeys("*");
            interactorTime.esperaMilis(10000);
            getDriver().findElement(iniciarsesion).click();
            tiempo.until(ExpectedConditions.elementToBeClickable(cuentainscritas));
            interactorTime.esperaMilis(10000);
            getDriver().findElement(cuentainscritas).click();
            tiempo.until(ExpectedConditions.elementToBeClickable(informacion));
            interactorTime.esperaMilis(10000);
            getDriver().findElement(informacion).click();
            tiempo.until(ExpectedConditions.elementToBeClickable(volver));
            interactorTime.esperaMilis(10000);
            getDriver().findElement(volver).click();
            interactorTime.esperaMilis(10000);
            getDriver().findElement(atras).click();
            tiempo.until(ExpectedConditions.elementToBeClickable(cuentainscritas));
            interactorTime.esperaMilis(10000);
            WebElement perfil = getDriver().findElement(By.xpath("//div[@class='d-flex justify-content-between d-lg-none']/a[1]"));
            js.executeScript("arguments[0].click();", perfil);
            tiempo.until(ExpectedConditions.elementToBeClickable(cerrarsesion));
            interactorTime.esperaMilis(10000);
            getDriver().findElement(cerrarsesion).click();
            tiempo.until(ExpectedConditions.elementToBeClickable(usuario));
            interactorTime.esperaMilis(10000);
            getDriver().close();
        }catch (NoSuchElementException exception){
            getDriver().close();
            openportalclientes();
            iniciosesion();
        }catch (TimeoutException exception){
            getDriver().close();
            openportalclientes();
            iniciosesion();
        }
    }

}
