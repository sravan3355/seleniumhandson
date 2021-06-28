
package sample.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sample.utility.ReusableUtility;

public class HoverPage {
	public WebDriver driver1;
	ReusableUtility RU;

	public HoverPage(WebDriver driver) {
		driver1 = driver;
		RU = new ReusableUtility(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='Hover Logo']")
	public WebElement hoverLogo;

	@FindBy(xpath = "//input[@placeholder='Find your domain name']")
	public WebElement findYour;

	@FindBy(xpath = "//i[@class='far fa-search']")
	public WebElement far;

	@FindBy(xpath = "//span[contains(text(),'Add to cart')]")
	public WebElement addToCart;

	@FindBy(xpath = "//a[@href='/cart']//span")
	public WebElement cartButton;

	@FindBy(id = "checkout")
	public WebElement checkOut;

	@FindBy(name = "firstName")
	public WebElement firstName;

	@FindBy(name = "lastName")
	public WebElement lastName;

	@FindBy(name = "email")
	public WebElement email;
	
	@FindBy(xpath = "//nav//a[@href='/signin'][@data-trigger]")
	public WebElement signInButton;

	@FindBy(xpath = "//div[contains(text(),'Webmail')]")
	public WebElement WebMail;

	@FindBy(xpath = "(//a[contains(@href,'https://help.hover.com')])[1]")
	public WebElement changePasswordLink;

	@FindBy(xpath = "//a[contains(.,'Hover Control Panel')]")
	public WebElement HoverControlPanel;

	@FindBy(xpath = "//iframe[@id='launcher']")
	public WebElement iframe1;

	@FindBy(xpath = "//iframe[@id='webWidget']")
	public WebElement iframe2;
	
	@FindBy(xpath = "//span[contains(text(),'Help')]")
	public WebElement helpButton;
	@FindBy(xpath = "//input[@name='name']")
	public WebElement nameField;
	@FindBy(xpath = "//input[@name='email']")
	public WebElement emailField;
	@FindBy(name = "description")
	public WebElement descriptionField;
	@FindBy(xpath = "//h2[text()='Thanks for reaching out']")
	public WebElement successMessage;
	@FindBy(xpath = "//button[text()='Go Back']")
	public WebElement goBackButton;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement send;
	@FindBy(xpath = "//span[@type='Icon']")
	public WebElement icon;
	
	@FindBy(xpath = "//a[@href='https://twitter.com/hover']")
	public WebElement twitterLink;
	@FindBy(xpath = "//span[contains(text(),'Follow')]")
	public WebElement followButton;
	@FindBy(xpath = "//div[@role='button'][@aria-label='Close']")
	public WebElement close;

	@FindBy(xpath = "//a[@data-testid='login']")
	public WebElement login;
	@FindBy(xpath = "//input[@type='text']")
	public WebElement text;
	@FindBy(xpath = "//input[@type='password']")
	public WebElement password;
	@FindBy(xpath = "//label[contains(.,'Password')]/../following-sibling::div//div[@role='button']//span[text()='Log in']")
	public WebElement logInButton;
	@FindBy(xpath = "//div[@role='alert']//div[@dir]")
	public WebElement alert;
	
	@FindBy(xpath = "//input[@name='email']/following-sibling::div[@role]")
	public WebElement errorMessageForEmail;
	
	@FindBy(xpath = "//textarea[@name='description']/following-sibling::div[@role]")
	public WebElement errorMessageForDescription;


	public void validateHoverLogo() {

		RU.abcdClick(hoverLogo);

		RU.sendKeysFunction(findYour, "uihrfjkncriu.com");
		RU.abcdClick(far);
		RU.abcdClick(addToCart);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RU.abcdClick(cartButton);

		RU.abcdClick(checkOut);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RU.sendKeysFunction(firstName, "uihrfjkncriu");

		RU.sendKeysFunction(lastName, "uihrfjkncriu");
		RU.sendKeysFunction(email, "uihrfjkncri@wer.com");

	}

	

	public void webMailValidation() {
		RU.sleep();
		RU.abcdClick(signInButton);
		RU.abcdClick(WebMail);
		RU.abcdClick(changePasswordLink);
		RU.abcdClick(HoverControlPanel);

		ArrayList<String> tabs = new ArrayList<String>(driver1.getWindowHandles());

		driver1.switchTo().window(tabs.get(1));
		RU.sleep();
		driver1.switchTo().window(tabs.get(0));

	}

	

	public void chatValidation() {
		RU.sleep();
		RU.abcdClick(signInButton);
		RU.abcdClick(WebMail);
		RU.abcdClick(changePasswordLink);
		RU.sleep();
		driver1.switchTo().frame(iframe1);

		RU.abcdClick(helpButton);
		RU.sleep();
		driver1.switchTo().defaultContent();

		driver1.switchTo().frame(iframe2);

		RU.sendKeysFunction(nameField, "vishnuVardan");
		RU.sendKeysFunction(emailField, "vishnusdfvardan@hotmail.com");
		RU.sendKeysFunction(descriptionField, "lhbfkhackfbrekljvklvbv,nvbklv");

		RU.abcdClick(send);

		RU.sleep();
		this.successMessage.isDisplayed();
		RU.abcdClick(this.goBackButton);

		driver1.switchTo().defaultContent();

		driver1.switchTo().frame(iframe1);

		this.helpButton.isDisplayed();
		RU.sleep();
		RU.abcdClick(icon);

	}

	
	public void errorsValidationinChatWidget() {
		RU.sleep();
		RU.abcdClick(signInButton);
		RU.abcdClick(WebMail);
		RU.abcdClick(changePasswordLink);
		RU.sleep();
		driver1.switchTo().frame(iframe1);

		RU.abcdClick(helpButton);
		RU.sleep();
		driver1.switchTo().defaultContent();

		driver1.switchTo().frame(iframe2);

		

		RU.abcdClick(send);
		RU.sleep();
		
		String errorMessageEmail = RU.getTextByElement(errorMessageForEmail);
		System.out.println(errorMessageEmail);
		
		String errorMessageDescription = RU.getTextByElement(errorMessageForDescription);
		System.out.println(errorMessageDescription);


	}
	public void twitterValidation() {
		RU.abcdClick(twitterLink);
		RU.sleep();
		RU.abcdClick(followButton);
		RU.sleep();
		RU.abcdClick(close);
		RU.sleep();
		RU.abcdClick(login);
		RU.sendKeysFunction(text, "sragjhbvhb@gmail.com");
		RU.sendKeysFunction(password, "hfyredfnfrhfn");
		RU.sleep();
		RU.abcdClick(logInButton);

		RU.sleep();
		String errorMessage = RU.getTextByElement(alert);
		System.out.println(errorMessage);

	}
}
