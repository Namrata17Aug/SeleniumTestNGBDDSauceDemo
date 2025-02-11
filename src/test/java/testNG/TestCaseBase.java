package testNG;

import driverFactory.DriverFactory;
import module.NegativeLoginModule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utilities.PropertiesUtils;

import java.io.IOException;
import java.util.Properties;

public class TestCaseBase {
    WebDriver driver;
    Properties envProp;
    NegativeLoginModule negativeLoginModule;

    @BeforeTest
    public void loadEnviornment() throws IOException {
        Properties global = PropertiesUtils.readConfigProperties("global");
        envProp = PropertiesUtils.readConfigProperties(global.getProperty("env"));

    }

    @BeforeMethod
    public void beforeTestMethod(){
        DriverFactory.openBrowser();
        driver = new ChromeDriver();
        driver.get(envProp.getProperty("url"));
        driver.manage().window().maximize();

        negativeLoginModule= new NegativeLoginModule(driver);
    }

    @AfterMethod
    public void afterTestMethod(){
        driver.close();
    }

}
