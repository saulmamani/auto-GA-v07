package testingui.diplomadoumss.org.managepage.Suppliers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

public class Suppliers extends BasePage {
    @FindBy(xpath = "//a[@data-task='print']")
    private WebElement printButton;

    public Suppliers() {
        avoidToUse(5);
    }


    public Suppliers clickButtonPrint() {
        clickWebElement(printButton);
        return this;
    }
}
