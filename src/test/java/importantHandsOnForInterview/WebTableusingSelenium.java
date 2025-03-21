package importantHandsOnForInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class WebTableusingSelenium {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://cosmocode.io/automation-practice-webtable/");
        driver.manage().window().maximize();
        WebElement tablePar = driver.findElement(By.xpath("//table[@id='countries']"));

        int rowCount = driver.findElements(By.xpath("//table[@id='countries'] //tr")).size();
        int colCount = driver.findElements(By.xpath("//table[@id='countries'] //tr[1]/td")).size();
        System.out.println("no of row is " +rowCount + " no of column is "+colCount);

        for(int i =1; i<rowCount; i++){
            for(int j=1; j<=colCount; j++){
                String country = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td["+j+"]")).getText();
                if(country.equals("Albania")){
                    System.out.println("row number is " +i +" column number is " +j);
                }

            }
        }



        driver.close();
    }
}
