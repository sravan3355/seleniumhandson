package sample.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sample.utility.ReusableUtility;

public class ZoomPage {
	public WebDriver driver1;
	ReusableUtility RU;

	public ZoomPage(WebDriver driver) {
		driver1 = driver;
		RU = new ReusableUtility(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://zoom.us/signup'][@role='button']")
	public WebElement signUpButton;

	@FindBy(xpath = "//span[contains(text(),'month')]")
	public WebElement month;
	@FindBy(xpath = "//dd[@id='select-item-select-0-0']")
	public WebElement Jan;

	@FindBy(xpath = "//span[@aria-label='Day,day']")
	public WebElement Day;
	@FindBy(xpath = "//dd[@aria-label='7']")
	public WebElement optionField;

	@FindBy(xpath = "//span[@aria-label='Year,year']")
	public WebElement Year;

	@FindBy(xpath = "//dd[@aria-label='2000']")
	public WebElement optionField2006;

	@FindBy(xpath = "//button[@type='button']/span[contains(text(),'Continue')]")
	public WebElement ContinueButton;
	@FindBy(xpath = "//a[@href='/privacy']")
	public WebElement privacy;

	@FindBy(xpath = "//a[contains(text(),'Resources')]")
	public WebElement Resorces;

	@FindBy(xpath = "//a[contains(text(),'SOLUTIONS ')]")
	public WebElement solutionsTab;

	@FindBy(xpath = "//h3[contains(text(),'Meetings')]")
	public WebElement meetingsLink;

	
	public void fillDOBDetails(){
		RU.abcdClick(signUpButton);

		RU.abcdClick(month);
		RU.abcdClick(Jan);

		RU.abcdClick(Day);
		RU.sleep();
		RU.abcdClick(optionField);
		RU.sleep();
		RU.abcdClick(Year);
		RU.sleep();
		RU.abcdClick(optionField2006);
		RU.abcdClick(ContinueButton);
	}
	public void clickPrivacy() {
		// TODO Auto-generated method stub
	
	

		
		RU.sleep();
		RU.abcdClick(privacy);
		RU.sleep();
		
		ArrayList<String> tabs = new ArrayList<String>(driver1.getWindowHandles());

		driver1.switchTo().window(tabs.get(1));
		RU.sleep();
		
	   

	

	

	}
	public void hoveronSolutionsLink(){
		 RU.moveToElementClick(solutionsTab, meetingsLink);
			RU.sleep();
			
			System.out.println();
	}

}
