package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.Suppliers.Suppliers;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

public class SuppliersStepdefs {
    private Login login;
    private Dashboard dashboard;
    private Suppliers suppliers;

    @Given("^I load PHP travels Page$")
    public void iLoadPHPTravelsPage() {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^Set my credencials in Login Page$")
    public void setMyCredencialsInLoginPage() {
        dashboard = login.setCredentials();
    }

    @Given("^open menu 'Accounts' and click in sub menu'Suppliers'$")
    public void openMenuAccountsAndClickInSubMenuSuppliers() {
        suppliers = dashboard.openPageSuppliers();
    }

    @Given("^click in button 'Print' on 'Suppliers'$")
    public void clickInButtonPrintOnSuppliers() {
        suppliers.clickButtonPrint();
    }

    @And("^logout Page$")
    public void logoutPage() {
        dashboard.clickLogOut();
    }
}
