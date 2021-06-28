package sample.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sample.pages.ZoomPage;
import sample.utility.ReusableUtility;

public class Zoom {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}
	@Test
	public void ZoomPage() throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		ZoomPage zp = new ZoomPage(driver);
		ReusableUtility ru = new ReusableUtility(driver);
		try {
			String url = "https://zoom.us/";
			ru.navigateTo(url);
			ru.maximiseBrowserWindow();

			zp.fillDOBDetails();
			zp.clickPrivacy();
			zp.hoveronSolutionsLink();
			
			ru.closedriver();
			
			driver.quit();

		} catch (Exception e) {
			System.out.println(e);
			ru.closedriver();
			driver.quit();
		}
		
	}

}
