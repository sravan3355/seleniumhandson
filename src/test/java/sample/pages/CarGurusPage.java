package sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import sample.utility.ReusableUtility;

public class CarGurusPage {
	public WebDriver driver1;
	ReusableUtility RU;

	public CarGurusPage(WebDriver driver) {
		driver1 = driver;
		RU = new ReusableUtility(driver);

	}

	
	
	
	@FindBy(id = "dealFinderZipUsedId_dealFinderForm")
	public WebElement zipCode;
	
	@FindBy(id="dealFinderForm_0")
	public WebElement dealFinder;
	
	@FindBy(id="subscribe-email-input")
	public WebElement subscribeEmail;
	
	@FindBy(xpath="//button[@type='submit']/div[contains(text(),'Email me')]")
	public WebElement emailMe;
	
	@FindBy(xpath="//p[contains(text(),'Thank you for subscribing')]")
	public WebElement thankYou;
	
	@FindBy(xpath="//button/div[contains(text(),'Close')]")
	public WebElement closeButton;
	
	@FindBy(id="account-menu-username")
	public WebElement username;
	
	@FindBy(xpath="//a[contains(text(),'FSaved Searches')]")
	public WebElement savedSearche ;
	
	@FindBy(xpath="//h2")
	public WebElement header;
	
	
	
	

	public void validatedSavedSearch() {

		RU.sendKeysFunction(zipCode, "m1p2a6");

		RU.abcdClick(dealFinder);
		RU.sendKeysFunction(subscribeEmail, "abc@wer.com");

		RU.abcdClick(emailMe);

		String text = RU.getTextByElement(thankYou);
		System.out.println(text);

		RU.abcdClick(header);
		RU.closedriver();

	}
	
	

}


