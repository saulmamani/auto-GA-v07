package testingui.diplomadoumss.org.core;

import java.util.HashMap;
import java.util.Map;

/**
 * Implement the Factory Pattern Design about the selection of WebDriver
 * @author Marcelo Garay
 */
public class DriverFactory {
    private static DriverFactory ourInstance = new DriverFactory();

    public static DriverFactory getInstance() {
        return ourInstance;
    }

    private DriverFactory() {
    }

    public Browser getBrowser(BroserType broserType){
        Map<BroserType, Browser> browserSettings = new HashMap<>();
        browserSettings.put(BroserType.CHROME, new Chrome());
        browserSettings.put(BroserType.FIREFOX, new Firefox());

        return browserSettings.get(broserType);
    }
}
