@Pruebas_Regresion
Feature: Usuario crea envios de diferentes modos de pago

  @Pruebas_Regresion
  Scenario: Crear envio forma de pago contado
    Given Usuario frecuente agrega un envio
    When Ingreso cotizacion de envio de contado
    Then El envio se crea exitosamente