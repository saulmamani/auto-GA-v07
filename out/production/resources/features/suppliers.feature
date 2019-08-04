Feature: Casos de prueba la funcionalidad Suppliers

  Background: User in Login Page
    Given I load PHP travels Page
    And Set my credencials in Login Page

#    1
  Scenario: Verificar que cargue la lista de suppliers el presionar el menú "SUPPLIERS"
    Given open menu 'Accounts' and click in sub menu'Suppliers'
#      And logout Page

#  2
  Scenario: Verificar que se muestre el reporte de “Suppliers” en un popup al presionar el botón “PRINT”
    Given open menu 'Accounts' and click in sub menu'Suppliers'
    And click in button 'Print' on 'Suppliers'
#      And logout Page

#  3
  Scenario: Verificar que se realice la exportación CSV al presionar el botón "EXPORT INTO CSV"
    Given open menu 'Accounts' and click in sub menu'Suppliers'
    And click in button 'Export' on 'Suppliers'
#      And logout Page

#  4
  Scenario: Verificar que el botón "ALL" muestre todos los registros de "Suppliers"
    Given open menu 'Accounts' and click in sub menu'Suppliers'
    And click in button 'ALL' of pagination
#      And logout Page

#  5
  Scenario: Verificar que se muestren los campos de búsqueda al presionar el botón "SEARCH"
    Given open menu 'Accounts' and click in sub menu'Suppliers'
    And click in button 'SEARCH' of pagination to search records
#      And logout Page

#  6
  Scenario: Verificar que el botón "GO" realice la búsqueda de "Suppliers"
    Given open menu 'Accounts' and click in sub menu'Suppliers'
    And click in button 'SEARCH' of pagination to search records
    And set data in the search Form and click in button 'Go'
#      And logout Page

#  7
  Scenario: Verificar que se abra el formulario "Suppliers" al presionar el botón "ADD"
    Given open menu 'Accounts' and click in sub menu'Suppliers'
    And click in button 'ADD' on 'Suppliers'

#  8
  Scenario: Verificar que el botón "DELETE" muestre el mensaje de confirmación
    Given open menu 'Accounts' and click in sub menu'Suppliers'
    And click in button 'DELETE'

#  8
  Scenario: Verificar que el botón "Cancelar" del mensaje de confirmación, cancela la eliminación del "supplier" seleccionado
    Given open menu 'Accounts' and click in sub menu'Suppliers'
    And click in button 'DELETE'
    And click in button 'Cancel' from confirmation message

#  10
  Scenario: Verificar que se muestren los mensajes de validación al presionar el botón "SUBMIT"
    Given open menu 'Accounts' and click in sub menu'Suppliers'
    And click in button 'ADD' on 'Suppliers'
    And set data in 'Suppliers' form and click in button 'SUBMIT'
