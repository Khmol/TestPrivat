package tests.loans.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constants.CAR_LOANS_PAYMENT_URL;

public class CarLoansPositiveTest extends BaseTest {

    @Test
    public void selectAgreementTabInPublicSession(){
        basePage.goToUrl(CAR_LOANS_PAYMENT_URL);
        carLoansPage.selectAgreementTab();
        basePage.isAuthWidgetPresent();
    }
}
