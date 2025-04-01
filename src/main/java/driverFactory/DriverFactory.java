package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    static WebDriver driver;

    public static void openBrowser(){
        driver = new ChromeDriver();
//        System.setProperty("webDriver.gecko.driver","//Users//Admin//Downloads//geckodrive");
//        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public static void openUrl(String url){
        driver.get(url);
    }
//    public static void quitBrowser(){
//
//    }

    public static WebDriver getDriver(){
        return driver;
    }
}
