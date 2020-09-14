package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.util.concurrent.TimeUnit;

public class MyWebDriverFactory {
    //@Managed
    public static WebDriver driver;

    public static MyWebDriverFactory web() {
        driver = getFirefox();
        driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return new MyWebDriverFactory();

    }

    public static WebDriver getFirefox() {

        System.setProperty("webdriver.gecko.driver", "src/test/resources/driver/geckodriver");
        FirefoxOptions fireopts = new FirefoxOptions();
        fireopts.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        fireopts.setAcceptInsecureCerts(true);
        fireopts.setHeadless(false);
        return new FirefoxDriver(fireopts);

    }

    public WebDriver onPage(String url) {
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

}
