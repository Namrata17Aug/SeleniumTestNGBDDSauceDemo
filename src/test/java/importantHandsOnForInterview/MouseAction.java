package importantHandsOnForInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class MouseAction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.opencart.com");
        driver.manage().window().maximize();


        WebElement deskEle = driver.findElement(By.xpath("//a[text()='Desktops']"));
        WebElement macEle = driver.findElement(By.xpath("//a[text()='Mac (1)']"));

        Actions act = new Actions(driver);

        act.moveToElement(deskEle).moveToElement(macEle).click().build().perform();
    }
}
