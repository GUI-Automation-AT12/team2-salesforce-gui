package org.fundacionjala.salesforce.core.selenium.browser.browserskind;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static io.github.bonigarcia.wdm.DriverManagerType.FIREFOX;

public class Firefox implements IBrowser {

    @Override
    public WebDriver initDriver() {
        FirefoxDriverManager.getInstance(FIREFOX).version("73.0.1").setup();
        return new FirefoxDriver();
    }
}
