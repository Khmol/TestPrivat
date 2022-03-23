package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * переход на страницу с адресом url
     * @param url - адрес на который переходим
     */
    public void goToUrl(String url){
        driver.get(url);
    }

    /**
     * параметры явного ожидания
     * @param element - элемент для которого используется ожидание
     * @return - этот же элемент
     */
    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public final By authWidget = By.xpath("//iframe[@src='https://login-widget.privat24.ua/']");

    public void isAuthWidgetPresent(){
        WebElement authFrame = driver.findElement(authWidget);
        waitElementIsVisible(authFrame);
    }
}
