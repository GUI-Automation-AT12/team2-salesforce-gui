package org.fundacionjala.salesforce.core.selenium;

import org.fundacionjala.salesforce.core.selenium.browser.Browser;
import org.fundacionjala.salesforce.core.selenium.browser.BrowserParser;
import org.fundacionjala.salesforce.core.selenium.browser.browserskind.Chrome;
import org.fundacionjala.salesforce.core.selenium.browser.browserskind.Edge;
import org.fundacionjala.salesforce.core.selenium.browser.browserskind.Firefox;
import org.fundacionjala.salesforce.core.selenium.browser.browserskind.IBrowser;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class BrowserFactory {
    /**
     * [JS]Constructor for the BrowserFactory class.
     */
    private BrowserFactory() {
    }

    private static Map<String, IBrowser> browsersMap = new HashMap<>();
    static {
        browsersMap.put("chrome", new Chrome());
        browsersMap.put("firefox", new Firefox());
        browsersMap.put("edge", new Edge());
    }

    /**
     * Gets a webDriver providing its name.
     * @param browserName name of the browser
     * @return a webDriver
     */
    public static WebDriver getWebDriver(final String browserName) {
        return browsersMap.get(browserName).initDriver();
    }

    /**
     * Gets a driverProps providing the browser name.
     * @param browserName name of the browser
     * @return Driver Properties of the browser
     * @thows IOException
     */
    public static Browser getDriverProps(final String browserName) throws IOException {
        return BrowserParser.getBrowsersMap().get(browserName);
    }
}
