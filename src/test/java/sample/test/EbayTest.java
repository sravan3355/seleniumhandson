package sample.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import sample.pages.EbayPage;
import sample.utility.ReusableUtility;

public class EbayTest {

	@Test
	public void SheinPage() throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		EbayPage sp = new EbayPage(driver);
		ReusableUtility ru = new ReusableUtility(driver);
		try {
			String url = "https://www.ebay.ca/";
			ru.navigateTo(url);
			ru.maximiseBrowserWindow();
		    sp.ValidateEbayLink();
		 
			Thread.sleep(5000);


			ru.closedriver();
			
			
		} catch (Exception e) {
			System.out.println(e);
			ru.closedriver();
			driver.quit();
		}
		
	}

}

