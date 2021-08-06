package sample.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sample.pages.AmazonPages;
import sample.utility.ReusableUtility;
import sample.utility.SeleniumDriver;

public class FBSteps {






    @Then("Validate the Amazon Links")
    public void validateTheAmazonLinks() {
        AmazonPages ap = new AmazonPages(SeleniumDriver.getDriver());
        ap.ValidateAmazonLink();

    }
}