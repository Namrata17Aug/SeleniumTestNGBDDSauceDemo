package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {

    public static void main(String[] args){

    }
    private static String configFolderPath = "/Users/Admin/IdeaProjects/SeleniumTestNGBDDSauceDemo/src/config/";
    public static Properties readConfigProperties(String fileName) throws IOException {
        Properties returnProp = new Properties();
        returnProp.load(new FileInputStream(new File(configFolderPath+fileName+".properties")));

        return returnProp;
    }
}
