package stepDefinitions;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import module.NegativeLoginModule;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

public class Hooks {
    //WebDriver driver;
    NegativeLoginModule ploginModule;
    WebDriver driver = DriverFactory.getDriver();
//
//    @Before
//    public void OpenBrowserAndLogin(String userName, String password){
//        ploginModule = new NegativeLoginModule(DriverFactory.getDriver());
//        ploginModule.login(userName, password);
//    }

    @After
    public void AfterScenarioCloseBrowser(){
        //DriverFactory.getDriver().close();
        DriverFactory.getDriver().close();
    }

    @AfterStep
    public void AddScreenShot(Scenario scenario) throws IOException {

        if(scenario.isFailed()){
            //take screenshot
            File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

            byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
            scenario.attach(fileContent, "image/png", "image");
        }

        //https://testautomationpractice.blogspot.com/
        //https://ui.vision/demo/webtest/frames/
        // https://www.jquery-az.com/boots/demo.php?ex=63.0_2
        // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        // http://www.deadlinkcity.com/

    }


    //import io.cucumber.testng.AbstractTestNGCucumberTests;
//@CucumberOptions(features = "src/test/java/features/", glue="stepDefinitions", dryRun = true,
// tags = "@newTag")
//public class TestRunner extends AbstractTestNGCucumberTests {
//}

}
