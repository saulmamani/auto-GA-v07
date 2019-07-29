package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.Suppliers.Suppliers;
import testingui.diplomadoumss.org.managepage.Suppliers.SuppliersForm;
import testingui.diplomadoumss.org.managepage.Suppliers.SuppliersSearchForm;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

public class SuppliersStepdefs {
    private Login login;
    private Dashboard dashboard;
    private Suppliers suppliers;
    private SuppliersSearchForm suppliersSearchForm;
    private SuppliersForm suppliersForm;

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

    @And("^click in button 'ALL' of pagination$")
    public void clickInButtonALLOfPagination() {
        suppliers.clickButtonAllPagination();
    }

    @And("^click in button 'SEARCH' of pagination to search records$")
    public void clickEnButtonSEARCHOfPaginationToSeachRecords() {
        suppliersSearchForm = suppliers.clickButtonSearch();
    }

    @And("^set data in the search Form and click in button 'Go'$")
    public void setDataInTheSearchFormAndClickInButtonGo() {
        suppliers = suppliersSearchForm.setDataAndClick();
    }

    @And("^click in button 'ADD' on 'Suppliers'$")
    public void clickInButtonADDOnSuppliers() {
        suppliersForm = suppliers.clickButtonAdd();
    }
}
