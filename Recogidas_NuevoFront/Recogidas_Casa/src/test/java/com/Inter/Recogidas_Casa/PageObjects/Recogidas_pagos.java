package com.Inter.Recogidas_Casa.PageObjects;

import com.Inter.Recogidas_Casa.Utils.InteractorTime;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Recogidas_pagos extends PageObject {

    public static String Url;
    public By btn_Iniciar = By.xpath("//div[@class='col-lg-8 col-12 start-modules']/div/a");
    public By txt_identificacion = By.xpath("//input[@formcontrolname='numeroIdentificacion']");
    public By txt_celular = By.xpath("//input[@formcontrolname='numeroCelular']");
    public By txt_nombre = By.xpath("//input[@formcontrolname='nombresUsuario']");
    public By txt_correo = By.xpath("//input[@formcontrolname='correoElectronico']");
    public By btn_verrecogidas = By.xpath("//div[@id='modaldatospersonales']/div/div/div/a");
    public By next = By.xpath("//a[@class='next-button']/div/img");
    WebDriverWait tiempo = new WebDriverWait(getDriver(), 30);

    public void OpenRecogidas() {
        try {
            EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
            Url = variables.getProperty("webdriver.Url");
            getDriver().get(Url);
        }catch (Exception e){
            throw  new RuntimeException(e);
            //throw new RuntimeException("La pagina web no carga");
        }
    }

    public void ingresolistarrecogidas(){
            tiempo.until(ExpectedConditions.elementToBeClickable(btn_Iniciar));
            getDriver().findElement(btn_Iniciar).click();
            tiempo.until(ExpectedConditions.elementToBeClickable(txt_identificacion));
            getDriver().findElement(txt_identificacion).sendKeys("1024567308");
            getDriver().findElement(txt_celular).sendKeys("3105761988");
            getDriver().findElement(next).click();
            tiempo.until(ExpectedConditions.elementToBeClickable(txt_nombre));
            getDriver().findElement(next).click();
            tiempo.until(ExpectedConditions.elementToBeClickable(txt_correo));
            getDriver().findElement(next).click();
            tiempo.until(ExpectedConditions.elementToBeClickable(btn_verrecogidas));
            getDriver().findElement(btn_verrecogidas).click();
    }

    public static String ambiente() {
        String ambiente;
        if (Url.equals("https://recogidasencasa-qa-angular.interrapidisimo.com/")){
            ambiente = "QA";
        }else if (Url.equals("https://recogidasencasa-dev-angular.interrapidisimo.com/")){
            ambiente = "Apitesting";
        }else{
            ambiente = "";
        }
        return ambiente;
    }

}
