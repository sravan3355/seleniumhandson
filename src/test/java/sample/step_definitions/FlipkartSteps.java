package sample.step_definitions;

import io.cucumber.java.en.Then;
import sample.pages.EbayPage;
import sample.pages.FlipkartPage;
import sample.utility.SeleniumDriver;

public class FlipkartSteps {

    @Then("Verify Flipkart page")
    public void ValidateEbayLink() {
        FlipkartPage fp = new FlipkartPage(SeleniumDriver.getDriver());
        String title=fp.ValidateFlipkartLink();

    }
}


