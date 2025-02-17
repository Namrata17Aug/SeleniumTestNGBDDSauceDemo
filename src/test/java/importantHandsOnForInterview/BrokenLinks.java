package importantHandsOnForInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.time.Duration;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        List<WebElement> allLinkElems = driver.findElements(By.tagName("a"));
        System.out.println(allLinkElems.size());



        for(WebElement ele :allLinkElems ){
            System.out.println(ele.getText());
            String srvcLink = ele.getAttribute("href");
            System.out.println(srvcLink);


                if (srvcLink == null || srvcLink.isEmpty()) {
                    System.out.println("there is no service url found");
                    continue;
                }
            try {
                    URL linkURL = new URL(srvcLink);
                    HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
                    conn.connect();

                    //int responseCode = conn.getResponseCode();

                    if(conn.getResponseCode() >= 400){
                        System.out.println(srvcLink +" ==>is a broken link");
                    } else{
                        System.out.println(srvcLink +" ==>is not a broken link");
                    }





            }catch(Exception e){

            }
            finally {

            }
        }


    }


}
