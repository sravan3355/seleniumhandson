package sample.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import sample.pages.EbayPage;
import sample.utility.ReusableUtility;
import sample.utility.SeleniumDriver;

public class EbaySteps {


    EbayPage sp = new EbayPage(SeleniumDriver.getDriver());

    @Then("Verify Ebay page")
    public void ValidateEbayLink() {
        sp.ValidateEbayLink();
    }

    @Then("Verify select PreOwned")
    public void selectPreOwned() {
        sp.selectPreOwned();
    }
    @Then("Verify check CartBtn")
    public void checkCartBtn() {
        sp.checkCartBtn();
    }
    @Then("Verify select CheckOut")
    public void selectCheckOut() {
        sp.selectCheckOut();
    }


}
