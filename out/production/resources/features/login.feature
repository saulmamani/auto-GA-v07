Feature: Validactiones de la pagina de Login

  Scenario: Cargar Pagina PHP Travels
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'Cars' link on 'Left Panel' page

  Scenario: Verificar que se muestre el reporte de “Accounts” en un popup al presionar el botón “PRINT”
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And open menu 'Accounts' and click in 'Suppliers'
    And click button 'Print' on 'Suppliers'