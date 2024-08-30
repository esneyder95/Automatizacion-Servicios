package com.inter.mouse.PageObjects;

import com.inter.mouse.Steps.DiferentesPagosSteps;
import com.inter.mouse.Utils.InteractorTime;
import io.cucumber.java.sl.In;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbrirUrlPage extends PageObject {

    public static String Url;
    public By btn_Iniciar = By.xpath("//div[@class='col-lg-8 col-12 start-modules']/div/a");
    public By txt_identificacion = By.xpath("//input[@formcontrolname='numeroIdentificacion']");
    public By txt_celular = By.xpath("//input[@formcontrolname='numeroCelular']");
    public By txt_nombre = By.xpath("//input[@formcontrolname='nombresUsuario']");
    public By txt_correo = By.xpath("//input[@formcontrolname='correoElectronico']");
    public By btn_verrecogidas = By.xpath("//div[@id='modaldatospersonales']/div/div/div/a");
    public By next = By.xpath("//a[@class='next-button']/div/img");
    WebDriverWait tiempo = new WebDriverWait(getDriver(), 30);

    InteractorTime interactorTime = new InteractorTime();

    public void openrecogidas(){
        try {
            EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
            Url = variables.getProperty("webdriver.Url");
            getDriver().get(Url);
        }catch (Exception e){
            throw new RuntimeException("La pagina web no carga" + e);
        }
    }

    public void ingresolistarrecogidas(){
        try {
            //tiempo.until(ExpectedConditions.elementToBeClickable(btn_Iniciar));
            //interactorTime.esperaMilis(20000);
            //getDriver().findElement(btn_Iniciar).click();
            tiempo.until(ExpectedConditions.elementToBeClickable(txt_identificacion));
            getDriver().findElement(txt_identificacion).sendKeys("1");
            interactorTime.esperaMilis(500);
            getDriver().findElement(txt_identificacion).sendKeys("0");
            interactorTime.esperaMilis(500);
            getDriver().findElement(txt_identificacion).sendKeys("2");
            interactorTime.esperaMilis(500);
            getDriver().findElement(txt_identificacion).sendKeys("4");
            interactorTime.esperaMilis(500);
            getDriver().findElement(txt_identificacion).sendKeys("5");
            interactorTime.esperaMilis(500);
            getDriver().findElement(txt_identificacion).sendKeys("6");
            interactorTime.esperaMilis(500);
            getDriver().findElement(txt_identificacion).sendKeys("7");
            interactorTime.esperaMilis(500);
            getDriver().findElement(txt_identificacion).sendKeys("3");
            interactorTime.esperaMilis(500);
            getDriver().findElement(txt_identificacion).sendKeys("0");
            interactorTime.esperaMilis(500);
            getDriver().findElement(txt_identificacion).sendKeys("8");
            interactorTime.esperaMilis(10000);
            getDriver().findElement(txt_celular).sendKeys("3");
            interactorTime.esperaMilis(500);
            getDriver().findElement(txt_celular).sendKeys("1");
            interactorTime.esperaMilis(500);
            getDriver().findElement(txt_celular).sendKeys("0");
            interactorTime.esperaMilis(500);
            getDriver().findElement(txt_celular).sendKeys("5");
            interactorTime.esperaMilis(500);
            getDriver().findElement(txt_celular).sendKeys("7");
            interactorTime.esperaMilis(500);
            getDriver().findElement(txt_celular).sendKeys("6");
            interactorTime.esperaMilis(500);
            getDriver().findElement(txt_celular).sendKeys("1");
            interactorTime.esperaMilis(500);
            getDriver().findElement(txt_celular).sendKeys("9");
            interactorTime.esperaMilis(500);
            getDriver().findElement(txt_celular).sendKeys("8");
            interactorTime.esperaMilis(500);
            getDriver().findElement(txt_celular).sendKeys("8");
            interactorTime.esperaMilis(10000);
            getDriver().findElement(next).click();
            interactorTime.esperaMilis(10000);
            tiempo.until(ExpectedConditions.elementToBeClickable(txt_nombre));
            getDriver().findElement(next).click();
            interactorTime.esperaMilis(10000);
            tiempo.until(ExpectedConditions.elementToBeClickable(txt_correo));
            getDriver().findElement(next).click();
            interactorTime.esperaMilis(10000);
            tiempo.until(ExpectedConditions.elementToBeClickable(btn_verrecogidas));
            getDriver().findElement(btn_verrecogidas).click();
            interactorTime.esperaMilis(10000);
        }catch (NoSuchElementException exception){
            getDriver().close();
            openrecogidas();
            ingresolistarrecogidas();
        }catch (TimeoutException exception){
            getDriver().close();
            openrecogidas();
            ingresolistarrecogidas();
        }
    }

}
