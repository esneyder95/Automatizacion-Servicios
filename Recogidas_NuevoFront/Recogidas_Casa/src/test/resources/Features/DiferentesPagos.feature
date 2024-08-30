@Pruebas_Afectacion @Pruebas_Regresion
Feature: Usuario crea envios de diferentes modos de pago

  @Pruebas_Afectacion @Pruebas_Regresion
  Scenario: Crear envio forma de pago contado
    Given Usuario frecuente agrega un envio
    When Ingreso cotizacion de envio de contado
    Then El envio se crea exitosamente

  @Pruebas_Afectacion @Pruebas_Regresion
  Scenario: Crear envio forma de pago al cobro
    Given Usuario frecuente agrega un envio
    When Ingreso cotizacion de envio al cobro
    Then El envio se crea exitosamente

  @Pruebas_Afectacion @Pruebas_Regresion
  Scenario: Crear envio forma de pago en casa al contado
    Given Usuario frecuente agrega un envio
    When Ingreso cotizacion de envio pago en casa al contado
    Then El envio se crea exitosamente

  @Pruebas_Afectacion @Pruebas_Regresion
  Scenario: Crear envio forma de pago en casa al cobro
    Given Usuario frecuente agrega un envio
    When Ingreso cotizacion de envio pago en casa al cobro
    Then El envio se crea exitosamente

  @Pruebas_Afectacion @Pruebas_Regresion
  Scenario: Crear envio forma de pago convenio
    Given Usuario frecuente agrega un envio
    When Ingreso cotizacion de envio convenio
    Then El envio se crea exitosamente