package sample.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sample.pages.AmazonPages;
import sample.utility.ReusableUtility;

public class AmazonTest {

	@Test
	public void AmazonPages() throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		AmazonPages ap = new AmazonPages(driver);
		ReusableUtility ru = new ReusableUtility(driver);
		try {
			String url = "https://www.amazon.ca/";
			ru.navigateTo(url);
			ru.maximiseBrowserWindow();
		    ap.ValidateAmazonLink();
	        
			
			
			
			
			
			
			
			ru.closedriver();
			
			
		} catch (Exception e) {
			System.out.println(e);
			ru.closedriver();
			driver.quit();
		}
		
	}

}
