package pages.head;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;
import pages.money_transfers.TransferToCardPage;
import pages.telecomunications.MobilePhoneReplenishmentPage;

public class HeadPage extends BasePage {

    private final By buttonSignIn = By.xpath("//button[@data-qa-node='login']");
    private final By buttonAuthContinue = By.xpath("//button[@type='submit' and @class='sc-gZMcBi ghNzgc']");
    private final By errorMessage = By.xpath("//div[@class='sc-caSCKo ftTpCZ  ' and contains(text(), 'Incorrect')]");
    private final By frameAuth = By.xpath("//iframe[@src='https://login-widget.privat24.ua/']");
    private final By linkExchange = By.xpath("//div[@class='content_P1s6iVfUGg']");
    private final By buttonExchange = By.xpath("//button[@data-qa-node='exchange']");

    public HeadPage(WebDriver driver) {
        super(driver);
    }

    public HeadPage selectSignIn(){
        driver.findElement(buttonSignIn).click();
        return this;
    }

    public HeadPage selectLinkExchange(){
        driver.findElement(linkExchange).click();
        return this;
    }
    public HeadPage selectButtonExchange(){
        driver.findElement(buttonExchange).click();
        return this;
    }

    public HeadPage isButtonExchangeAbsent(){
        try {
            driver.findElement(buttonExchange);
        } catch (NoSuchElementException exp) {
            return this;
        }
        throw new IllegalStateException ("isButtonExchangeAbsent: Element " + buttonExchange + " still present");
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
