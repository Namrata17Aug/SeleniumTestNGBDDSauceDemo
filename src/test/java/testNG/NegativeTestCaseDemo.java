package testNG;

import module.NegativeLoginModule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObject.LoginPageObject;
import utilities.PropertiesUtils;

import javax.security.auth.spi.LoginModule;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class NegativeTestCaseDemo extends TestCaseBase{

    @DataProvider(name="loginData")
    public static Object[][] testData(){
        Object[][] testData = {
                {"abcd", "abcd", "Epic sadface: Username and password do not match any user in this service"},
                {"", "secret_sauce", "Epic sadface: Username is required"},
                {"standard_user", "", "Epic sadface: Password is required"},
                {"abcd", "secret_sauce", "Epic sadface: Username and password do not match any user in this service"},
                {"standard_user", "abcd", "Epic sadface: Username and password do not match any user in this service"}

        };
        return testData;
    }



    @Test(priority = 1, dataProvider = "loginData")
    public void ValidateInvalidUserFunctionality(String userName, String password, String ExpectedErrMgs)  {
        negativeLoginModule.login(userName,password);
        Assert.assertEquals(negativeLoginModule.getErrorMsg(), ExpectedErrMgs);

    }

//    @AfterMethod
//    public void afterTestMethod(){
//        driver.quit();
//    }

}
