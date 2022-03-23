package pages.head;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;
import pages.telecomunications.MobilePhoneReplenishmentPage;

import java.time.Duration;

public class HeadPage extends BasePage {

    private final By buttonSignIn = By.xpath("//button[@data-qa-node='login']");
    private final By buttonAuthContinue = By.xpath("//button[@type='submit' and @class='sc-gZMcBi ghNzgc']");
    private final By errorMessage = By.xpath("//div[@class='sc-caSCKo ftTpCZ  ' and contains(text(), 'Incorrect')]");
    private final By frameAuth = By.xpath("//iframe[@src='https://login-widget.privat24.ua/']");

    public HeadPage(WebDriver driver) {
        super(driver);
    }

    public HeadPage selectSignIn(){
        driver.findElement(buttonSignIn).click();
        return this;
    }

    public HeadPage selectAuthContinue(){
        driver.findElement(buttonAuthContinue).click();
        return this;
    }

    public HeadPage switchAuthFrame(){
        driver.switchTo().frame(driver.findElement(frameAuth));
        return this;
    }

    public HeadPage isIncorrectMessagePresent(){
        driver.findElement(errorMessage);
        return this;
    }
}
