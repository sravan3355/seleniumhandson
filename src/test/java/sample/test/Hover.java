package sample.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sample.pages.HoverPage;
import sample.utility.ReusableUtility;

public class Hover {

	/*
	 * @Test public void hoverpage() throws InterruptedException { // TODO
	 * Auto-generated method stub System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 * 
	 * WebDriver driver = new ChromeDriver(); HoverPage hp = new
	 * HoverPage(driver); ReusableUtility ru = new ReusableUtility(driver); try
	 * { String url = "https://www.hover.com/"; ru.navigateTo(url);
	 * 
	 * ru.maximiseBrowserWindow(); hp.validateHoverLogo();
	 * 
	 * ru.closedriver(); Thread.sleep(5000);
	 * 
	 * } catch (Exception e) { System.out.println(e); ru.closedriver(); } }
	 */

	/*
	 * @Test public void hoverpage2() throws InterruptedException { // TODO
	 * Auto-generated method stub System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 * 
	 * WebDriver driver = new ChromeDriver(); HoverPage hp = new
	 * HoverPage(driver); ReusableUtility ru = new ReusableUtility(driver); try
	 * { String url = "https://www.hover.com/signin"; ru.navigateTo(url);
	 * ru.maximiseBrowserWindow(); hp.webMailValidation(); ru.closedriver();
	 * 
	 * } catch (Exception e) { System.out.println(e); ru.closedriver(); }
	 * 
	 * }
	 */

	//@Test
	public void hoverpage3() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		HoverPage hp = new HoverPage(driver);
		ReusableUtility ru = new ReusableUtility(driver);
		try {
			String url = "https://www.hover.com/";
			ru.navigateTo(url);
			ru.maximiseBrowserWindow();

			hp.chatValidation();

			ru.closedriver();

		} catch (Exception e) {
			System.out.println(e);
			ru.closedriver();
		}
		
	}
	@Test
	public void hoverpage4() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		HoverPage hp = new HoverPage(driver);
		ReusableUtility ru = new ReusableUtility(driver);
		try {
			String url = "https://www.hover.com/";
			ru.navigateTo(url);
			ru.maximiseBrowserWindow();

			hp.twitterValidation();
			
			
			ru.navigateTo(url);
			hp.errorsValidationinChatWidget();

			ru.closedriver();

		} catch (Exception e) {
			System.out.println(e);
			ru.closedriver();
		}
		
	}
	
	
	
}
