package testingui.diplomadoumss.org.managepage_saul;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import testingui.diplomadoumss.org.core.WebDriverManager;

public class BasePageSaul {
    protected WebDriver webDriver;

    public BasePageSaul() {
        this.webDriver = WebDriverManagerSaul.getInstance().getWebDriver();
        PageFactory.initElements(webDriver, this);
    }
}
