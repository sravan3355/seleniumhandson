package sample.test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarGurusCertifiedcars {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
	      
		 driver.get("https://www.cargurus.ca/?pid=countryPicker");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//a[@title='Questions']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("askQuestionSide")).sendKeys("jhgjboh");
		 driver.findElement(By.xpath("//input[@value='Ask Question']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("submitTopicForm_body")).click();
		 driver.findElement(By.id("submitTopicForm_2")).click();
		 
		 Thread.sleep(5000);
		 
		 
		 
		 
		 driver.close();
	       
	}
}

