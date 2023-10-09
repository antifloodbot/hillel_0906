package ua.hillel.homework.hw35;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {

    private Properties prop;

    public ConfigLoader(String pathToConfigFile) {
        prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream(pathToConfigFile);
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getProperty(String key) {
        return prop.getProperty(key);
    }
}