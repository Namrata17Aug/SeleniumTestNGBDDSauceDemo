package module;

import org.openqa.selenium.WebDriver;
import pageObject.LoginPageObject;

public class NegativeLoginModule {
    WebDriver driver;

    public NegativeLoginModule(WebDriver driver){
      this.driver = driver;
    }

    public void login(String userName, String password){
        enterUsername(userName);
        enterPassword(password);
        clickLogin();
    }

    public String getErrorMsg(){
        String errorMsg = driver.findElement(LoginPageObject.errMsgEle).getText();
        return errorMsg;
    }

    public void enterUsername(String userName){
        driver.findElement(LoginPageObject.userName).sendKeys(userName);
    }
    public void enterPassword(String password){
        driver.findElement(LoginPageObject.password).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(LoginPageObject.loginBtnEle).click();
    }

}
