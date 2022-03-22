package tests.base;

import common.CommonAction;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.base.BasePage;
import pages.loans.CarLoansPage;
import pages.telecomunications.MobilePhoneReplenishmentPage;

import java.io.File;
import java.time.LocalTime;
import java.util.Objects;

import static common.Config.*;

@ExtendWith(Listener.class)
//@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected CarLoansPage carLoansPage = new CarLoansPage(driver);
    protected MobilePhoneReplenishmentPage mobilePhoneReplenishmentPage = new MobilePhoneReplenishmentPage(driver);
    public static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

    static {
        LOGGER.info("START TIME:" + LocalTime.now());
        LOGGER.info("Start clear reports");
        File allureResult = new File("allure-results");
        if (allureResult.isDirectory()){
            for (File item : Objects.requireNonNull(allureResult.listFiles())){
                item.delete();
            }
        }
        if(CLEAR_REPORTS_DIR){
            File allureScreenshot = new File("build/reports/tests");
            if (allureScreenshot.isDirectory()){
                for (File item : Objects.requireNonNull(allureScreenshot.listFiles())){
                    item.delete();
                }
            }
        }
    }

    @AfterEach
    void clearCookiesAndLocalStorage(){
        if (CLEAR_COOKIES) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterAll
    void close(){
        if(!HOLD_BROWSER_OPEN){
            driver.close();
        }
    }
}
