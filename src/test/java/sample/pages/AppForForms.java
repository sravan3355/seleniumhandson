package sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import sample.utility.ReusableUtility;

public class AppForForms {
	public WebDriver driver1;
	ReusableUtility RU;

	public AppForForms(WebDriver driver) {
		driver1 = driver;
		RU = new ReusableUtility(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='hosting'][@value='yes']")
	public WebElement yesradioButton;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	public WebElement firstName;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	public WebElement lastName;
	@FindBy(xpath = "//input[@placeholder='E-Mail Address']")
	public WebElement email;
	@FindBy(xpath = "//input[@placeholder='(845)555-1212']")
	public WebElement phoneNumber;
	@FindBy(xpath = "//input[@placeholder='Address']")
	public WebElement address;
	@FindBy(xpath = "//input[@placeholder='city']")
	public WebElement city;
	@FindBy(xpath = "//select[@name='state']")
	public WebElement state;
	@FindBy(xpath = "//textarea[@name='comment']")
	public WebElement comment;
	@FindBy(xpath = "//input[@name='zip']")
	public WebElement zipCode;
	@FindBy(xpath = "//input[@name='website']")
	public WebElement website;
	@FindBy(xpath = "//button[@type='submit']/parent::div[contains(.,'Send')]")
	public WebElement sendButton;

	public void fillDetails() {
		RU.sendKeysFunction(firstName, "hbcfkhb");
		RU.sendKeysFunction(lastName, "hbcfkhb");
		RU.sendKeysFunction(email, "hbcfkhb@wer.com");
		RU.sendKeysFunction(phoneNumber, "8956231471");

		RU.sendKeysFunction(address, "hbcfkhb fgg");
		RU.sendKeysFunction(city, "hbcfkhb");
		RU.sendKeysFunction(comment, "hbcfkhb fghf");
		RU.sendKeysFunction(zipCode, "54678");
		RU.sendKeysFunction(website, "hbcfkhb.co");

		RU.sendKeysFunction(state, "Alabama");

		RU.sendKeysFunction(state, "Kansas");

		RU.abcdClick(yesradioButton);

		RU.abcdClick(sendButton);
	}

}
