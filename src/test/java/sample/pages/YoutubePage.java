package sample.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sample.utility.ReusableUtility;

public class YoutubePage {
	public WebDriver driver1;
	ReusableUtility RU;

	public YoutubePage(WebDriver driver) {
		driver1 = driver;
		RU = new ReusableUtility(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//tp-yt-paper-item[@role='tab']//yt-formatted-string[contains(text(),'Music')]")
	public WebElement Music;
	@FindBy(xpath = "//button[@aria-label='YouTube apps']")
	public WebElement youTubeApps;
	@FindBy(xpath = "//yt-formatted-string[contains(text(),'YouTube Kids')]")
	public WebElement youTubeKids;
	@FindBy(xpath = "//yt-formatted-string[contains(text(),'YouTube TV')]")
	public WebElement youTubeTv;
	
	@FindBy(xpath = "//h1/following-sibling::div//a[@data-lb-auto-init]")
	public WebElement tryItFree;
	
	 @FindBy(xpath="//yt-icon-button//button[@aria-label='Settings']")
	    public WebElement settings;
	
	@FindBy(xpath="//div[contains(text(),'Appearance: Device theme')]")
	public WebElement appearance;
	@FindBy(xpath="//yt-formatted-string[contains(text(),'Dark theme')]")
	public WebElement darkTheme;
    @FindBy(xpath="//yt-icon-button//button[@aria-label='Settings']")
    public WebElement settings1;
    @FindBy(xpath="//div[contains(text(),'Appearance: Dark')]")
    public WebElement appearanceDark;
    @FindBy(xpath="//yt-formatted-string[contains(text(),'Light theme')]")
    public WebElement lightTheme;
    @FindBy(xpath="//input[@id='search']")
    public WebElement search;
    @FindBy(xpath="//button[@id='search-icon-legacy']")
    public WebElement searchIconLegacy;
	public void ValidateYoutubeLink() {

		RU.sleep();

		RU.abcdClick(Music);
		RU.sleep();
		RU.abcdClick(youTubeApps);
		RU.sleep();
		RU.abcdClick(youTubeKids);

		ArrayList<String> tabs = new ArrayList<String>(driver1.getWindowHandles());

		driver1.switchTo().window(tabs.get(1));
		System.out.println(driver1.getTitle());
		driver1.close();
		
		RU.sleep();
		driver1.switchTo().window(tabs.get(0));
		RU.sleep();
		RU.abcdClick(youTubeTv);
		RU.sleep();
		ArrayList<String> tabs1 = new ArrayList<String>(driver1.getWindowHandles());

		driver1.switchTo().window(tabs1.get(1));
		RU.abcdClick(tryItFree);
		RU.sleep();
		System.out.println(driver1.getTitle());
		driver1.close();
		
		driver1.switchTo().window(tabs1.get(0));
		RU.abcdClick(settings);
		RU.sleep();
		RU.abcdClick(appearance);
		RU.sleep();
		RU.abcdClick(darkTheme);
		RU.sleep();
		RU.abcdClick(settings1);
		RU.sleep();
		RU.abcdClick(appearanceDark);
		RU.sleep();
		RU.abcdClick(lightTheme);
		RU.sleep();
		RU.sendKeysFunction(search, "mackbook");
		RU.sleep();
		RU.abcdClick(searchIconLegacy);
		RU.sleep();
		

	}
	
	
	
	public void links(){
		List<WebElement>listOfWebElements=driver1.findElements(By.xpath("//a[@id='video-title']"));
		for(WebElement e: listOfWebElements ){
			System.out.println(e.getText());
			
		}
		
	}
	
}
