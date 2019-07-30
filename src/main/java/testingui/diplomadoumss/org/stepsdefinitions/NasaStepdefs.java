package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.nasa.Nasa;
import testingui.diplomadoumss.org.managepage.nasa.NasaImagery;

public class NasaStepdefs {
    private Nasa nasa;
    private NasaImagery nasaImagery;

    @Given("^I load Nasa Page$")
    public void iLoadNasaPage() {
        nasa = LoadPage.loadNasaPage();
    }

    @And("^Click NASA API Listing$")
    public void clickNASAAPIListing() {
        nasa = nasa.clickApiListingMenu();
    }

    @And("^Click NASA API Listing \\(segunda vez\\)$")
    public void clickNASAAPIListingSegundaVez() {
        nasa = nasa.clickApiListingMenu();
    }

    @And("^Click Earth \\(Panel izquierdo\\)$")
    public void clickEarthPanelIzquierdo() {
        nasa = nasa.clickEarthMenuPanelIzquierdo();
    }

    @And("^Click Imagery \\(sub menu\\)$")
    public void clickImagerySubMenu() {
        nasaImagery = nasa.clickImageryPanelIzquierdo();
    }

    @And("^Obtener el siguiente link de la seccion:GET https://api\\.nasa\\.gov/planetary/earth/imagery$")
    public void obtenerElSiguienteLinkDeLaSeccionGETHttpsApiNasaGovPlanetaryEarthImagery() {
        nasaImagery = nasaImagery.getLinkSectionGET();
    }

    @And("^Comparar con el texto \"([^\"]*)\" si es igual$")
    public void compararConElTextoSiEsIgual(String arg0) throws Throwable {
        if(nasaImagery.urlText.compareTo("GET https://api.nasa.gov/planetary/earth/imagery") == 0)
            System.out.println("\nLas UR Son iguales");
        else
            System.out.println("\nLas URL Son distintos");
    }
}
