package tests.money_transfers.positive;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import tests.base.BaseTest;

import static constants.Constants.MONEY_TRANSFER_CARD_URL;

public class TransferToCardPositiveTest extends BaseTest {

    @Test
    public void selectAndCloseAddComment(){
        basePage.goToUrl(MONEY_TRANSFER_CARD_URL);
        transferToCardPage.selectLinkAddComment().
                isCommentPresent().
                selectButtonCloseComment().
                isCommentAbsent();
    }
}
