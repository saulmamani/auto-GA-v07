package testingui.diplomadoumss.org.utilsfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyAccesorSaul {
    private static PropertyAccesorSaul ourInstance = new PropertyAccesorSaul();
    private Properties prop;

    public static PropertyAccesorSaul getInstance() {
        return ourInstance;
    }

    private PropertyAccesorSaul() {
        try (InputStream input = new FileInputStream("gradle_saul.properties")) {
            prop = new Properties();
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getURL(){
        return prop.getProperty("url");
    }

    public String getBrowser(){
        return prop.getProperty("browser");
    }

    public String getUserName(){
        return prop.getProperty("username");
    }

    public String getPassword(){
        return prop.getProperty("password");
    }

    public static void main(String[] args) {
        System.out.println(PropertyAccesorSaul.getInstance().getURL());
        System.out.println(PropertyAccesorSaul.getInstance().getUserName());
        System.out.println(PropertyAccesorSaul.getInstance().getPassword());
    }
}
