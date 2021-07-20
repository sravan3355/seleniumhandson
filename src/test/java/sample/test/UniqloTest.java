package sample.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import sample.pages.UniqloPage;
import sample.utility.ReusableUtility;

public class UniqloTest {

	@Test
	public void UniqloPage() throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		UniqloPage up = new sample.pages.UniqloPage(driver);
		ReusableUtility ru = new ReusableUtility(driver);
		try {
			String url = "https://www.uniqlo.com/";
			ru.navigateTo(url);
			ru.maximiseBrowserWindow();
		    up.ValidateUniqloLink();
		 
			Thread.sleep(5000);


			ru.closedriver();
			
			
		} catch (Exception e) {
			System.out.println(e);
			ru.closedriver();
			driver.quit();
		}
		
	}

}
