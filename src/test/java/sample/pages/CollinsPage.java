package sample.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sample.utility.ReusableUtility;

import java.util.ArrayList;

public class CollinsPage {

    public WebDriver driver1;
    ReusableUtility RU;

    public CollinsPage(WebDriver driver) {
        driver1 = driver;
        RU = new ReusableUtility(driver);
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "//input[@placeholder='English Dictionary']")
    public WebElement englishDictionary;
    @FindBy(xpath = "//i[@title='Search']")
    public WebElement search;

    @FindBy(xpath = "//span[@class='path6']")
    public WebElement share;

    @FindBy(xpath = "//div[contains(text(),'Share')]/following-sibling::div/a[@title='Share this page on Facebook']")
    public WebElement shareThisPageOnFacebook;

    @FindBy(xpath = "//a[contains(text(),'Forgot account?')]")
    public WebElement forgotAccount;

    @FindBy(xpath = "//a[@class='share-close']")
    public WebElement shareClose;

    public void ValidateCollinsLink() {

        RU.waitForVisibilityOfElement(englishDictionary);
        RU.sendKeysFunction(englishDictionary, "intersection");
        RU.waitForVisibilityOfElement(search);
        RU.abcdClick(search);
    }

    public void selectShare() {
        RU.abcdClick(share);
        RU.abcdClick(shareThisPageOnFacebook);
        ArrayList<String> tabs = new ArrayList<String>(driver1.getWindowHandles());

        driver1.switchTo().window(tabs.get(1));

    }

    public void clickForgotAccount() {

        RU.waitForVisibilityOfElement(forgotAccount);
        RU.abcdClick(forgotAccount);
        ArrayList<String> tabs = new ArrayList<String>(driver1.getWindowHandles());
        driver1.switchTo().window(tabs.get(2));
        RU.sleep();
        driver1.switchTo().window(tabs.get(0));
        RU.sleep();
    }

    public void clickShareClose() {
        RU.abcdClick(shareClose);
    }


}



