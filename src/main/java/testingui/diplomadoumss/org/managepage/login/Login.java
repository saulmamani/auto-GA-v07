package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

/**
 * @author Marcelo Garay, saul mamani
 * @project testingui.diplomadoumss.org
 */
public class Login extends BasePage {

    @FindBy(xpath = "//input[@name='email' and @type='text']")
    public WebElement emailTextField;

    @FindBy(xpath = "//input[@name='password' and @type='password']")
    private WebElement passwordTextField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonSubmit;

    public void setEmail(String email){
        emailTextField.sendKeys(email);
    }

    public void setPassword(String password){
        passwordTextField.sendKeys(password);
    }

    public void pressButton()
    {
        buttonSubmit.click();
    }

    public void inicializateWeb()
    {
        webDriver.get(PropertyAccesor.getInstance().getURL());
    }

    public void finishWeb() {
        webDriver.quit();
    }
}
