package tests.telecomunications.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constants.MOBILE_PAYMENT_URL;
import static constants.Constants.MobileReplenishmentTestData.*;

public class MobilePhoneReplenishmentTest extends BaseTest {

    @Test
    public void checkIsRedirectAuth(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.selectCardFromWallet();
        basePage.isAuthWidgetPresent();
    }

    @Test
    public void checkMinimumReplanishmentAmount(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.
                enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER).
                enterAmount("1").
                enterCardFrom(MOBILE_PAYMENT_CARD).
                enterExpDate(MOBILE_PAYMENT_CARD_EXP_DATA).
                enterCvv(MOBILE_PAYMENT_CARD_CVV).
                enterFirstname(MOBILE_PAYMENT_CARD_FIRSTNAME).
                enterLastname(MOBILE_PAYMENT_CARD_LASTNAME).
                submitToTheCard().
                isCardConfirmationPresent().
                isCardConfirmationDetailsActual("Mobile payment. Phone number +380504735357");
    }
}
