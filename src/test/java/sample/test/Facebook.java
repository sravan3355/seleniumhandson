package sample.test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
	      
		 driver.get("https://www.amazon.com");
		 
		 String url=driver.getCurrentUrl();
		 System.out.println("URL: "+url);
		 
		 String title=driver.getTitle();
		 System.out.println("TITLE: "+title);
		 
		 
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 
		 driver.findElement(By.xpath("(//h2/a)[1]")).click();
		 
		 driver.findElement(By.id("add-to-cart-button")).click();
		 
		 boolean addedToCart=driver.findElement(By.id("huc-v2-order-row-confirm-text")).isDisplayed();
		 System.out.println(addedToCart);
		 
		 
				 
				 
		 url=driver.getCurrentUrl();
		 System.out.println("URL: "+url);
		 
		 Thread.sleep(1000);
		 driver.get("https://www.uber.com");
          url=driver.getCurrentUrl();
		 
		 System.out.println("URL: "+url);
		 

		 title=driver.getTitle();
		 System.out.println("TITLE: "+title);
		 
		 
		 driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
		 
		 boolean abc=driver.findElement(By.xpath("//h2[contains(text(),'Sign up to drive & deliver')]")).isDisplayed();
		 System.out.println(abc);
		 Thread.sleep(1000);
		 
		 driver.get("https://www.flipkart.com");
         url=driver.getCurrentUrl();
		 
		 System.out.println("URL: "+url);

		 title=driver.getTitle();
		 System.out.println("TITLE: "+title);
		 driver.close();
		 
	
		 
		
	       
	}
}

