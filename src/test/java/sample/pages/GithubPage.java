package sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sample.utility.ReusableUtility;

public class GithubPage {
	public WebDriver driver1;
	ReusableUtility RU;

	public GithubPage(WebDriver driver) {
		driver1 = driver;
		RU = new ReusableUtility(driver);
		PageFactory.initElements(driver, this);

	}
	

	
	@FindBy(xpath="//summary[contains(text(),'Explore')]/../..")
	public WebElement exploreSummaryTab;
	
	@FindBy(xpath="//a[@href='/trending']")
	public WebElement tredingLink;
	
	@FindBy(xpath="//(a[@href])[1]")
	public WebElement randomLink;
	
	public void validateTrendingSection(){
		
		RU.moveToElementClick(exploreSummaryTab, tredingLink);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RU.abcdClick(randomLink);
	
	}


	
}
