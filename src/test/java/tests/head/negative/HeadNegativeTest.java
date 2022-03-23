package tests.head.negative;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constants.HEAD_PAGE_URL;

public class HeadNegativeTest extends BaseTest {

    @Test
    public void checkErrorMessageAuthAndContinue(){
        basePage.goToUrl(HEAD_PAGE_URL);
        headPage.selectSignIn();
        basePage.isAuthWidgetPresent();
        headPage.switchAuthFrame().
                selectAuthContinue().
                isIncorrectMessagePresent();
    }
}
