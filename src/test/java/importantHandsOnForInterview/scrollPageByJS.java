package importantHandsOnForInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class scrollPageByJS {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        driver.get("https://www.nopcommerce.com/");
        driver.manage().window().maximize();
  // scroll the page by pixel no
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0, 3000*)", "");
//        System.out.println("return window.pageYOffset");
// scroll the page till specific element is visible
//        WebElement ele = driver.findElement(By.xpath("//div[@class='developer-store-section']"));
//        js.executeScript("arguments[0].scrollIntoView();", ele);
//        System.out.println(js.executeScript("return window.pageYOffset;"));

// scroll till end of page
          js.executeScript("window.scrollBy(0, document.body.scrollHeight)") ;
        System.out.println(js.executeScript("return window.pageYOffset;"));


//scrolling to initial position
        js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");

 //zooming with jsexecuter
        js.executeScript("document.body.style.zoom='50%'");

        //driver.close();
    }
}
