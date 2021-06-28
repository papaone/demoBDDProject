package demo.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.ErrorHandler;

import java.util.concurrent.TimeUnit;

public class BaseHook {
    protected static WebDriver driver;

    @Before
    public static WebDriver setUp() {
        if(driver != null)
        {
            return driver;
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    @After
    public static void closeDriver() {
        if (driver != null) {
            try {
                driver.close();
            } catch (NoSuchMethodError nsme) {
            }
            driver = null;
        }
    }
}
