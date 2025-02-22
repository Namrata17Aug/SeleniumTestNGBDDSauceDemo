package importantHandsOnForInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RightClickAction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("");
        driver.manage().window().maximize();
    }
}

//action.moveToElement(element) - mouse Hover
//action.contextClick(element) - right click
//action.doubleClick(element) - double click
//action.dragAndDrop(srcEle, dstinationEle)      drag and drop

//diffe between Actions and action
//Actions is a class will be used to perform mouse action
//Action is a interface will be used to store created actions




/*slider
for slider get element for slider min part
take its location
action.dragAndDrop(sliderEle, 200, 380)



 */


/*
Alert------------------
driver.switchTo().Alert().Accept();  // only alert opened and clicked on ok.

// OK and cancel btn alert
find the elementof btn and click on it
driver.switchTo().Alert().Accept()//close by OK btn
driver.switchTo().Alert().Dismiss() ;


// alert window have some element like inpubox
Alert alertWindow = driver.switchto().alert();
alertWindow.sendKeys("welcome");
alertWindow.accept();

 */
//////////////////////disable notification/////////////////////////////////////////////////
/*
ChromeOptions options = new ChromeOptions()
options.addargument("--disable notification")

 */