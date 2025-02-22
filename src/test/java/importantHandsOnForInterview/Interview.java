package importantHandsOnForInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Interview {
 //System.setProperty("webDriver");

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.practo.com/");
        driver.manage().window().maximize();


        List<WebElement> myConsEle= driver.findElements(By.xpath("//div[@class='slick-list'][1]/div/div/div/div/div /child::div[2] /h6"));

       // List<WebElement> myConsEle= driver.findElements(By.xpath("//div[@class='slick-list'][1]/descendant::div[6]/following-sibling::div/child::h6")); ////h6[text()='Dentist']
        List<String> myTexts = new ArrayList<String>();


        JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("argument[0].click()", clickiconEle);
        //js.executeScript("window.scrollBy(0, document.body.scrollWidth)");
        for(WebElement myEle:myConsEle ){

            String myConsultiText = myEle.getText();
            if(!myConsultiText.isEmpty() && !myTexts.contains(myConsultiText)){
            myTexts.add(myConsultiText);
            }

        }

        WebElement clickiconEle = driver.findElement(By.xpath("//div[@class='carousel-navigation']/descendant::i"));
        clickiconEle.click();
        Thread.sleep(1000);
        clickiconEle.click();
        Thread.sleep(1000);
        clickiconEle.click();
        Thread.sleep(1000);
        clickiconEle.click();
        Thread.sleep(1000);
        myConsEle= driver.findElements(By.xpath("//div[@class='slick-list'][1]/div/div/div/div/div /child::div[2] /h6"));
        for(WebElement myEle:myConsEle ){

            String myConsultiText = myEle.getText();

            if(!myConsultiText.isEmpty() && !myTexts.contains(myConsultiText)){
                myTexts.add(myConsultiText);
            }

        }
        clickiconEle.click();
        Thread.sleep(2000);

        myConsEle= driver.findElements(By.xpath("//div[@class='slick-list'][1]//div[2] /h6"));
        for(WebElement myEle:myConsEle ){

            String myConsultiText = myEle.getText();

            if(!myConsultiText.isEmpty() && !myTexts.contains(myConsultiText)){
                myTexts.add(myConsultiText);
            }

        }

        System.out.println(myTexts);

        driver.quit();
    }
}

//class Employee{
//    public static void main(String[] args) {
//
//    }
//
//    int id;
//    String name;
//
//    Employee(int id, String name){
//        this.id = id;
//        this.name = name;
//    }
//    public static void getSalary(){
//        System.out.println("get salary");
//    }
//
//
//}
//
//class FullTimeEmployee extends Employee{
//
//    FullTimeEmployee(int id, String name){
//        super(id, name);
//    }
//    public static void main(String[] args) {
//
//    }
//
//
//
//
//
//
//}
