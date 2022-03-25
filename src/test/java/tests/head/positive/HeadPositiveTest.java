package tests.head.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constants.HEAD_PAGE_URL;

public class HeadPositiveTest extends BaseTest{

    @Test
    public void checkRedirectToTransferWhenExchangeWithoutData(){
        basePage.goToUrl(HEAD_PAGE_URL);
        headPage.selectLinkExchange().
                selectButtonExchange().
                isButtonExchangeAbsent();
    }
}
