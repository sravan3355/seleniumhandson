package sample.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sample.pages.NikePages;
import sample.utility.ReusableUtility;

public class NikeTest {

    public static void main(String[] args)  {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        NikePages np=new NikePages(driver);
        ReusableUtility ru=new ReusableUtility(driver);
        try {
            String url="https://www.nike.com/";
            ru.navigateTo(url);

            ru.maximiseBrowserWindow();

            np.ValidateNikeLink();

            ru.closedriver();




        } catch(Exception e) {


        }

    }

}
