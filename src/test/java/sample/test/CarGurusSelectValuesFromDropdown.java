package sample.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CarGurusSelectValuesFromDropdown {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
	      
		 driver.get("http://book.theautomatedtester.co.uk/chapter1");
		 
		 driver.manage().window().maximize();
		 
		 
		 
		 //driver.findElement(By.id("carPickerUsed_makerSelect")).click();
		//driver.findElement(By.xpath("//*[@id='carPickerUsed_makerSelect']/option[text()='All Makes']")).click();
		 
		 Select dropdown=new Select(driver.findElement(By.id("selecttype")));
		 dropdown.selectByValue("Selenium RC");
		 Thread.sleep(5000);
		 dropdown.selectByVisibleText("Selenium Grid");
		 Thread.sleep(5000);
		 dropdown.selectByIndex(0);
		 Thread.sleep(5000);
				 
		 
		 driver.close();
	       
	}
}

