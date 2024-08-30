package org.servicios.ListaRestricitiva.Steps;

import net.serenitybdd.core.pages.PageObject;
import org.servicios.ListaRestricitiva.PageObject.Ejecuciones;
import org.servicios.ListaRestricitiva.Utils.DataCVS;

public class Stepsservicios extends PageObject {

    Ejecuciones ejecuciones = new Ejecuciones();
    DataCVS dataCVS = new DataCVS();

    public void stepadmisionAPP(){
        ejecuciones.leerarchivo();
        ejecuciones.crearadmisionrecogidaAPP();
        ejecuciones.ejecutarrecogida();
    }

    public void stepadmisionWEB(long Id, long Telefono){
        ejecuciones.leerarchivo();
        ejecuciones.crearadmisionrecogidaWEB(Id,Telefono);
        ejecuciones.ejecutarrecogida();
    }

    public void insertarlista(){
        ejecuciones.obtenertoken();
        ejecuciones.informacionguia();
        ejecuciones.ingresarlista();
    }

    public void crearexcel(){
        dataCVS.CrearCsv();
    }

}
