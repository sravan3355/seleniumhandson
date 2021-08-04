package sample.step_definitions;

import io.cucumber.java.en.Then;

import sample.pages.GithubPage;
import sample.utility.SeleniumDriver;

public class GithubSteps {

        @Then("Verify Github page")
        public void validateTrendingSection() {
            GithubPage gp=new GithubPage(SeleniumDriver.getDriver());
            gp.validateTrendingSection();

        }
}
