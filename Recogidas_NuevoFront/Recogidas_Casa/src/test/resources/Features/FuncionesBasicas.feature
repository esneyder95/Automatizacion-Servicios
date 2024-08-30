@Funcionalidad_basicas @Pruebas_Regresion
Feature: Usuario mapea funciones basicas

  @Funcionalidad_basicas @Pruebas_Regresion
  Scenario: Validar mensaje de direccion no georeferenciada
    Given El campo de ingreso de direccion destinatario
    When Ingreso direccion no georeferenciada
    Then El mensaje de alerta se visualiza
