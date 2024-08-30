package org.servicios.ListaRestricitiva.PageObject;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import net.serenitybdd.core.pages.PageObject;
import org.jruby.RubyProcess;
import org.json.JSONArray;
import org.json.JSONException;
import org.jtwig.JtwigModel;
import org.jtwig.JtwigTemplate;;
import org.servicios.ListaRestricitiva.Utils.DataRandom;
import org.servicios.ListaRestricitiva.Utils.InteractorTime;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejecuciones extends PageObject {

    InteractorTime interactorTime = new InteractorTime();
    static List<String[]> OustCsv = new ArrayList<String[]>();
    File lista_servicios = new File("src/test/resources/APIs/URLs");
    String crearadmision = null;
    String ejecutarrecogida = null;
    String obtenertoken = null;
    String obtenerinfoguias = null;
    String insertarlista = null;
    long idRecogida = 0;
    long idPreFactura = 0;
    long  numeroGuia = 0;

    String idRemitente = null;
    String telefonoRemitente = null;
    String emailRemitente = null;
    String direccionRemitente = null;
    String nombreRemitente = null;
    String idDestinatario = null;
    String telefonoDestinatario = null;
    String nombreDestinatario = null;
    String direccionDestinatario = null;
    String emailDestinatario = null;
    String cedulaDestinatario = null;
    String cedulaRemintente = null;
    String celularDestinatario = null;
    String celularRemitente = null;
    boolean errorServicio = true;
    static int conteoErrores = 0;
    String idToken = null;
    float valorTotal = 0;

    public void leerarchivo(){
        try{
            FileReader lectorArchivo = new FileReader(lista_servicios);
            BufferedReader br = new BufferedReader(lectorArchivo);
            String l="";
            String aux="";
            int j = 0;
            while(true)
            {
                aux=br.readLine();
                j++;
                switch (j){
                    case 1:
                        crearadmision = aux;
                        break;
                    case 2:
                        ejecutarrecogida = aux;
                        break;
                    case 3:
                        obtenertoken = aux;
                        break;
                    case 4:
                        obtenerinfoguias = aux;
                        break;
                    case 5:
                        insertarlista = aux;
                        break;
                    default:
                        break;
                }
                if(aux!=null){
                    l=l+aux+"n";
                } else{
                    break;
                }
            }
            br.close();
            lectorArchivo.close();
            String[] respuesta = crearadmision.split(" ");
            crearadmision = respuesta[1];
            respuesta = ejecutarrecogida.split(" ");
            ejecutarrecogida = respuesta[1];
            respuesta = obtenertoken.split(" ");
            obtenertoken = respuesta[1];
            respuesta = obtenerinfoguias.split(" ");
            obtenerinfoguias = respuesta[1];
            respuesta = insertarlista.split(" ");
            insertarlista = respuesta[1];
        }catch(IOException e){
            System.out.println("Error:"+e.getMessage());
        }
    }

    public void crearadmisionrecogidaAPP(){

        if (errorServicio){
            interactorTime.esperaMilis(500);
            idRemitente = String.valueOf(DataRandom.identificacionR());
            idDestinatario = String.valueOf(DataRandom.identificacionD());
            telefonoRemitente = DataRandom.NumeroCelular();
            telefonoDestinatario = DataRandom.NumeroCelular();
            cedulaDestinatario = idDestinatario;
            cedulaRemintente = idRemitente;
            celularDestinatario = telefonoDestinatario;
            celularRemitente = telefonoRemitente;
            JtwigTemplate template = JtwigTemplate.classpathTemplate("APIS/CrearAdmisionRecogida.json");
            JtwigModel model = JtwigModel.newModel()
                    .with("identificacionR", idRemitente)
                    .with("identificacionD", idDestinatario)
                    .with("telefonoR",telefonoRemitente)
                    .with("telefonoD",telefonoDestinatario);
            try {
                JsonNode body = Unirest.post(crearadmision)
                        .header("Usuario","pam.brandon34")
                        .header("IdUsuario", "pam.brandon34")
                        .header("IdCentroServicio","4316")
                        .header("NombreCentroServicio", "PTO/BOGOTA/CUND/COL/DESDE LA CALLE 39 G # 8-18")
                        .header("IdAplicativoOrigen","9")
                        .header("Identificacion", "3821058503")
                        .header("Content-Type", "application/json")
                        .header("Accept","text/json")
                        .body(template.render(model))
                        .asJson()
                        .getBody();
                JSONArray body_array = body.getArray();
                for (int i = 0; i < body_array.length(); i++){
                    idPreFactura = body_array.getJSONObject(i).getLong("idPreFactura");
                    idRecogida = body_array.getJSONObject(i).getLong("idRecogida");
                    numeroGuia = body_array.getJSONObject(i).getLong("numeroGuia");
                }
            } catch (UnirestException e) {
                errorServicio = false;
                System.out.println("Fallo crear admision" + e);
            }catch (JSONException e){
                errorServicio = false;
                System.out.println("No responde el servicio con la data correcta 'API CREAR ADMISION'" + e);
            }
        }

    }

    public void ejecutarrecogida(){

        if (errorServicio){
            interactorTime.esperaMilis(500);
            JtwigTemplate template = JtwigTemplate.classpathTemplate("APIS/EjecutarRecogida.json");
            JtwigModel model = JtwigModel.newModel()
                    .with("id_prefactura", idPreFactura)
                    .with("id_recogida", idRecogida);
            try {
                JsonNode body = Unirest.post(ejecutarrecogida)
                        .header("Usuario","pam.cali34")
                        .header("dUsuario", "pam.cali34")
                        .header("IdCentroServicio","2241")
                        .header("NombreCentroServicio", "COL/CALI/VALL/COL/CALLE 66 #1 NORTE-67 DETRAS DEL CENTRO COMERCIAL LA 14 DE CALIMA")
                        .header("IdAplicativoOrigen","9")
                        .header("Identificacion", "6437920179")
                        .body(template.render(model))
                        .asJson()
                        .getBody();
            } catch (UnirestException e) {
                errorServicio = false;
                System.out.println("Fallo ejecutar la recogida" + e);
            }catch (JSONException e){
                errorServicio = false;
                System.out.println("No responde el servicio con la data correcta 'API EJECUTAR RECOGIDA'" + e);
            }
        }

    }

    public void informacionguia(){

        if (errorServicio){
            interactorTime.esperaMilis(10000);
            JtwigTemplate template = JtwigTemplate.classpathTemplate("APIS/ObtenerInfoGuiasPorListaGuias.json");
            JtwigModel model = JtwigModel.newModel()
                    .with("idGuia", numeroGuia);
            try {
                JsonNode body = Unirest.post(obtenerinfoguias)
                        .header("Content-Type","application/json")
                        .header("idToken",idToken)
                        .body(template.render(model))
                        .asJson()
                        .getBody();
                JSONArray body_array = body.getArray();
                for (int i = 0; i < body_array.length(); i++){
                    nombreRemitente = body_array.getJSONObject(i).getString("nombreRemitente");
                    idRemitente = body_array.getJSONObject(i).getString("idRemitente");
                    direccionDestinatario = body_array.getJSONObject(i).getString("direccionDestinatario");
                    emailDestinatario = body_array.getJSONObject(i).getString("emailDestinatario");
                    emailRemitente = body_array.getJSONObject(i).getString("emailRemitente");
                    nombreDestinatario = body_array.getJSONObject(i).getString("nombreDestinatario");
                    telefonoDestinatario = body_array.getJSONObject(i).getString("telefonoDestinatario");
                    direccionRemitente = body_array.getJSONObject(i).getString("direccionRemitente");
                    idDestinatario = body_array.getJSONObject(i).getString("idDestinatario");
                    telefonoRemitente = body_array.getJSONObject(i).getString("telefonoRemitente");
                    valorTotal = body_array.getJSONObject(i).getLong("valorTotal");
                }
            } catch (UnirestException e) {
                errorServicio = false;
                System.out.println("Fallo informacion guia" + e);
            }catch (JSONException e){
                errorServicio = false;
                System.out.println("No responde el servicio con la data correcta 'API INFORMACION GUIA'" + e);
            }
        }

    }

    public void ingresarlista(){

        if (errorServicio){
            interactorTime.esperaMilis(500);
            JtwigTemplate template = JtwigTemplate.classpathTemplate("APIS/InsertarClienteListaRestrictiva.json");
            JtwigModel model = JtwigModel.newModel()
                    .with("idRemitente",idRemitente)
                    .with("idDestinatario",idDestinatario)
                    .with("numeroGuia", numeroGuia)
                    .with("nombreRemitente",nombreRemitente)
                    .with("telefonoRemitente",telefonoRemitente)
                    .with("direccionRemitente",direccionRemitente)
                    .with("correoRemitente",emailRemitente)
                    .with("nombreDestinatario",nombreDestinatario)
                    .with("telefonoDestinatario",telefonoDestinatario)
                    .with("direccionDestinatario",direccionDestinatario)
                    .with("correoDestinatario",emailDestinatario)
                    .with("valorTotal", valorTotal);
            try {
                JsonNode body = Unirest.post(insertarlista)
                        .header("Content-Type","application/json")
                        .header("idToken",idToken)
                        .body(template.render(model))
                        .asJson()
                        .getBody();
            } catch (UnirestException e) {
                String[] data = new String[]{celularDestinatario,cedulaDestinatario,celularRemitente,cedulaRemintente};
                OustCsv.add(data);
                System.out.println(numeroGuia);
            }catch (JSONException e){
                errorServicio = false;
                System.out.println("No responde el servicio con la data correcta 'API INGRESAR LR'" + e);
            }
        }else {
            conteoErrores++;
            errorServicio = true;
        }

    }

    public void obtenertoken(){

        if (errorServicio){
            interactorTime.esperaMilis(500);
            JtwigTemplate template = JtwigTemplate.classpathTemplate("APIS/ObtenerToken.json");
            JtwigModel model = JtwigModel.newModel()
                    .with("login","RUiWSRxdMqwu/85264emLDquon6A2CIDejsIcD5Geeg6RuHZtyCCOSJy6CYY82l+")
                    .with("contrasena", "wCZ8/zWODL/rPVzGer1z56JBL+Ziy0kLMkDoZ7I9YVo=");
            try {
                JsonNode body = Unirest.post(obtenertoken)
                        .header("Content-Type","application/json")
                        .body(template.render(model))
                        .asJson()
                        .getBody();
                JSONArray body_array = body.getArray();
                String request = body_array.getJSONObject(0).toString();
                String[] respuesta = request.split(":");
                respuesta = respuesta[4].split(",");
                idToken = respuesta[0].replace("\"", "");
            } catch (UnirestException e) {
                errorServicio = false;
                System.out.println("Fallo token" + e);
            }catch (JSONException e){
                errorServicio = false;
                System.out.println("No responde el servicio con la data correcta 'API OBTENER TOKEN'" + e);
            }
        }

    }

    public void crearadmisionrecogidaWEB(long Id, long Celular){

        if (errorServicio){
            interactorTime.esperaMilis(500);
            idRemitente = String.valueOf(Id);
            idDestinatario = String.valueOf(DataRandom.identificacionD());
            telefonoRemitente = String.valueOf(Celular);
            telefonoDestinatario = DataRandom.NumeroCelular();
            cedulaDestinatario = idDestinatario;
            cedulaRemintente = idRemitente;
            celularDestinatario = telefonoDestinatario;
            celularRemitente = telefonoRemitente;
            JtwigTemplate template = JtwigTemplate.classpathTemplate("APIS/CrearAdmisionRecogida.json");
            JtwigModel model = JtwigModel.newModel()
                    .with("identificacionR", idRemitente)
                    .with("identificacionD", idDestinatario)
                    .with("telefonoR",telefonoRemitente)
                    .with("telefonoD",telefonoDestinatario);
            try {
                JsonNode body = Unirest.post(crearadmision)
                        .header("Usuario","pam.brandon34")
                        .header("IdUsuario", "pam.brandon34")
                        .header("IdCentroServicio","4316")
                        .header("NombreCentroServicio", "PTO/BOGOTA/CUND/COL/DESDE LA CALLE 39 G # 8-18")
                        .header("IdAplicativoOrigen","9")
                        .header("Identificacion", "3821058503")
                        .header("Content-Type", "application/json")
                        .header("Accept","text/json")
                        .body(template.render(model))
                        .asJson()
                        .getBody();
                JSONArray body_array = body.getArray();
                for (int i = 0; i < body_array.length(); i++){
                    idPreFactura = body_array.getJSONObject(i).getLong("idPreFactura");
                    idRecogida = body_array.getJSONObject(i).getLong("idRecogida");
                    numeroGuia = body_array.getJSONObject(i).getLong("numeroGuia");
                }
            } catch (UnirestException e) {
                errorServicio = false;
                System.out.println("Fallo crear admision" + e);
            }catch (JSONException e){
                errorServicio = false;
                System.out.println("No responde el servicio con la data correcta 'API CREAR ADMISION'" + e);
            }
        }

    }

    public static ArrayList<String[]> outCsv(){
        System.out.println("Total de error de guias: " + conteoErrores);
        return (ArrayList<String[]>) OustCsv;
    }

}
