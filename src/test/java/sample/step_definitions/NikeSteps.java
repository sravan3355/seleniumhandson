package sample.step_definitions;

import io.cucumber.java.en.Then;
import sample.pages.NikePages;
import sample.utility.SeleniumDriver;

public class NikeSteps {
    NikePages np = new NikePages(SeleniumDriver.getDriver());

    @Then("Verify Nike page")
    public void ValidateNikeLink() {

        np.ValidateNikeLink();

    }



    @Then("Verify Select Shoes Size {string}")
    public void selectShoe(String size) {

        np.selectShoesSize(size);

    }

    @Then("Verify Add to Bag")
    public void aadToBag() {

        np.checkAddTobag();


    }

    @Then("Verify Login check for {string} and {string}")
    public void loginCheck(String email, String password) {

        np.loginCheck(email,password);


    }


}
