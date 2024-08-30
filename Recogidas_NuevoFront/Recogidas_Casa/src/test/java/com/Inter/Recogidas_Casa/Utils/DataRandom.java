package com.Inter.Recogidas_Casa.Utils;

import io.cucumber.java.sl.In;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class DataRandom extends PageObject {

    public By slc_entregadonde = By.xpath("//select[@formcontrolname='TipoEntrega']");
    public By slc_paquete = By.xpath("//select[@formcontrolname='TipoPaquete']");
    InteractorTime interactorTime = new InteractorTime();

    public static String Ciudad(){
        String Ciud = new String();
        int longitud = (int) (1 + (Math.random() * 32));
        switch (longitud) {
            case 1: {
                Ciud = ("MEDELLIN");
                break;
            }
            case 2: {
                Ciud = ("ARAUCA ARAUCA");
                break;
            }
            case 3: {
                Ciud = ("BARRANQUILLA");
                break;
            }
            case 4: {
                Ciud = ("CARTAGENA BOLIVAR");
                break;
            }
            case 5: {
                Ciud = ("TUNJA");
                break;
            }
            case 6: {
                Ciud = ("MANIZALES");
                break;
            }
            case 7: {
                Ciud = ("FLORENCIA CAQUETA");
                break;
            }
            case 8: {
                Ciud = ("YOPAL");
                break;
            }
            case 9: {
                Ciud = ("POPAYAN");
                break;
            }
            case 10: {
                Ciud = ("VALLEDUPAR");
                break;
            }
            case 11: {
                Ciud = ("QUIBDO");
                break;
            }
            case 12: {
                Ciud = ("MONTERIA");
                break;
            }
            case 13: {
                Ciud = ("BOGOTA");
                break;
            }
            case 14: {
                Ciud = ("INIRIDA");
                break;
            }
            case 15: {
                Ciud = ("SAN JOSE DEL GUAVIARE");
                break;
            }
            case 16: {
                Ciud = ("NEIVA");
                break;
            }
            case 17: {
                Ciud = ("RIOHACHA");
                break;
            }
            case 18: {
                Ciud = ("SANTA MARTA");
                break;
            }
            case 19: {
                Ciud = ("VILLAVICENCIO");
                break;
            }
            case 20: {
                Ciud = ("PASTO");
                break;
            }
            case 21: {
                Ciud = ("CUCUTA");
                break;
            }
            case 22: {
                Ciud = ("MOCOA");
                break;
            }
            case 23: {
                Ciud = ("ARMENIA_QUINDIO");
                break;
            }
            case 24: {
                Ciud = ("PEREIRA");
                break;
            }
            case 25: {
                Ciud = ("BUCARAMANGA");
                break;
            }
            case 26: {
                Ciud = ("IBAGUE");
                break;
            }
            case 27: {
                Ciud = ("CALI");
                break;
            }
            case 28: {
                Ciud = ("MITU");
                break;
            }
            case 29: {
                Ciud = ("LETICIA");
                break;
            }
            case 30: {
                Ciud = ("SAN ANDRES ARCHIPIELAGO DE SAN ANDRES , PROVIDENCIA Y SANTA CATALINA");
                break;
            }
            case 31: {
                Ciud = ("SINCELEJO");
                break;
            }
            case 32: {
                Ciud = ("PUERTO CARRENO");
                break;
            }
        }
        return Ciud;
    }

    public void Donde() {
        int longitud = (int) (1 + (Math.random() * 4));
        switch (longitud){
            case 1: {
                getDriver().findElement(slc_entregadonde).sendKeys(Keys.ARROW_DOWN);
                interactorTime.esperaMilis(1000);
                break;
            }
            case 2: {
                getDriver().findElement(slc_entregadonde).sendKeys(Keys.ARROW_DOWN);
                getDriver().findElement(slc_entregadonde).sendKeys(Keys.ARROW_DOWN);
                interactorTime.esperaMilis(1000);
                break;
            }
            case 3: {
                getDriver().findElement(slc_entregadonde).sendKeys(Keys.ARROW_DOWN);
                getDriver().findElement(slc_entregadonde).sendKeys(Keys.ARROW_DOWN);
                getDriver().findElement(slc_entregadonde).sendKeys(Keys.ARROW_DOWN);
                interactorTime.esperaMilis(1000);
                break;
            }
            case 4: {
                getDriver().findElement(slc_entregadonde).sendKeys(Keys.ARROW_DOWN);
                getDriver().findElement(slc_entregadonde).sendKeys(Keys.ARROW_DOWN);
                getDriver().findElement(slc_entregadonde).sendKeys(Keys.ARROW_DOWN);
                getDriver().findElement(slc_entregadonde).sendKeys(Keys.ARROW_DOWN);
                interactorTime.esperaMilis(1000);
                break;
            }
        }
    }

    public void paquete() {
        int longitud = (int) (1 + (Math.random() * 4));
        switch (longitud){
            case 1: {
                getDriver().findElement(slc_paquete).sendKeys(Keys.ARROW_DOWN);
                interactorTime.esperaMilis(1000);
                break;
            }
            case 2: {
                getDriver().findElement(slc_paquete).sendKeys(Keys.ARROW_DOWN);
                getDriver().findElement(slc_paquete).sendKeys(Keys.ARROW_DOWN);
                interactorTime.esperaMilis(1000);
                break;
            }
            case 3: {
                getDriver().findElement(slc_paquete).sendKeys(Keys.ARROW_DOWN);
                getDriver().findElement(slc_paquete).sendKeys(Keys.ARROW_DOWN);
                getDriver().findElement(slc_paquete).sendKeys(Keys.ARROW_DOWN);
                interactorTime.esperaMilis(1000);
                break;
            }
            case 4: {
                getDriver().findElement(slc_paquete).sendKeys(Keys.ARROW_DOWN);
                getDriver().findElement(slc_paquete).sendKeys(Keys.ARROW_DOWN);
                getDriver().findElement(slc_paquete).sendKeys(Keys.ARROW_DOWN);
                getDriver().findElement(slc_paquete).sendKeys(Keys.ARROW_DOWN);
                interactorTime.esperaMilis(1000);
                break;
            }
        }
    }

}
