package pages.money_transfers;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;
import org.junit.jupiter.api.Assertions;

public class TransferToCardPage extends BasePage {

    private final By linkAddComment = By.xpath("//span[@data-qa-node='toggle-comment']");
    private final By inputAddComment = By.xpath("//textarea[@data-qa-node='comment']");
    private final By buttonCloseComment = By.xpath("//div[@class='sc-EHOje fIXSYP' and @title]");

    public TransferToCardPage(WebDriver driver) {
        super(driver);
    }

    public TransferToCardPage selectLinkAddComment(){
        driver.findElement(linkAddComment).click();
        return this;
    }

    public TransferToCardPage isCommentPresent(){
        WebElement weInputAddComment = driver.findElement(inputAddComment);
        waitElementIsVisible(weInputAddComment);
        return this;
    }

    public TransferToCardPage selectButtonCloseComment(){
        driver.findElement(buttonCloseComment).click();
        return this;
    }

    public TransferToCardPage isCommentAbsent(){
        try {
            driver.findElement(inputAddComment);
        } catch (NoSuchElementException exp) {
            return this;
        }
        throw new IllegalStateException ("isCommentAbsent: Element " + inputAddComment + " still present");
    }
}
