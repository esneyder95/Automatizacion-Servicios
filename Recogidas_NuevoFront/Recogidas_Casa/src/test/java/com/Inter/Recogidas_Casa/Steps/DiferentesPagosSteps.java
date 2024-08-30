package com.Inter.Recogidas_Casa.Steps;

import com.Inter.Recogidas_Casa.PageObjects.*;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class DiferentesPagosSteps extends PageObject {

    CiudadEnvioPage ciudadEnvioPage = new CiudadEnvioPage();
    PesoEnvioPage pesoEnvioPage = new PesoEnvioPage();
    ContenidoEnvioPage contenidoEnvioPage = new ContenidoEnvioPage();
    ValorComercialEnvioPage valorComercialEnvioPage = new ValorComercialEnvioPage();
    OpcionPagaEnvioPage opcionPagaEnvioPage = new OpcionPagaEnvioPage();
    CuentaBancariaPage cuentaBancariaPage = new CuentaBancariaPage();
    ListarServiciosPage listarServiciosPage = new ListarServiciosPage();
    ListarRecogidasPage listarRecogidasPage = new ListarRecogidasPage();
    IndentificacionDestinatarioPage indentificacionDestinatarioPage = new IndentificacionDestinatarioPage();
    UbicacionDestinatarioPage ubicacionDestinatarioPage = new UbicacionDestinatarioPage();
    ContactoDestinatarioPage contactoDestinatarioPage = new ContactoDestinatarioPage();
    ImpresionGuiaPage impresionGuiaPage = new ImpresionGuiaPage();
    InformacionEnvioPage informacionEnvioPage = new InformacionEnvioPage();

    @Step
    public void agregarpreenvio(){
        listarRecogidasPage.listarecogidas();
    }

    @Step
    public void pagocontado() {
        ciudadEnvioPage.pagocontado();
        pesoEnvioPage.peso();
        contenidoEnvioPage.contenido();
        valorComercialEnvioPage.pagocontado();
        opcionPagaEnvioPage.pagocontado();
        listarServiciosPage.listarservicios();
        indentificacionDestinatarioPage.identificaciondestinatario();
        ubicacionDestinatarioPage.ubicaciondestinatario();
        contactoDestinatarioPage.crearenvio();
    }

    @Step
    public void pagocobro() {
        ciudadEnvioPage.pagocobro();
        pesoEnvioPage.peso();
        contenidoEnvioPage.contenido();
        valorComercialEnvioPage.pagocontado();
        opcionPagaEnvioPage.pagocobro();
        listarServiciosPage.listarservicios();
        indentificacionDestinatarioPage.identificaciondestinatario();
        ubicacionDestinatarioPage.ubicaciondestinatario();
        contactoDestinatarioPage.crearenvio();
    }

    @Step
    public void pagocasacontado() {
        ciudadEnvioPage.pagocobro();
        pesoEnvioPage.peso();
        contenidoEnvioPage.contenido();
        valorComercialEnvioPage.pagocasa();
        opcionPagaEnvioPage.pagocontado();
        cuentaBancariaPage.cuentabancaria();
        listarServiciosPage.listarservicios();
        indentificacionDestinatarioPage.identificaciondestinatario();
        ubicacionDestinatarioPage.ubicaciondestinatario();
        contactoDestinatarioPage.crearenvio();
    }

    @Step
    public void pagocasacobro(){
        ciudadEnvioPage.pagocobro();
        pesoEnvioPage.peso();
        contenidoEnvioPage.contenido();
        valorComercialEnvioPage.pagocasa();
        opcionPagaEnvioPage.pagocobro();
        cuentaBancariaPage.cuentabancaria();
        listarServiciosPage.listarservicios();
        indentificacionDestinatarioPage.identificaciondestinatario();
        ubicacionDestinatarioPage.ubicaciondestinatario();
        contactoDestinatarioPage.crearenvio();
    }

    @Step
    public void pagoconvenio(){
        ciudadEnvioPage.pagoconvenio();
        pesoEnvioPage.peso();
        contenidoEnvioPage.contenido();
        valorComercialEnvioPage.pagocontado();
        listarServiciosPage.listarservicios();
        indentificacionDestinatarioPage.identificaciondestinatarioconvenio();
        ubicacionDestinatarioPage.ubicaciondestinatarioconvenio();
        contactoDestinatarioPage.crearenvioconvenio();
    }

    @Step
    public void envioexitoso(){
        impresionGuiaPage.impresionguia();
        informacionEnvioPage.finalizarenvio();
    }

}
