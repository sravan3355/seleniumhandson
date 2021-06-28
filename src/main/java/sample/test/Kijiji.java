package sample.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kijiji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.kijiji.ca/");
		 driver.findElement(By.id("SearchKeyword")).sendKeys("house");

	}

}
