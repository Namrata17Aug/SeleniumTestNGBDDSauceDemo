package stepDefinitions;

import driverFactory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import module.CheckoutModule;
import module.NegativeLoginModule;
import org.openqa.selenium.WebDriver;
import pageObject.LoginPageObject;
import testNG.TestCaseBase;

import java.util.List;

public class DataTableStepDef extends TestCaseBase {
    WebDriver driver;
    NegativeLoginModule dloginModul;
    CheckoutModule chkOutModule;

    @When("User login to Application with valid credential")
    public void loginWithValidCre(DataTable dataTable){
        List<List<String>> data = dataTable.cells();
//        driver.findElement(LoginPageObject.userName).sendKeys(data.get(0).get(0));
//        driver.findElement(LoginPageObject.password).sendKeys(data.get(0).get(1));
//        driver.findElement(LoginPageObject.loginBtnEle).click();


        dloginModul = new NegativeLoginModule(DriverFactory.getDriver());
        chkOutModule = new CheckoutModule(DriverFactory.getDriver());
        dloginModul.login(data.get(0).get(0), data.get(0).get(1));
    }

    @Then("User navigate to homepage")
    public void ValidateHomePage(){
        System.out.println("its home page");
    }
}
