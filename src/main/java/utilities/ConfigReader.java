package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    Properties prop;

    public ConfigReader() {
        File src = new File(System.getProperty("user.dir")+ "/src/main/resources/properties/application.properties");
        try(FileInputStream fis = new FileInputStream(src)){
            prop = new Properties();
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getApplicationUrl() {
        return prop.getProperty("url");
    }

}
