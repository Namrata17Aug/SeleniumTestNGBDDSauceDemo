package stepDefinitions;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import module.NegativeLoginModule;
import org.openqa.selenium.WebDriver;

public class Hooks {
    WebDriver driver;
    NegativeLoginModule ploginModule;
//
//    @Before
//    public void OpenBrowserAndLogin(String userName, String password){
//        ploginModule = new NegativeLoginModule(DriverFactory.getDriver());
//        ploginModule.login(userName, password);
//    }

    @After
    public void AfterScenarioCloseBrowser(){
        //DriverFactory.getDriver().close();
        DriverFactory.quitBrowser();
    }


    //import io.cucumber.testng.AbstractTestNGCucumberTests;
//@CucumberOptions(features = "src/test/java/features/", glue="stepDefinitions", dryRun = true,
// tags = "@newTag")
//public class TestRunner extends AbstractTestNGCucumberTests {
//}

}
