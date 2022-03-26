package pages.telecomunications;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {

    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonWallet = By.xpath("//div[contains(text(),'My wallet')]");
    private final By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
    private final By inputCardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    private final By inputCardCVV = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    private final By inputAmount = By.xpath("//input[@data-qa-node='amount']");
    private final By buttonSubmitToTheCard = By.xpath("//button[@data-qa-node='submit']");
    private final By cardConfirmationWindow = By.xpath("//div[@class='root_TbQ2gtRm6W']");
    private final By inputCardFirstname = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
    private final By inputCardLastname = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
    private final By cardConfirmationDetails = By.xpath("//div[@data-qa-node='details']");

    public MobilePhoneReplenishmentPage selectCardFromWallet(){
        driver.findElement(buttonWallet).click();
        return this;
    }

    public MobilePhoneReplenishmentPage enterPhoneNumber(String number){
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }

    public MobilePhoneReplenishmentPage enterAmount(String amount){
        driver.findElement(inputAmount).sendKeys(amount);
        return this;
    }

    public MobilePhoneReplenishmentPage enterCardFrom(String card){
        driver.findElement(inputCardFrom).sendKeys(card);
        return this;
    }

    public MobilePhoneReplenishmentPage enterExpDate(String expDate){
        driver.findElement(inputCardExpDate).sendKeys(expDate);
        return this;
    }

    public MobilePhoneReplenishmentPage enterCvv(String cvv){
        driver.findElement(inputCardCVV).sendKeys(cvv);
        return this;
    }

    public MobilePhoneReplenishmentPage enterFirstname(String name){
        driver.findElement(inputCardFirstname).sendKeys(name);
        return this;
    }

    public MobilePhoneReplenishmentPage enterLastname(String name){
        driver.findElement(inputCardLastname).sendKeys(name);
        return this;
    }

    public MobilePhoneReplenishmentPage submitToTheCard(){
        driver.findElement(buttonSubmitToTheCard).click();
        return this;
    }


    public MobilePhoneReplenishmentPage isCardConfirmationPresent(){
        WebElement cardConfirm = driver.findElement(cardConfirmationWindow);
        waitElementIsVisible(cardConfirm);
        return this;
    }

    public MobilePhoneReplenishmentPage isCardConfirmationDetailsActual(String text){
        WebElement cardConfirmationDetailsText = driver.findElement(cardConfirmationDetails);
        waitElementIsVisible(cardConfirmationDetailsText);
        Assertions.assertEquals(text, cardConfirmationDetailsText.getText());
        return this;
    }

    public MobilePhoneReplenishmentPage isDefaultValueAmountMatch(Integer defaultAmount){
        WebElement weInputAmount = driver.findElement(inputAmount);
        String inputAmountTextText = weInputAmount.getAttribute("value");
        Assertions.assertEquals(String.valueOf(defaultAmount), inputAmountTextText);
        return this;
    }
}
