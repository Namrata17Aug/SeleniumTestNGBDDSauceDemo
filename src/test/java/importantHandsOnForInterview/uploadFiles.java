package importantHandsOnForInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class uploadFiles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        // will find xpath of upload file btn then in send key method send file path and file name
        // then validate file name uploaded with actual fole name


        // for uploading multiple files capture location of all files in string
        //and in sendKey method pass all string with /n
    }


}
