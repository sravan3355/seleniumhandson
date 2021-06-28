package sample.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import sample.pages.GithubPage;

public class ReusableUtility {
	public WebDriver driver1;

	public ReusableUtility(WebDriver driver) {
		driver1 = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickFunctionUsingXpath(String xpathText) {
		driver1.findElement(By.xpath(xpathText)).click();
	}

	public void clickFunctionUsingId(String id) {
		driver1.findElement(By.id(id)).click();
	}

	public void sendKeysFunctionUsingXpath(String xpathText, String text) {
		driver1.findElement(By.xpath(xpathText)).sendKeys(text);
	}

	public void sendKeysFunctionUsingID(String id, String text) {
		driver1.findElement(By.id(id)).sendKeys(text);
	}

	public void selectByTextFunction(String xpathText, String text) {
		Select dropdown = new Select(driver1.findElement(By.xpath(xpathText)));
		dropdown.selectByVisibleText(text);
	}

	public void closedriver() {
		driver1.close();
	}

	public void maximiseBrowserWindow() {
		driver1.manage().window().maximize();
	}

	public void navigateTo(String url) {
		driver1.get(url);

	}

	public String getTextByXpath(String xpath) {

		return driver1.findElement(By.xpath(xpath)).getText();
	}

	public String getCurrentURL() {
		return driver1.getCurrentUrl();

	}

	public void moveToElementAndClick(String xpath1, String xpath2) {
		Actions action = new Actions(driver1);

		action.moveToElement(driver1.findElement(By.xpath(xpath1))).moveToElement(driver1.findElement(By.xpath(xpath2)))
				.click().build().perform();

	}

	public void abcdClick(WebElement element) {
		element.click();

	}

	public void moveToElementClick(WebElement xpath1, WebElement xpath2) {
		Actions action = new Actions(driver1);

		action.moveToElement(xpath1).moveToElement(xpath2).click().build().perform();

	}

	public void sendKeysFunction(WebElement element, String text) {
		element.sendKeys(text);
	}

	public String getTextByElement(WebElement element) {

		return element.getText();
	}
	
	public void sleep(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
