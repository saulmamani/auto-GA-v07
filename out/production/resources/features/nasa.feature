Feature: Casos de prueba para la pagina de la nasa

  Scenario: Resolucion del examen
    Given I load Nasa Page
    And Click NASA API Listing
    And Click NASA API Listing (segunda vez)
    And Click Earth (Panel izquierdo)
    And Click Imagery (sub menu)
    And Obtener el siguiente link de la seccion:GET https://api.nasa.gov/planetary/earth/imagery
    And Comparar con el texto "GET https://api.nasa.gov/planetary/earth/imagery" si es igual