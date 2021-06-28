package sample.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sample.pages.AppForForms;
import sample.utility.ReusableUtility;

public class SampleTest {

	
	@Test
	public void validateInputFormPage() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		AppForForms shravan = new AppForForms(driver);
		ReusableUtility ru = new ReusableUtility(driver);
        String url="https://www.seleniumeasy.com/test/input-form-demo.html";
       
        ru.navigateTo(url);
        ru.maximiseBrowserWindow();
		shravan.fillDetails();
		ru.closedriver();

	}
	
}
