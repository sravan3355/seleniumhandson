package sample.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sample.pages.CollinsPage;
import sample.utility.ReusableUtility;

public class CollinsTest {
    public static void main(String[] args)  {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        CollinsPage cp=new CollinsPage(driver);
        ReusableUtility ru=new ReusableUtility(driver);
        try {
            String url="https://www.collinsdictionary.com/";
            ru.navigateTo(url);

            ru.maximiseBrowserWindow();

            cp.ValidateCollinsLink();

            ru.closedriver();




        } catch(Exception e) {


        }

    }

}
