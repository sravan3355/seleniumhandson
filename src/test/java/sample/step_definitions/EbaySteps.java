package sample.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import sample.pages.EbayPage;
import sample.utility.ReusableUtility;
import sample.utility.SeleniumDriver;

public class EbaySteps {




    @Then("Verify Ebay page")
    public void ValidateEbayLink() {
        EbayPage sp = new EbayPage(SeleniumDriver.getDriver());
        sp.ValidateEbayLink();

    }
}
