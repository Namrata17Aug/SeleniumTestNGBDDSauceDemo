package stepDefinitions;

import driverFactory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import module.CheckoutModule;
import module.NegativeLoginModule;
import org.testng.Assert;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.List;

public class ProductyCheckoutSuccessStepDef {
    NegativeLoginModule ploginModule;
    CheckoutModule chkOutModule;
    float totalSum = 0;

    @Given("User login to Application with username {string} and password {string}")
    public void user_login_to_application_successfully(String userName, String password) {
        ploginModule = new NegativeLoginModule(DriverFactory.getDriver());
        chkOutModule = new CheckoutModule(DriverFactory.getDriver());
        ploginModule.login(userName, password);

    }
    @When("User add product to cart")
    public void user_add_product_to_cart() throws InterruptedException {

       // chkOutModule.clickAddToCartBtn();
        chkOutModule.clkaddMultiProdTocart();
        Thread.sleep(3000);
    }
    @When("User go to cart")
    public void user_go_to_cart() {
        chkOutModule.goToCartBtn();
    }
    @When("Click on Checkout Btn")
    public void click_on_checkout_btn() {
        chkOutModule.clickcheckOut();
    }
    @Then("User information needs to be filled with firstname {string} Lastname {string} and postalcode {string}")
    public void user_information_needs_to_be_filled_with_firstname_lastname_and_postalcode(String fname, String lname, String zipcode) {
       chkOutModule.checkOutFName(fname);
       chkOutModule.checkOutLName(lname);
       chkOutModule.checkOutZipCode(zipcode);
    }
    @Then("Click on Continue Button")
    public void click_on_continue_button() {
        chkOutModule.clkContinueBtn();
    }
    @Then("Click on Finish Btn")
    public void click_on_finish_btn() {
        chkOutModule.clkFinishBtn();
    }
    @Then("Validate Order Successfull")
    public void validate_order_successfull() throws InterruptedException {
       chkOutModule.validateCheckoutScs();
        chkOutModule.clkbackToHome();
        Thread.sleep(2000);
    }


    /// ////////////////////////////////////////////////////////////////////////////////
    ///
//    @When("User add products to cart")
//    public void user_add_products_to_cart() throws InterruptedException {
//        chkOutModule = new CheckoutModule(DriverFactory.getDriver());
//        chkOutModule.clkaddMultiProdTocart();
//        Thread.sleep(3000);
//    }
    @Then("count on cart should match")
    public void count_product_in_cart(){
        Assert.assertEquals(Integer.parseInt(chkOutModule.vrfNumOfProdInCart()), 5);
        System.out.println(Integer.parseInt(chkOutModule.vrfNumOfProdInCart()));
    }

///////////////////////////compare sum of price is same as total price//////////////////////////////////////
@And("Get Price of Individual Products")
public float getPricesOfIndiProds() {
   List<Float> allPrices= chkOutModule.getPriceOfIndiProds();
    System.out.println("list of all prices " +allPrices);

    for(float i:allPrices){
        totalSum =totalSum + i;
    }
    return totalSum;
}
@Then("Verify that sum of all prices should match total Price")
public void validatePriceOfAllProds(){
  Assert.assertEquals(Math.floor(chkOutModule.getTotalPrice()), Math.floor(totalSum) );
}

/// /////////////////    SORTING   /////////////////////////////

    @When("click on sort button")
    public void clksortContainer(){
        //chkOutModule = new CheckoutModule(DriverFactory.getDriver());
        chkOutModule.clkSortContainer();
    }

    @And("click on Price link LtoH")
    public void clksortProdByPriceLtoH() throws InterruptedException {
        chkOutModule.clkSortLtoHPriceLink();
    }

    @Then("All product should be sorted by price low to high")
    public void verifyProductsSorted(){
        List<Float> sortedPrice =chkOutModule.getPriceOfIndiProds();
        System.out.println(sortedPrice);
    }

    @And("click on name Z-A link")
    public void clkSortByName() throws InterruptedException {
        chkOutModule.clkSortByName();
    }

    @And("click on Price link HtoL")
    public void clkPriceLinkHtoL() throws InterruptedException {
        chkOutModule.clkSortHtoLPriceLink();
    }
    @Then("All product should be sorted by descending alphabetically")
    public void verifyProductSortedAlphabettically(){
        List<Float> sortedPrice =chkOutModule.getPriceOfIndiProds();
        System.out.println(sortedPrice);
    }

    @Then("All product should be sorted by price high to low")
    public void verifyProductSortedHtoL(){
        List<Float> sortedPrice =chkOutModule.getPriceOfIndiProds();
        System.out.println(sortedPrice);
    }

    /// ////////////////////////////////
}
