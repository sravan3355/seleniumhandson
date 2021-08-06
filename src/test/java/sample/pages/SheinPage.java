package sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sample.utility.ReusableUtility;

public class SheinPage {
	public WebDriver driver1;
	ReusableUtility RU;

	public SheinPage(WebDriver driver) {
		driver1 = driver;
		RU = new ReusableUtility(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='header-search']")
	public WebElement headerSearch;
	@FindBy(xpath = "//div[@data-scici='Search~~EditSearch~~1~~jeans~~~~0']")
	public WebElement searchButton;

	@FindBy(xpath="//img/parent::a[@data-title='Men Letter Patched Skinny Jeans']")
	public WebElement jeans;
	
	@FindBy(xpath="//img/parent::a[@data-title='Plus Ripped Detail Jogger Jeans']/following-sibling::section[not(@style='display: none;')]//button[contains(.,'Add To Bag')]")
	public WebElement bag;
	
	@FindBy(xpath="//section[contains(text(),'30')]")
	public WebElement size30;
	@FindBy(xpath="//button[contains(text(),'submit')]")
	public WebElement submit;
	
	@FindBy(xpath="//a[@class='j-ipad-prevent-a j-sa-cart-1']")
	public WebElement cart;
	
	
	public void ValidateSheinLink() {
		
		RU.sendKeysFunction(headerSearch, "jeans");
		RU.sleep();
		RU.abcdClick(searchButton);
	    RU.sleep();
	    RU.moveToElementClick(jeans, bag);
	    
	    RU.sleep();
	    RU.abcdClick(size30);
	    RU.sleep();
	    RU.abcdClick(submit);
	    RU.sleep();
	    RU.abcdClick(cart);
	    RU.sleep();
	   
	    
		
		
		
	
		
	}
}