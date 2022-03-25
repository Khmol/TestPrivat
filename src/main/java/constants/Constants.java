package constants;

public class Constants {

    public static final String HEAD_PAGE_URL = "https://next.privat24.ua/?lang=en";
    public static final String MOBILE_PAYMENT_URL = "https://next.privat24.ua/mobile?lang=en";
    public static final String CAR_LOANS_PAYMENT_URL = "https://next.privat24.ua/auto-credit/order?lang=en";
    public static final String MONEY_TRANSFER_CARD_URL = "https://next.privat24.ua/money-transfer/card?lang=en";

    // таймаут неявного ожидания
    public static final int IMPLICIT_WAIT = 10;

    public static class MobileReplenishmentTestData {
        public static final String MOBILE_PAYMENT_PHONE_NUMBER = "504735357";
        public static final String MOBILE_PAYMENT_CARD = "4506909324274797";
        public static final String MOBILE_PAYMENT_CARD_EXP_DATA = "0622";
        public static final String MOBILE_PAYMENT_CARD_CVV = "327";
        public static final String MOBILE_PAYMENT_CARD_FIRSTNAME = "PETER";
        public static final String MOBILE_PAYMENT_CARD_LASTNAME = "SCROGGS";
        public static final String MOBILE_PHONE_CONFIRMATION_DETAILS = "Mobile payment. Phone number +380504735357";
    }
}
