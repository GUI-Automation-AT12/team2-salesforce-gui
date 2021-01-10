package org.fundacionjala.salesforce.core.selenium.browser.browserskind;

import org.openqa.selenium.WebDriver;

public interface IBrowser {
    /**
     * [JS]Initializes a new webDriver for browser.
     * @return WebDriver
     */
    WebDriver initDriver();
}
