package testingui.diplomadoumss.org.managepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import testingui.diplomadoumss.org.core.WebDriverManager;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class BasePage {
    protected WebDriver webDriver;

    public BasePage() {
        this.webDriver = WebDriverManager.getInstance().getWebDriver();
        PageFactory.initElements(webDriver, this);
    }
}
