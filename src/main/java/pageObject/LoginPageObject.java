package pageObject;

import org.openqa.selenium.By;

public class LoginPageObject {
    public static By userName = By.xpath("//*[@id='user-name']");
    public static By password = By.id("password");

    public static By loginBtnEle = By.name("login-button");

    public static By errMsgEle = By.tagName("H3");

    public static By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
    public static By cartBtn = By.xpath("//a[@class='shopping_cart_link']");
}
