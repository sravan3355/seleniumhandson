package sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import sample.utility.ReusableUtility;

public class EbayPage {
	public WebDriver driver1;
	ReusableUtility RU;

	public EbayPage(WebDriver driver) {
		driver1 = driver;
		RU = new ReusableUtility(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='gh-shop-a']")
	public WebElement shopByCategory;
	
	@FindBy(xpath = "//a[contains(text(),'Sneakers')][@_sp='m570.l3635']")
	public WebElement sneakers;


	@FindBy(xpath = "//input[@placeholder='Search for anything']")
	public WebElement searchForAnything;
	
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement submit;
	
	@FindBy(xpath = "//span[contains(text(),'Condition')]")
	public WebElement condition;
	
	@FindBy(xpath = "//span[contains(text(),'Pre-owned')]")
	public WebElement preOwned;
	
	@FindBy(xpath = "//span[contains(text(),'Item Location')]")
	public WebElement itemLocation;
	
	@FindBy(xpath = "//span[contains(text(),'Worldwide')]")
	public WebElement worldWide;
	
	@FindBy(xpath = "//div[contains(text(),'8.5')]")
	public WebElement size;
	
	@FindBy(xpath = "//div[contains(text(),'Black')]")
	public WebElement black;
	
	@FindBy(xpath = "//a[@aria-label='Remove filter'][@href='https://www.ebay.ca/sch/i.html?_from=R40&_nkw=puma&_sacat=0&LH_ItemCondition=3000&rt=nc&LH_PrefLoc=2&US%2520Shoe%2520Size=8%252E5&_oaa=1&_fsrp=1&_dcat=15709']")
	public WebElement removeBlack;
	
	@FindBy(xpath = "//div[contains(text(),'Black')]")
	public WebElement thisBlack;
	
	@FindBy(xpath = "//h3[contains(text(),'Puma Mens Tazon 6 Fracture FM 191175-03 Black Running Shoes Lace Up Size 8.5')]")
	public WebElement blackRunning;
	
	@FindBy(xpath = "//a[@id='isCartBtn_btn']")
	public WebElement cartBtn;
	
	
	@FindBy(xpath = "//button[@data-test-id='cart-remove-item']")
	public WebElement cartRemoveItem;
	
	@FindBy(xpath = "//a[@href='https://www.ebay.ca/itm/203517387341']")
	public WebElement link;
	
	@FindBy(xpath = "//a[@id='isCartBtn_btn']")
	public WebElement isCartBtnBtn;
	
	@FindBy(xpath = "//button[@data-test-id='cta-top']")
	public WebElement CheckOut;
	
	@FindBy(xpath = "//button[@id='gxo-btn']")
	public WebElement continueAsGuest;
	
	@FindBy(xpath = "//select[@id='country']")
	public WebElement country;
	
	
	@FindBy(xpath="//input[@name='firstName']")
	public WebElement firstName;
	
	
	
	
	
	
	
	
	
	

	
public void ValidateEbayLink() {

	RU.abcdClick(shopByCategory);
	RU.abcdClick(sneakers);
	RU.sendKeysFunction(searchForAnything, "puma");

	RU.abcdClick(submit);
	RU.abcdClick(condition);
}
public void selectPreOwned() {
	RU.abcdClick(preOwned);
	RU.abcdClick(itemLocation);
	RU.abcdClick(worldWide);
	RU.abcdClick(size);
	RU.abcdClick(black);

	RU.abcdClick(removeBlack);

	RU.abcdClick(thisBlack);
	RU.sleep();
	RU.abcdClick(blackRunning);
}
public void checkCartBtn(){
	RU.abcdClick(cartBtn);
	RU.sleep();
	}
	public void selectCartRemoveItem(){
	RU.abcdClick(cartRemoveItem);
	System.out.println("You dont have any items in your cart.");
	RU.sleep();
	RU.abcdClick(link);
	RU.abcdClick(isCartBtnBtn);

}
public void selectCheckOut(){

	RU.abcdClick(CheckOut);
	RU.sleep();
	RU.abcdClick(continueAsGuest);
	RU.sleep();

	RU.sendKeysFunction(firstName, "srahvdjgcvdvgvdk");
	RU.sleep();
	Select dropdown=new Select(driver1.findElement(By.id("country")));
	 dropdown.selectByValue("US");
	
	
	
	
	
	
		
		
	   
	    
		
		
		
	
		
	}
}