package sample.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sample.pages.GithubPage;
import sample.utility.ReusableUtility;

public class GithubEnterprise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		GithubPage gp=new GithubPage(driver);
		ReusableUtility ru=new ReusableUtility(driver);
		try {
            String url="https://github.com/";
            ru.navigateTo(url);
            
            ru.maximiseBrowserWindow();
            gp.validateTrendingSection();
            
            ru.closedriver();
			
		
	
		
		} catch (Exception e) {
			System.out.println(e);
			ru.closedriver();

		}

	}

}
