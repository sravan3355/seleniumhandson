package sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sample.utility.ReusableUtility;

public class NikePages {


    public WebDriver driver1;
    ReusableUtility RU;

    public NikePages(WebDriver driver) {
        driver1 = driver;
        RU = new ReusableUtility(driver);
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "//a[@aria-label='New Releases ']")
    public WebElement newReleases;

    @FindBy(xpath = "//a[text()='New For Men']/following-sibling::a[text()='Shoes']")
    public WebElement shoes;




    @FindBy(xpath = "//button[contains(text(),'Skateboarding')]")
    public WebElement skateBoarding;

    @FindBy(xpath = "//a[contains(text(),'Nike SB Dunk Low Pro')]")
    public WebElement nikeSbDunkLowPro;

    @FindBy(xpath = "//div[contains(text(),'In Stock')]")
    public WebElement inStock;

    @FindBy(xpath = "//a[@href='/ca/launch/t/air-tuned-max-smoke-grey']")
    public WebElement airTunedMaxSmokeGrey;

    @FindBy(xpath = "//button[contains(text(),'US 6')]")
    public WebElement us6;

    @FindBy(xpath = "//button[contains(text(),'add to bag')]")
    public WebElement addToBag;

    @FindBy(xpath = "//button[@class='join-log-in text-color-grey prl3-sm pt2-sm pb2-sm fs12-sm d-sm-b']")
    public WebElement logIn;

    @FindBy(xpath = "//input[@placeholder='Email address']")
    public WebElement emailAddress;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//a[contains(text(),'Forgotten your password?')]")
    public WebElement forg;


    public void ValidateNikeLink() {
        RU.hoverElement(newReleases);
        RU.moveToElementClick(newReleases, shoes);
        RU.waitForVisibilityOfElement(skateBoarding);

        //RU.jsClick(nikePegasusTrail3);
        RU.jsClick(skateBoarding);
    }
    public void selectShoesSize(String size) {
        RU.waitForVisibilityOfElement(nikeSbDunkLowPro);
        RU.jsClick(nikeSbDunkLowPro);
        RU.jsClick(inStock);
        RU.waitForVisibilityOfElement(airTunedMaxSmokeGrey);
        RU.abcdClick(airTunedMaxSmokeGrey);
        WebElement ele=driver1.findElement(By.xpath("//button[contains(text(),'US "+Integer.parseInt(size)+"')]"));
        RU.waitForVisibilityOfElement(ele);
        RU.abcdClick(ele);
    }
    public void checkAddTobag() {

        RU.waitForVisibilityOfElement(addToBag);
        RU.jsClick(addToBag);
    }
    public void loginCheck(String email, String pwd){
        RU.waitForVisibilityOfElement(logIn);
        RU.jsClick(logIn);
        RU.sendKeysFunction(emailAddress,email);
        RU.sendKeysFunction(password,pwd);
    }
}
