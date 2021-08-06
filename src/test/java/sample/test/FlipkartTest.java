package sample.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;
import sample.pages.FlipkartPage;
import sample.utility.ReusableUtility;

public class FlipkartTest {

	@Test
	public void AmazonPages() throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		FlipkartPage fp = new FlipkartPage(driver);
		ReusableUtility ru = new ReusableUtility(driver);
		try {
			String url = "https://www.flipkart.com/";
			ru.navigateTo(url);
			ru.maximiseBrowserWindow();
		    String title=fp.ValidateFlipkartLink();
		   String expected="Privacypolicy Store Online - Buy Privacy policy Online at Best Price in India | Flipkart.com";
		   boolean check=title.contentEquals(expected);
		   System.out.println(check);
		   
		  org.junit.Assert.assertEquals(expected, title);
		   driver.quit();
			
			
			
			
			
		
			
			
		} catch (Exception e) {
			System.out.println(e);
			ru.closedriver();
			driver.quit();
		}
		
	}

}