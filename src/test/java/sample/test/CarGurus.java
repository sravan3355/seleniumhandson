package sample.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sample.pages.CarGurusPage;
import sample.utility.ReusableUtility;

public class CarGurus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		ReusableUtility ru = new ReusableUtility(driver);
		CarGurusPage cg = new CarGurusPage(driver);

		String url = "https://www.cargurus.ca/?pid=countryPicker";
		ru.navigateTo(url);

		ru.maximiseBrowserWindow();

		cg.validatedSavedSearch();

		ru.closedriver();

	}

}
