Feature: Casos de prueba la funcionalidad Suppliers

  Background: User in Login Page
    Given I load PHP travels Page
    And Set my credencials in Login Page

    Scenario: Verificar que cargue la lista de suppliers el presionar el menú "SUPPLIERS"
      Given open menu 'Accounts' and click in sub menu'Suppliers'

    Scenario: Verificar que se muestre el reporte de “Accounts” en un popup al presionar el botón “PRINT”
      Given open menu 'Accounts' and click in sub menu'Suppliers'
      And click in button 'Print' on 'Suppliers'