package sample.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sample.pages.SheinPage;
import sample.utility.ReusableUtility;

public class SheinTest {

	@Test
	public void SheinPage() throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		SheinPage sp = new SheinPage(driver);
		ReusableUtility ru = new ReusableUtility(driver);
		try {
			String url = "https://www.shein.in/";
			ru.navigateTo(url);
			ru.maximiseBrowserWindow();
		    sp.ValidateSheinLink();
		    
		  //img/parent::a[@data-title='Plus Ripped Detail Jogger Jeans']/following-sibling::section[not(@style='display: none;')]//button[contains(.,'Add To Bag')]
		  //img/parent::a[@data-title='Plus Ripped Detail Jogger Jeans']
			
			
			
			
			
			ru.closedriver();
			
			
		} catch (Exception e) {
			System.out.println(e);
			ru.closedriver();
			driver.quit();
		}
		
	}

}

