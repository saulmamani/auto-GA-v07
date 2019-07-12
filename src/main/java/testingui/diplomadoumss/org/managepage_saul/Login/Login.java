package testingui.diplomadoumss.org.managepage_saul.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage_saul.BasePageSaul;

public class Login extends BasePageSaul {
    @FindBy(xpath = "//input[@name='email' and @type='text']")
    private WebElement usernameTextField;

    @FindBy(xpath = "//input[@name='password' and @type='password']")
    private WebElement passwordTextField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonSubmit;

    public void setEmail(String email){
        usernameTextField.sendKeys(email);
    }

    public void setPassword(String password){
        passwordTextField.sendKeys(password);
    }

    public void inicializateWeb()
    {
        //webDriver.get(PropertyAccesor.getInstance().getURL());
        buttonSubmit.click();
    }
}
