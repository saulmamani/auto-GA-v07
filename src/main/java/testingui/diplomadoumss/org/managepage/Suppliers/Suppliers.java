package testingui.diplomadoumss.org.managepage.Suppliers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.WebDriverManager;
import testingui.diplomadoumss.org.managepage.BasePage;
import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

public class Suppliers extends BasePage {
    @FindBy(xpath = "//a[@data-task='print']")
    private WebElement printButton;

    @FindBy(xpath = "//a[@data-task='csv']")
    private WebElement printButtonExport;

    @FindBy(xpath = "//button[@data-limit='all']")
    private WebElement allButton;

    @FindBy(xpath = "//a[@class='xcrud-search-toggle btn btn-default']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement addButton;

    @FindBy(xpath = "//a[@target='_self' and @id='32']")
    private WebElement deleteButton;


    public Suppliers() {
        avoidToUse(5);
    }

    public Suppliers clickButtonPrint() {
        clickWebElement(printButton);
        return this;
    }

    public Suppliers clickButtonExport() {
        clickWebElement(printButtonExport);
        return this;
    }

    public Suppliers clickButtonAllPagination() {
        clickWebElement(allButton);
        return this;
    }

    public SuppliersSearchForm clickButtonSearch() {
        clickWebElement(searchButton);
        return new SuppliersSearchForm();
    }

    public SuppliersForm clickButtonAdd() {
        clickWebElement(addButton);
        return new SuppliersForm();
    }

    public Suppliers clickButtonDelete() {
        clickWebElement(deleteButton);
        return this;
    }

    public void clickButtonCancelConfirmation() {
        Alert alert = WebDriverManager.getInstance().getWebDriver().switchTo().alert();
        avoidToUse(5);
        alert.dismiss();
    }
}
