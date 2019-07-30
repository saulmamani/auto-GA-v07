package testingui.diplomadoumss.org.managepage.nasa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

public class Nasa extends BasePage {

    @FindBy(xpath = "//li[@data-unique='api-listing']")
    private WebElement apiListingMenu;

    @FindBy(xpath = "//li[@data-unique='earth']")
    private WebElement earthMenu;

    @FindBy(xpath = "//li[@data-unique='imagery']")
    private WebElement imagerySubMenu;

    public Nasa() {
        avoidToUse(3);
    }

    public Nasa clickApiListingMenu() {
        clickWebElement(apiListingMenu);
        return this;
    }

    public Nasa clickEarthMenuPanelIzquierdo() {
        clickWebElement(earthMenu);
        return this;
    }

    public NasaImagery clickImageryPanelIzquierdo() {
        clickWebElement(imagerySubMenu);
        return new NasaImagery();
    }
}
