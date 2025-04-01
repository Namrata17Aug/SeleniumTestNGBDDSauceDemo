package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.LoginPageObject;

import java.time.Duration;

public class EndToEndProductCheckout extends TestCaseBase{
    //WebDriver driver;

   // @BeforeMethod
//    public void beforeTestMethod(){
//        driver = new ChromeDriver();
//        //implicit
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        //explicit
//        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        //fluent
//        Wait<WebDriver> myFluWait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(2))
//                .ignoring(NoSuchFieldException.class);
//        driver.get("https://www.saucedemo.com");
//        driver.manage().window().maximize();
//        //WebElement ele = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
//
//
//        driver.findElement(LoginPageObject.userName).sendKeys("standard_user");
//        driver.findElement(LoginPageObject.password).sendKeys("secret_sauce");
//
//        driver.findElement(LoginPageObject.loginBtnEle).click();
//
//    }

//    @AfterMethod
//    public void afterTestMethod(){
//        driver.quit();
//    }

    public void loginWithvalidUser(){
        driver.findElement(LoginPageObject.userName).sendKeys("standard_user");
      driver.findElement(LoginPageObject.password).sendKeys("secret_sauce");
      driver.findElement(LoginPageObject.loginBtnEle).click();
    }

    @Test(priority=1)
    public void addToCart() {
        loginWithvalidUser();
        driver.findElement(LoginPageObject.addToCartBtn).click();

    }

    @Test(priority=2)
    public void checkoutProduct() {
        loginWithvalidUser();
        driver.findElement(LoginPageObject.cartBtn).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        driver.findElement(By.xpath("//input[contains(@placeholder,'First Name')]")).sendKeys("Namrata");

        driver.findElement(By.xpath("//input[contains(@placeholder,'Last Name')]")).sendKeys("Kumari");

        driver.findElement(By.xpath("//input[contains(@placeholder,'Zip/Postal Code')]")).sendKeys("411021");


        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.name("finish")).click();
        driver.findElement(By.id("back-to-products")).click();



    }


    @Test(priority=3)
    public void removefromCart() {
        loginWithvalidUser();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        // driver.findElement(By.id("remove-sauce-labs-backpack")).click();


    }

    @Test(priority=4)
    public void multipleItemAddedFewRemovedThenCheckoutProduct(){
        loginWithvalidUser();

        driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();

        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        driver.findElement(By.xpath("//input[contains(@placeholder,'First Name')]")).sendKeys("Namrata");

        driver.findElement(By.xpath("//input[contains(@placeholder,'Last Name')]")).sendKeys("Kumari");

        driver.findElement(By.xpath("//input[contains(@placeholder,'Zip/Postal Code')]")).sendKeys("411021");


        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.name("finish")).click();
        driver.findElement(By.id("back-to-products")).click();


    }

    @Test(priority=5)
    public void cancelCheckout() {
        loginWithvalidUser();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        driver.findElement(By.xpath("//input[contains(@placeholder,'First Name')]")).sendKeys("Namrata");

        driver.findElement(By.xpath("//input[contains(@placeholder,'Last Name')]")).sendKeys("Kumari");

        driver.findElement(By.xpath("//input[contains(@placeholder,'Zip/Postal Code')]")).sendKeys("411021");

        driver.findElement(By.id("cancel")).click();
    }

}
