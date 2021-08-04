package sample.step_definitions;

import io.cucumber.java.en.Then;

import sample.pages.CollinsPage;
import sample.utility.SeleniumDriver;

public class CollinsSteps {
    CollinsPage cp=new CollinsPage(SeleniumDriver.getDriver());

    @Then("Validate Collins Link")
    public void validateCollinsLink() {
        cp.ValidateCollinsLink();

    }
    @Then("Select Share")
    public void selectShare() {
        cp.selectShare();
    }
    @Then("click Forgot Account")
    public void clickForgotAccount() {
        cp.clickForgotAccount();
    }


}
