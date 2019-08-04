package testingui.diplomadoumss.org.managepage.Suppliers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class SuppliersForm {

    @FindBy(xpath = "//input[@name='fname' and @type='text']")
    private WebElement fnameTextField;

    @FindBy(xpath="//button[text() = 'Submit']")
    private WebElement submitButton;

    public SuppliersForm() {
        avoidToUse(7);
    }

    private SuppliersForm setFnameTextField(String fname)
    {
        fillWebElement(fnameTextField, fname);
        avoidToUse(4);
        return this;
    }

    public SuppliersForm clickSubmitButton() {
        clickWebElement(submitButton);
        return this;
    }

    public SuppliersForm validateForm() {
        return setFnameTextField("na");
    }
}
