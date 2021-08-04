package sample.step_definitions;

import io.cucumber.java.en.Then;

import sample.pages.YoutubePage;
import sample.utility.SeleniumDriver;

public class YoutubeSteps {
    @Then("Verify Youtube page")
    public void ValidateYoutubeLink() {
        YoutubePage yp = new YoutubePage(SeleniumDriver.getDriver());
        yp.ValidateYoutubeLink();

    }
}
