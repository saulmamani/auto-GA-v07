package testingui.diplomadoumss.org.managepage.Suppliers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

public class Suppliers extends BasePage {
    @FindBy(xpath = "//a[@data-task='print']")
    private WebElement printButton;

    @FindBy(xpath = "//a[@data-task='csv']")
    private WebElement printButtonExport;

    //TODO xpath real
    @FindBy(xpath = "//button[@data-limit='all']")
    private WebElement allButton;

    //TODO xpath real
    @FindBy(xpath = "//a[@class='xcrud-search-toggle btn btn-default']")
    private WebElement searchButton;

    //TODO xpath real
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement addButton;

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
}
