package sample.utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;
    private static WebDriver driver;
    public static WebDriverWait wait;

    public final static int TImeOut = 30;
    public final static int PAGE_LOAD_TIMEOUT = 50;

    private SeleniumDriver() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\5593\\Downloads\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void setDriver() {
        if (seleniumDriver == null) {
            seleniumDriver = new SeleniumDriver();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }


    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        seleniumDriver = null;
    }
}
