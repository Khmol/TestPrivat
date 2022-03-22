//package common;
//
//import com.codeborne.selenide.WebDriverProvider;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.ProfilesIni;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//public class GeckoDriverProvider implements WebDriverProvider {
//
//    @Override
//    public WebDriver createDriver(DesiredCapabilities capabilities) {
//        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
//        ProfilesIni firefoxProfile = new ProfilesIni();
//        FirefoxProfile profile = firefoxProfile.getProfile("certificateIssue");
//        profile.setAcceptUntrustedCertificates(true);
//        profile.setAssumeUntrustedCertificateIssuer(false);
//        capabilities.setCapability(FirefoxDriver.PROFILE, profile);
//        return new FirefoxDriver(capabilities);
//    }
//}
