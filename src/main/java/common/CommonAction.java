package common;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static common.Config.BROWSER_AND_PLATFORM;
import static constants.Constants.IMPLICIT_WAIT;

public class CommonAction {
    public static WebDriver createDriver() {
        WebDriver driver = null;
        switch (BROWSER_AND_PLATFORM){
            case "CHROME":
                System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
                System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                Assertions.fail("INCORRECT_BROWSER_NAME" + BROWSER_AND_PLATFORM);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}
