package org.fundacionjala.salesforce.core.selenium;

import org.fundacionjala.salesforce.core.selenium.browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class WebDriverManager {

    private static WebDriverManager webDriverManager;
    private static String browserName;
    private final WebDriver webDriver;
    private final WebDriverWait webDriverWait;


    /**
     * [JS] Gets an instance of the webdriver using singleton pattern.
     * @return webDriverManager
     */
    public static WebDriverManager getInstance() {
        if (webDriverManager == null) {
            try {
                webDriverManager = new WebDriverManager();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return webDriverManager;
    }

    public WebDriverManager() throws IOException {
        Browser browser = BrowserFactory.getDriverProps(browserName);
        webDriver = BrowserFactory.getWebDriver(browserName);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().
            implicitlyWait(Long.parseLong(browser.getImplicitWaitingSeconds()), TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, Long.parseLong(browser.getExplicitWaitingSeconds()),
                            Long.parseLong(browser.getSleepingTimeMills()));
    }

    /**
     * [JS]Sets the browser to run the tests, providing its name.
     * @param browser name of the browser
     */
    public static void setBrowserName(final String browser) {
        WebDriverManager.browserName = browser;
    }

    /**
     * [JS]Return the webDriver of the singleInstance.
     * @return webDriver
     */
    public WebDriver getWebDriver() {
        return webDriver;
    }

    /**
     * [JS]Return the webDriverWait of the singleInstance.
     * @return webDriverWait
     */
    public WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }

    /**
     * [JS]Quits the webDriver and set webDriverManager single instance as null.
     */
    public void quit() {
        this.webDriver.quit();
        webDriverManager = null;
    }
}
