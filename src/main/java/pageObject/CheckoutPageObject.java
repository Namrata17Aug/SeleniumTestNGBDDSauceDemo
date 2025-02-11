package pageObject;

import org.openqa.selenium.By;

public class CheckoutPageObject {
    public static By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");

    public static By addMultiProdToCart = By.xpath("//button[text()='Add to cart']");
    public static By countProdInCart = By.xpath("//span[@class='shopping_cart_badge']");


    public static By cartBtn = By.xpath("//a[@class='shopping_cart_link']");
    public static By checkoutBtn =  By.xpath("//button[@id='checkout']");
    public static By checkoutFName = By.xpath("//input[contains(@placeholder,'First Name')]");

    public static By checkoutLName = By.xpath("//input[contains(@placeholder,'Last Name')]");

    public static By checkoutZipcode = By.xpath("//input[contains(@placeholder,'Zip/Postal Code')]");


    public static By submitCheckoutFormBtn = By.xpath("//input[@type='submit']");
    public static By finishCheckoutFormBtn = By.name("finish");
    public static By validateOrderSuccess = By.xpath("//H2[@class='complete-header']");
    public static By backToProdBtn = By.id("back-to-products");

    public static By priceOfProd = By.xpath("//div[@class='inventory_item_price']");

    public static By totalPriceCheckOutPage = By.xpath("//div[@class='summary_subtotal_label']");

    public static By sortingLinkContainer = By.xpath(" //select[@class='product_sort_container']");

    public static By sortByLtoHPrice = By.xpath("");
}
