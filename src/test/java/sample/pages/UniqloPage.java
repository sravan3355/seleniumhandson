package sample.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sample.utility.ReusableUtility;

public class UniqloPage {
	public WebDriver driver1;
	ReusableUtility RU;
	
	public UniqloPage(WebDriver driver){
		driver1 = driver;
		RU = new ReusableUtility(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'women')]")
	public WebElement women;
	
	@FindBy(xpath="//span[contains(text(),'Coats')]")
	public WebElement coats;
	
	@FindBy(xpath="//span[contains(text(),'Blazers')]")
	public WebElement blazers;
	
	@FindBy(xpath = "//a[@title='Wish list']")
	public WebElement wishList;

	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	public WebElement logIn;
	
	@FindBy(xpath="//div[contains(text(),'Privacy policy')]")
	public WebElement privacyPolicy;
	
	@FindBy(xpath="//a[@href='http://www.uniqlo.com/in/']")
	public WebElement uniqlo;
	
	public void ValidateUniqloLink() {
	RU.hoverElement(women);	
	RU.sleep();
	RU.abcdClick(coats);
	RU.sleep();
	RU.abcdClick(blazers);
	
		RU.waitForVisibilityOfElement(wishList);
		RU.abcdClick(wishList);
		RU.waitForVisibilityOfElement(logIn);
		RU.abcdClick(logIn);
		RU.waitForVisibilityOfElement(privacyPolicy);
		RU.abcdClick(privacyPolicy);
		
		ArrayList<String> tabs = new ArrayList<String>(driver1.getWindowHandles());

		driver1.switchTo().window(tabs.get(1));
		
		RU.abcdClick(uniqlo);
		RU.sleep();
		
		
	

	}
}


