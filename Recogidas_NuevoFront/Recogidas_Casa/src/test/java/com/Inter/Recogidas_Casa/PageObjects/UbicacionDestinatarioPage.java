package com.Inter.Recogidas_Casa.PageObjects;

import com.Inter.Recogidas_Casa.Utils.InteractorTime;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import net.serenitybdd.core.pages.PageObject;
import org.json.JSONArray;
import org.jtwig.JtwigModel;
import org.jtwig.JtwigTemplate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class UbicacionDestinatarioPage extends PageObject {

    public By cargador = By.xpath("//app-cargador/div");
    public By next = By.xpath("//a[@class='next-button']/img");
    public By mensajegeo = By.id("alertGeorreferencia");
    public By txt_direccciondestinatario = By.xpath("//input[@formcontrolname='inputDireccionDestinatario']");
    InteractorTime interactorTime = new InteractorTime();
    WebDriverWait tiempo = new WebDriverWait(getDriver(), 30);
    public void destinatariocongeo(){
        try {
            tiempo.until(ExpectedConditions.elementToBeClickable(txt_direccciondestinatario));
            getDriver().findElement(txt_direccciondestinatario).sendKeys("Calle 68 A su");
            getDriver().findElement(txt_direccciondestinatario).sendKeys(Keys.TAB);
            interactorTime.esperaMilis(1000);
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
        }catch (Exception e){
            throw new RuntimeException("No cargo ventana de ubicacion destinatario");
        }
    }
    public void mensajegeo(){
        try {
            String variable = null;
            JtwigTemplate template = JtwigTemplate.classpathTemplate("APIS/ObtenerGeoMultiZona.json");
            JtwigModel model = JtwigModel.newModel()
                    .with("direccion", getDriver().findElement(txt_direccciondestinatario).getAttribute("value"))
                    .with("ciudad", "BOGOTA");
            try {
                JsonNode body = Unirest.post("https://zde7atgwt9.execute-api.us-east-1.amazonaws.com/RecogidasQA/api/Integraciones/ObtenerGeoMultiZona")
                        .header("Content-Type", "application/json; charset=utf-8")
                        .body(template.render(model))
                        .asJson()
                        .getBody();
                JSONArray body_array = body.getArray();
                for (int i = 0; i < body_array.length(); i++){
                    variable = body_array.getJSONObject(i).getString("mensaje");
                }
            } catch (UnirestException e) {
                throw new RuntimeException("No carga la georreferenciación");
            }
            if (variable.equals("Procesado y no ubicado.")&&
                    getDriver().findElement(mensajegeo).getAttribute("class").equals("alert-message with-close-button")){
            }else{
                try {
                    fail("No carga el mensaje de advertencia");
                }catch (final RuntimeException e){
                    assertTrue(true);
                }
            }
        }catch (Exception e){
            throw new RuntimeException("No cargo ventana de ubicacion destinatario");
        }
    }

    public void ubicaciondestinatario(){
        try {
            tiempo.until(ExpectedConditions.elementToBeClickable(txt_direccciondestinatario));
            getDriver().findElement(txt_direccciondestinatario).sendKeys("Calle 123");
            getDriver().findElement(txt_direccciondestinatario).sendKeys(Keys.TAB);
            interactorTime.esperaMilis(1000);
            tiempo.until(ExpectedConditions.attributeToBe(cargador,"class","loader-container hide"));
            getDriver().findElement(next).click();
        }catch (Exception e){
            throw new RuntimeException("No cargo ventana de ubicacion destinatario");
        }
    }

    public void ubicaciondestinatarioconvenio(){
        try {
            tiempo.until(ExpectedConditions.elementToBeClickable(next));
            getDriver().findElement(next).click();
        }catch (Exception e){
            throw new RuntimeException("No cargo ventana de ubicacion destinatario");
        }
    }

}
