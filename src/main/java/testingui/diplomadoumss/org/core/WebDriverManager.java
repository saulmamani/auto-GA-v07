package testingui.diplomadoumss.org.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import java.util.concurrent.TimeUnit;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class WebDriverManager {
    private static WebDriverManager ourInstance = new WebDriverManager();
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;
    private static final int IMPLICIT_TIME_WAIT = PropertyAccesor.getInstance().getImplicitTimeWait();
    private static final int EXPLICIT_TIME_WAIT = PropertyAccesor.getInstance().getExplicitTimeWait();

    public static WebDriverManager getInstance() {
        return ourInstance;
    }

    private WebDriverManager() {
        BroserType browserType = BroserType.valueOf(PropertyAccesor.getInstance().getBrowser());
        Browser browser = DriverFactory.getInstance().getBrowser(browserType);
        webDriver =  browser.getWebDriver();
        webDriver.manage().window().maximize();
        restorePreviousTimeWait();
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }

    public void restorePreviousTimeWait() {
        setImplicitTimeWait(IMPLICIT_TIME_WAIT);
        setExplicitTimeWait(EXPLICIT_TIME_WAIT);
    }

    public void setImplicitTimeWait(int implicitTimeWait) {
        webDriver.manage().timeouts().implicitlyWait(implicitTimeWait, TimeUnit.SECONDS);
    }

    public void setExplicitTimeWait(int explicitTimeWait) {
        webDriverWait = new WebDriverWait(webDriver, explicitTimeWait);
    }

    public WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }
}
