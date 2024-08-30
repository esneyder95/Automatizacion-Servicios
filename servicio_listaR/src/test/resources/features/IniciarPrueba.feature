@ListaR_APP
Feature: Pruebas de carga Lista Restricitiva

  @ListaR_APP
  Scenario Outline: Correr Servicios
    Given Admitir envios APP <numero_guias>
    When ingresar a lista restricitiva APP
    Then crear excel

    Examples:
    |numero_guias|
    |          1|

  @ListaR_PagosEnvios
  Scenario Outline: Correr Servicios
    Given Admitir envios Sitio WEB <IdCliente> <TelefonoCliente> <numero_guias>
    When ingresar a lista restricitiva Sitio WEB <IdCliente> <TelefonoCliente>
    Then crear excel

    Examples:
      |IdCliente |TelefonoCliente|numero_guias|
      |1024567308|     3105761988|           1|