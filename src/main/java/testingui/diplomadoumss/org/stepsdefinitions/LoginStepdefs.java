package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.Suppliers.Suppliers;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class LoginStepdefs {
    private Login login;
    private Dashboard dashboard;
    private Suppliers suppliers;

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() {
        dashboard = login.setCredentials();
    }

    @And("^click 'Cars' link on 'Left Panel' page$")
    public void clickCarsLinkOnLeftPanelPage() {
        dashboard.clickCarsExpand();
    }

    @And("^open menu 'Accounts' and click in 'Suppliers'$")
    public void openMenuAccountsAndClickInSuppliers() {
        suppliers = dashboard.openPageSuppliers();
    }

    @And("^click button 'Print' on 'Suppliers'$")
    public void clickButtonPrintOnSuppliers() {
        suppliers.clickButtonPrint();
    }
}
