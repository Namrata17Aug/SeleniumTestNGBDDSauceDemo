package importantHandsOnForInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavascriptExecuterDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement inputEle = driver.findElement(By.xpath("//input[@id='name']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','Nunu')",inputEle );


        WebElement emailEle = driver.findElement(By.xpath("//input[@id='email']"));

        js.executeScript("arguments[0].setAttribute('value','nam17kum@gmail.com')",emailEle );


        WebElement phoneEleEle = driver.findElement(By.xpath("//input[@id='phone']"));
        js.executeScript("arguments[0].setAttribute('value', '7506626549')", phoneEleEle);

        WebElement radBtnMale = driver.findElement(By.xpath("//input[@id='male']"));
        js.executeScript("arguments[0].click()", radBtnMale);

    }
}
