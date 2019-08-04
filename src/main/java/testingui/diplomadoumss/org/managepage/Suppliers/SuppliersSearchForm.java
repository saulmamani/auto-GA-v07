package testingui.diplomadoumss.org.managepage.Suppliers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class SuppliersSearchForm extends BasePage {

    //TODO xpath real
    @FindBy(xpath = "//input[@name='phrase' and @type='text']")
    private WebElement searchTextField;

    //TODO xpath real
    @FindBy(xpath = "//select[@name='column']")
    private WebElement columnSelectField;

    //TODO xpath real
    @FindBy(xpath = "//option[@value='pt_accounts.ai_first_name' and @data-type='text']")
    private WebElement itemColumnSelectField;

    //TODO xpath real
    @FindBy(xpath="//a[@class='xcrud-action btn btn-primary' and @data-search='1']")
    private WebElement goButton;


    public SuppliersSearchForm() {
        avoidToUse(3);
    }

    public SuppliersSearchForm setSearchText(String searchText)
    {
        fillWebElement(searchTextField, searchText);
        return this;
    }

    public SuppliersSearchForm clickItemColumnSelect()
    {
        clickWebElement(itemColumnSelectField);
        return this;
    }

    public SuppliersSearchForm clickColumSelect()
    {
        clickWebElement(columnSelectField);
        return this;
    }

    public Suppliers clickGoButton()
    {
        clickWebElement(goButton);
        return new Suppliers();
    }

    public Suppliers setDataAndClick() {
        return setSearchText("demo").
                clickColumSelect().
                clickItemColumnSelect().
                clickGoButton();
    }
}
