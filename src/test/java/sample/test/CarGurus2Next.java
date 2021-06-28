package sample.test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarGurus2Next {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
	      
		 driver.get("https://www.cargurus.ca/?pid=countryPicker");
		 
		 driver.manage().window().maximize();
		 driver.findElement(By.id("account-menu-username")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Saved Searches')]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[contains(text(),'Start a new search now')]")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//a[@alt='Sedan Body Style']")).click();
		 Thread.sleep(1000);
		String heading=driver.findElement(By.xpath("//h1")).getText();
		System.out.println(heading);
		
		 
			
		
		 
		 driver.close();
	       
	}
}

