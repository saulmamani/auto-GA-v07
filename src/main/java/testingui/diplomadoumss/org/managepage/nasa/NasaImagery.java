package testingui.diplomadoumss.org.managepage.nasa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;

public class NasaImagery extends BasePage {

    public String urlText = "";

    @FindBy(xpath = "//code[contains(text(), 'GET https://api.nasa.gov/planetary/earth/imagery')]")
    private WebElement alink;

    public NasaImagery() {
        avoidToUse(3);
    }

    public NasaImagery getLinkSectionGET() {
        String texto = alink.getText();
        this.urlText = texto;
        System.out.println(texto);
        return this;
    }
}
