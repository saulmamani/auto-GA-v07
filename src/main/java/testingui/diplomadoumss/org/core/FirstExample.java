package testingui.diplomadoumss.org.core;

import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import java.util.HashMap;
import java.util.Map;

public class FirstExample {
    public static void main(String[] args) {
        Login login = new Login();
        login.setEmail(PropertyAccesor.getInstance().getUserName());
        login.setPassword(PropertyAccesor.getInstance().getPassword());
        login.pressButton();
        login.inicializateWeb();

        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        login.finishWeb();

//        WebDriver webDriver = WebDriverManager.getInstance().getWebDriver();
//        webDriver.get(PropertyAccesor.getInstance().getURL());
        //webDriver.quit();
    }

    public static void exampleMap(){
        Map<String, String> students = new HashMap<>();
        students.put("101", "nombre 1");
        students.put("102", "nombre 2");
        students.put("103", "nombre 3");

        System.out.println(students.get("102"));
    }
}
