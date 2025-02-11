package stepDefinitions;

import driverFactory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import module.NegativeLoginModule;

import javax.security.auth.spi.LoginModule;

public class NegLoginPageSteDef {

    NegativeLoginModule loginModul;

    @Given("User open Chrome")
    public void user_open_chrome() {
        DriverFactory.openBrowser();
        loginModul = new NegativeLoginModule(DriverFactory.getDriver());
    }
    @Given("User open application with url {string}")
    public void user_open_application_with_url(String url) {
        DriverFactory.openUrl(url);
    }
    @When("User enter username {string}")
    public void user_enter_username(String username) {
        loginModul.enterUsername(username);

    }

    @When("User enter password {string}")
    public void user_enter_password(String password) {
        loginModul.enterUsername(password);

    }
    @When("user click on login button")
    public void user_click_on_login_button() {
        loginModul.clickLogin();

    }
    @Then("User validate {string}")
    public void user_validate(String string) {
        loginModul.getErrorMsg();

    }







}
