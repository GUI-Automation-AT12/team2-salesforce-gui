package org.fundacionjala.salesforce.core.selenium.browser.browserskind;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

public class Chrome implements IBrowser {
    @Override
    public WebDriver initDriver() {
        ChromeDriverManager.getInstance(CHROME).version("87.0.4280.88").setup();
        return new ChromeDriver();
    }
}
