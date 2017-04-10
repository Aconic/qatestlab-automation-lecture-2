package myprojects.automation.assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Base script functionality, can be used for all Selenium scripts.
 */
public abstract class BaseScript
{
    /**
     * @return New instance of {@link WebDriver} object.
     */
    public static WebDriver getDriver()
    {
        // TODO return  WebDriver instance
        String driverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        return new ChromeDriver();
    }
}
