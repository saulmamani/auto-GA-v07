package testingui.diplomadoumss.org.core;

import org.openqa.selenium.WebDriver;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.managepage_saul.WebDriverManagerSaul;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesorSaul;

import java.util.HashMap;
import java.util.Map;

public class FirstExample {
    public static void main(String[] args) {
//        Login login = new Login();
//        login.setEmail(PropertyAccesor.getInstance().getUserName());
//        login.setPassword(PropertyAccesor.getInstance().getPassword());
//        login.inicializateWeb();

        WebDriver webDriver = WebDriverManager.getInstance().getWebDriver();
        webDriver.get(PropertyAccesor.getInstance().getURL());

        //para la pagina de saul
        WebDriver webDriverSaul = WebDriverManagerSaul.getInstance().getWebDriver();
        webDriverSaul.get(PropertyAccesorSaul.getInstance().getURL());

        //webDriver.quit();
        //webDriverSaul.quit();
    }

    public static void exampleMap(){
        Map<String, String> students = new HashMap<>();
        students.put("101", "nombre 1");
        students.put("102", "nombre 2");
        students.put("103", "nombre 3");

        System.out.println(students.get("102"));
    }
}
