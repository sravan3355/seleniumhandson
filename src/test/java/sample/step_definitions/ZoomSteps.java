package sample.step_definitions;

import io.cucumber.java.en.Then;

import sample.pages.ZoomPage;
import sample.utility.SeleniumDriver;

public class ZoomSteps {

    @Then("Verify Zoom page")
    public void hoverOnSolutionsLink() {
        ZoomPage zp = new ZoomPage(SeleniumDriver.getDriver());

        zp.fillDOBDetails();
        zp.clickPrivacy();
        zp.hoveronSolutionsLink();


    }
}
