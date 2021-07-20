package sample.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sample.pages.AmazonPages;
import sample.pages.CarGurusPage;
import sample.utility.ReusableUtility;
import sample.utility.SeleniumDriver;

public class CargurusSteps {



    @Given("Load URL {string}")
    public void load_url(String url) {

        ReusableUtility ru = new ReusableUtility(SeleniumDriver.getDriver());

        ru.navigateTo(url);
        ru.maximiseBrowserWindow();
    }



    @Then("validated Saved Search")
    public void validateTheAmazonLinks() {
        CarGurusPage cg = new CarGurusPage(SeleniumDriver.getDriver());

        cg.validatedSavedSearch();

    }
}