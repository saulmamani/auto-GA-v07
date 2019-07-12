package testingui.diplomadoumss.org.managepage_saul;

import org.openqa.selenium.WebDriver;
import testingui.diplomadoumss.org.core.BroserType;
import testingui.diplomadoumss.org.core.Browser;
import testingui.diplomadoumss.org.core.DriverFactory;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesorSaul;

public class WebDriverManagerSaul {
    private static WebDriverManagerSaul ourInstance = new WebDriverManagerSaul();
    private WebDriver webDriver;

    public static WebDriverManagerSaul getInstance() {
        return ourInstance;
    }

    private WebDriverManagerSaul() {
        BroserType browserType = BroserType.valueOf(PropertyAccesorSaul.getInstance().getBrowser());
        Browser browser = DriverFactory.getInstance().getBrowser(browserType);
        webDriver =  browser.getWebDriver();
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }
}
