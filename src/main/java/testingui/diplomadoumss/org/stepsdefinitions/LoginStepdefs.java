package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.cars.Cars;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

public class LoginStepdefs {
    private Login login;
    private Dashboard dashboard;

    private Cars cars;
//    public LoginStepdefs() {
//        Given("^I load PHP Travels$", () -> {
//        });
//    }

    @Given("^I load PHP Travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPHPTravels();
    }

    @And("^Set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click 'Cars' link on 'Left Panel' page$")
    public void clickCarsLinkOnLeftPanelPage() throws Throwable {
        cars = dashboard.selectCars();
    }
}
