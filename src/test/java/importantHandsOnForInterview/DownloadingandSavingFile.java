package importantHandsOnForInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;

import java.io.File;
import java.util.HashMap;

public class DownloadingandSavingFile {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        HashMap<String, Object> chromePreference = new HashMap<>();
        chromePreference.put("profile.default_content_settings.popups",0);
        String downloadFilePath = System.getProperty("Downloads");
        chromePreference.put("download.default_directory",downloadFilePath);  //
        options.setExperimentalOption("prefs",chromePreference);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/p/page7.html");


        driver.findElement(By.linkText("ZIP file")).click();

        File file = new File(downloadFilePath + "\\DownloadDemo-master.zip");

        if(file.exists()){
            System.out.println("file got successfully downloaded");
        }
        else{
            System.out.println("file is not downloaded");
        }


       // Action act = new Action(driver);
    }
}
