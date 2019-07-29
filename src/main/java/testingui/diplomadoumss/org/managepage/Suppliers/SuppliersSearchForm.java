package testingui.diplomadoumss.org.managepage.Suppliers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class SuppliersSearchForm extends BasePage {

    //TODO xpath real
    @FindBy(xpath = "//input[@name='search' and @type='text']")
    private WebElement searchTextField;

    //TODO xpath real
    @FindBy(xpath = "//input[@name='select' and @type='list']")
    private WebElement columnSelectField;

    //TODO xpath real
    @FindBy(xpath="//button[@type='submit']")
    private WebElement goButton;


    public SuppliersSearchForm() {
        avoidToUse(5);
    }

    public SuppliersSearchForm setSearchText(String searchText)
    {
        fillWebElement(searchTextField, searchText);
        return this;
    }

    public SuppliersSearchForm setColumnSelect(String columnText)
    {
        fillWebElement(columnSelectField, columnText);
        return this;
    }

    public Suppliers clickGoButton()
    {
        clickWebElement(goButton);
        return new Suppliers();
    }

    public Suppliers setDataAndClick() {
        return setSearchText("%").
                setColumnSelect("Name").
                clickGoButton();
    }
}
