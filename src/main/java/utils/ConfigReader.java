package utils;

import enums.EnvironmentType;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties properties;
    private EnvironmentType environment = EnvironmentType.LOCAL;

    public ConfigReader(){
        try {
            FileInputStream  fis=new FileInputStream("src/main/config/Config.properties");
            properties= new Properties();
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperties(String key){
        return properties.getProperty(key);
    }

    public String getProperty(String browser) {
        return properties.getProperty(browser);
    }
    public String getAppURL() {
        switch (environment) {
            case LOCAL:
                return "http://localhost:8080/myapp";
            case DEV:
                return "http://dev.example.com";
            case QA:
                return "http://qa.example.com";
            case STAGING:
                return "http://staging.example.com";
            case PRODUCTION:
                return "http://www.example.com";
            default:
                throw new IllegalArgumentException("Unsupported environment: " + environment);
        }
    }
}
