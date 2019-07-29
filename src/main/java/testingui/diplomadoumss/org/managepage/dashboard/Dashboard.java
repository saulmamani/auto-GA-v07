package testingui.diplomadoumss.org.managepage.dashboard;

import static testingui.diplomadoumss.org.manageevents.Event.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.Suppliers.Suppliers;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Dashboard extends BasePage {

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), 'Bookings')]")
    private WebElement bookingLink;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Cars') and @aria-expanded='false']")
    private WebElement carsExpand;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Accounts') and @aria-expanded='false']")
    private WebElement accountsExpand;

    @FindBy(xpath = "//a[@href='https://www.phptravels.net/admin-portal/admin/accounts/suppliers/']")
    private WebElement suppliersMenu;

    //TODO refactorizar el path real
    @FindBy(xpath="//button[@type='button']")
    private WebElement logoutButton;



    public Dashboard() {
//        isWebElementVisible(bookingLink);
        avoidToUse(5);
    }

    public Dashboard clickCarsExpand() {
        clickWebElement(carsExpand);
        return this;
    }


    public Dashboard clickAccountsExpand(){
        clickWebElement(accountsExpand);
        return this;
    }

    public Suppliers clickSuppliersMenu(){
        clickWebElement(suppliersMenu);
        return new Suppliers();
    }

    public Suppliers openPageSuppliers() {
        return clickAccountsExpand().clickSuppliersMenu();
    }

    public Dashboard clickLogOut() {
        clickWebElement(logoutButton);
        return this;
    }
}
