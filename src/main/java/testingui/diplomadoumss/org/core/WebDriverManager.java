package testingui.diplomadoumss.org.core;

import org.openqa.selenium.WebDriver;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class WebDriverManager {
    private static WebDriverManager ourInstance = new WebDriverManager();
    private WebDriver webDriver;
    public static WebDriverManager getInstance() {
        return ourInstance;
    }

    private WebDriverManager() {
        BroserType browserType = BroserType.valueOf(PropertyAccesor.getInstance().getBrowser());
        Browser browser = DriverFactory.getInstance().getBrowser(browserType);
        webDriver =  browser.getWebDriver();
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }
}