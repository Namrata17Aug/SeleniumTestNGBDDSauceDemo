package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.LoginPageObject;

public class EndToEndProductCheckout {
    WebDriver driver;

    @BeforeMethod
    public void beforeTestMethod(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.findElement(LoginPageObject.userName).sendKeys("standard_user");
        driver.findElement(LoginPageObject.password).sendKeys("secret_sauce");

        driver.findElement(LoginPageObject.loginBtnEle).click();

    }

    @AfterMethod
    public void afterTestMethod(){
        driver.quit();
    }

    @Test(priority=1)
    public void addToCart() {
        driver.findElement(LoginPageObject.addToCartBtn).click();

    }

    @Test(priority=2)
    public void checkoutProduct() {
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
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        // driver.findElement(By.id("remove-sauce-labs-backpack")).click();


    }

    @Test(priority=4)
    public void multipleItemAddedFewRemovedThenCheckoutProduct(){

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
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        driver.findElement(By.xpath("//input[contains(@placeholder,'First Name')]")).sendKeys("Namrata");

        driver.findElement(By.xpath("//input[contains(@placeholder,'Last Name')]")).sendKeys("Kumari");

        driver.findElement(By.xpath("//input[contains(@placeholder,'Zip/Postal Code')]")).sendKeys("411021");

        driver.findElement(By.id("cancel")).click();
    }

}
