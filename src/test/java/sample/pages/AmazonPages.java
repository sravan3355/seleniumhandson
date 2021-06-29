package sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import sample.utility.ReusableUtility;

public class AmazonPages {

	public WebDriver driver1;
	ReusableUtility RU;

	public AmazonPages(WebDriver driver) {
		driver1 = driver;
		RU = new ReusableUtility(driver);
		PageFactory.initElements(driver, this);
	}
	

}
