package sample.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sample.pages.YoutubePage;
import sample.utility.ReusableUtility;

public class YoutubeTest {

	@Test
	public void AmazonPages() throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		YoutubePage yp = new YoutubePage(driver);
		ReusableUtility ru = new ReusableUtility(driver);
		try {
			String url = "https://www.youtube.com/";
			ru.navigateTo(url);
			ru.maximiseBrowserWindow();
		    yp.ValidateYoutubeLink();
		    
		  //h3[contains(.,'More from YouTube')]/following-sibling::div//a[@title="Live"]
		    String url1="https://www.youtube.com/results?search_query=mackbook";
			
			yp.links();
			
			
			
			
			
			ru.closedriver();
			
			
		} catch (Exception e) {
			System.out.println(e);
			ru.closedriver();
			driver.quit();
		}
		
	}

}

