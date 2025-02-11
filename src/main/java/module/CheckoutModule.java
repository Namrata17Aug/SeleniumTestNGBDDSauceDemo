package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageObject.CheckoutPageObject;
import pageObject.LoginPageObject;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class CheckoutModule {
    WebDriver driver;

    public CheckoutModule(WebDriver driver){
        this.driver = driver;
    }

    public void clickAddToCartBtn(){
        driver.findElement(CheckoutPageObject.addToCartBtn).click();
    }

    public void clkSortContainer(){
        driver.findElement(CheckoutPageObject.sortingLinkContainer).click();
    }

    public void clkSortLtoHPriceLink() throws InterruptedException {
        Select drpdwnEle = new Select(driver.findElement(CheckoutPageObject.sortingLinkContainer));
        Thread.sleep(1000);
        drpdwnEle.selectByIndex(2);
        Thread.sleep(10000);
    }

    public void clkaddMultiProdTocart(){
        List<WebElement> multiProds = driver.findElements(CheckoutPageObject.addMultiProdToCart);

        for(int i =0; i<multiProds.size(); i++){
            multiProds.get(i).click();
        }
    }

    public List<Float> getPriceOfIndiProds(){
        List<WebElement> pricesOfProds = driver.findElements(CheckoutPageObject.priceOfProd);
        List<Float> pricesProds = new ArrayList<Float>();
        for(int i =0; i<pricesOfProds.size(); i++){
            String price = pricesOfProds.get(i).getText();
            String newStr = price.replace("$", "");
            Float prices = Float.parseFloat(newStr);
            pricesProds.add(prices);
        }
        return pricesProds;

    }

    public float getTotalPrice(){
        String totalPriceStr = driver.findElement(CheckoutPageObject.totalPriceCheckOutPage).getText();
         return Float.parseFloat(totalPriceStr.split(" ")[2].replace("$", ""));
    }

    public String vrfNumOfProdInCart(){
        String noOfProd = driver.findElement(CheckoutPageObject.countProdInCart).getText();
        return noOfProd;
    }
    public void goToCartBtn(){
        driver.findElement(CheckoutPageObject.cartBtn).click();
    }
    public void clickcheckOut(){
        driver.findElement(CheckoutPageObject.checkoutBtn).click();
    }
    public void checkOutFName(String fname){
        driver.findElement(CheckoutPageObject.checkoutFName).sendKeys(fname);
    }

    public void checkOutLName(String lname){
        driver.findElement(CheckoutPageObject.checkoutLName).sendKeys(lname);
    }
    public void checkOutZipCode(String zipcode){
        driver.findElement(CheckoutPageObject.checkoutZipcode).sendKeys(zipcode);
    }

    public void clkContinueBtn(){
        driver.findElement(CheckoutPageObject.submitCheckoutFormBtn).click();
    }
    public void clkFinishBtn(){

        driver.findElement(CheckoutPageObject.finishCheckoutFormBtn).click();
    }
    public String validateCheckoutScs(){
        String validatechkOutScs = driver.findElement(CheckoutPageObject.validateOrderSuccess).getText();
        return validatechkOutScs;
    }
    public void clkbackToHome(){

        driver.findElement(CheckoutPageObject.backToProdBtn).click();
    }

}
