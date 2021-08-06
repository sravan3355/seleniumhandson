package sample.pages;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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


	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	public WebElement twoTabSearchTextBox;

	@FindBy(xpath = "//input[@value='Go']")
	public WebElement go;

	@FindBy(xpath = "//a/span[contains(text(),'Apple MacBook Pro MLH42LL/A')]")
	public WebElement macBookAir;

	@FindBy(xpath = "//span[@id='contextualIngressPtLabel']")
	public WebElement locationButton;

	@FindBy(xpath = "//input[@id='GLUXZipUpdateInput_0']")
	public WebElement zipCode;
	@FindBy(xpath="//input[@id='GLUXZipUpdateInput_1']")
	public WebElement zip;
	@FindBy(xpath="//span[@data-action='GLUXPostalUpdateAction']")
	public WebElement applyButton;
	@FindBy(xpath="//span[@id='price_inside_buybox']")
	public WebElement price;
	@FindBy(xpath="//select[@name='quantity']")
	public WebElement quantity;
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	public WebElement addToCartButton;
	@FindBy(xpath="//input[@aria-labelledby='attachSiNoCoverage-announce']")
	public WebElement noThanks;
	@FindBy(xpath="//a[@id='hlb-view-cart-announce']")
	public WebElement cartButton;
	@FindBy(xpath="//span[@id='sc-subtotal-label-activecart']")
	public WebElement subTotal;
	@FindBy(xpath="//input[@value='Save for later']")
	public WebElement saveForLater;
	@FindBy(xpath="//input[@value='Delete']")
	public WebElement delete;

	public void ValidateAmazonLink() {
		RU.sleep();

		RU.sendKeysFunction(twoTabSearchTextBox, "Mac Laptop");
		RU.sleep();
		RU.abcdClick(go);
		RU.sleep();
		RU.abcdClick(macBookAir);
		RU.sleep();
		RU.abcdClick(locationButton);
		RU.sleep();
		RU.sendKeysFunction(zipCode, "M1P");
		RU.sleep();
		RU.sendKeysFunction(zip, "2A7");
		RU.sleep();
		RU.abcdClick(applyButton);
		RU.sleep();
		String text = RU.getTextByElement(price);
		System.out.println(text);
		RU.sleep();
		RU.sendKeysFunction(quantity, "2");
		RU.sleep();
		RU.abcdClick(addToCartButton);
		RU.sleep();
		RU.abcdClick(noThanks);
		RU.sleep();
		RU.abcdClick(cartButton);
		RU.sleep();
	    RU.getTextByElement(subTotal);
	    System.out.println();
	    RU.sleep();
	    RU.abcdClick(saveForLater);
	    RU.sleep();
	    RU.abcdClick(delete);
	    RU.sleep();
	    
	    
		
		

	}


}
