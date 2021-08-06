package sample.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import sample.utility.ReusableUtility;

public class FlipkartPage {
	public WebDriver driver1;
	ReusableUtility RU;

	public FlipkartPage(WebDriver driver) {
		driver1 = driver;
		RU = new ReusableUtility(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(text(),'✕')]")
	public WebElement cancelBtn;

	@FindBy(xpath = "//div[contains(text(),'Electronics')]")
	public WebElement electronics;

	@FindBy(xpath = "//a[contains(text(),'Smart Wearables')]")
	public WebElement smartWearables;

	@FindBy(xpath = "//a[contains(text(),'Smart Glasses')]")
	public WebElement smartGlasses;
	
	@FindBy(xpath="//div[contains(text(),'to')]/following-sibling::div//select[@class='_2YxCDZ']")
	public WebElement selectPrice;
	
	@FindBy(xpath="//input[@placeholder='Search Brand']")
	public WebElement searchBrand;
	
	@FindBy(xpath="//div[contains(text(),'ADISHR')]")
	public WebElement adishr;
	
	@FindBy(xpath="//a[contains(text(),'ADISHR VR Box')]")
	public WebElement adishrVrBox;
	
	@FindBy(xpath="//button[contains(text(),'NOTIFY ME')]")
	public WebElement notifyMe;
	
	@FindBy(xpath="//button[contains(text(),'Deny')]")
	public WebElement deny;
	
	@FindBy(xpath="//button[contains(text(),'Post your question')]")
	public WebElement postYourQuestion;
	
	@FindBy(xpath="//span[contains(text(),'Forgot?')]")
	public WebElement forgot;
	
	@FindBy(xpath="//a[contains(text(),'New to Flipkart? Create an account')]")
	public WebElement newToFlipKart;
	
	@FindBy(xpath="//a[contains(text(),'Privacy Policy')]")
	public WebElement privacyPolicy;


	public String ValidateFlipkartLink() {
		RU.waitForVisibilityOfElement(cancelBtn);
		RU.abcdClick(cancelBtn);
		RU.waitForVisibilityOfElement(electronics);
		RU.hoverElement(electronics);

		RU.waitForVisibilityOfElement(smartWearables);

		RU.hoverElement(smartWearables);
		RU.waitForVisibilityOfElement(smartGlasses);
		RU.moveToElementClick(smartWearables, smartGlasses);
		RU.waitForVisibilityOfElement(selectPrice);
		Select dropdown=new Select(driver1.findElement(By.xpath("//div[contains(text(),'to')]/following-sibling::div//select[@class='_2YxCDZ']")));
		 dropdown.selectByValue("1000");
		
		
		RU.sleep();
		RU.sendKeysFunction(searchBrand, "adishr");
		RU.waitForVisibilityOfElement(adishr);
		RU.abcdClick(adishr);
		RU.waitForVisibilityOfElement(adishrVrBox);
		RU.abcdClick(adishrVrBox);
		RU.sleep();
		
		
		ArrayList<String> tabs = new ArrayList<String>(driver1.getWindowHandles());

		driver1.switchTo().window(tabs.get(1));

         RU.abcdClick(notifyMe);
         RU.waitForVisibilityOfElement(deny);
         RU.abcdClick(deny);
         RU.waitForVisibilityOfElement(postYourQuestion);
         RU.abcdClick(postYourQuestion);
         RU.waitForVisibilityOfElement(forgot);
         RU.abcdClick(forgot);
         System.out.println("Please enter valid Email ID/Mobile number");
         RU.waitForVisibilityOfElement(newToFlipKart);
         RU.abcdClick(newToFlipKart);
         RU.waitForVisibilityOfElement(privacyPolicy);
         RU.abcdClick(privacyPolicy);

 		ArrayList<String> tabs1 = new ArrayList<String>(driver1.getWindowHandles());

 		driver1.switchTo().window(tabs1.get(2));
       
         RU.sleep();
        
         
         String title=driver1.getTitle();
         System.out.println(title);
         
         return title;
         
		 
		
		

	}
}