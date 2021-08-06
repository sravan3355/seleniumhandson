package sample.step_definitions;

import io.cucumber.java.en.Then;
import sample.pages.AmazonPages;
import sample.pages.FlipkartPage;
import sample.utility.SeleniumDriver;

public class AmazonSteps {
    @Then("Verify Amazon page")
    public void ValidateAmazonLink() {
        AmazonPages ap = new AmazonPages(SeleniumDriver.getDriver());
        ap.ValidateAmazonLink();

    }
}


