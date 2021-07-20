package sample.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sample.utility.SeleniumDriver;

public class Hooks {

    @Before
    public void StartDriver(){
        SeleniumDriver.setDriver();
    }

    @After
    public void close(){
        SeleniumDriver.tearDown();
    }
}
