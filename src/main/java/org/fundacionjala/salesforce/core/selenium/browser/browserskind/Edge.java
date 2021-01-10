package org.fundacionjala.salesforce.core.selenium.browser.browserskind;

import io.github.bonigarcia.wdm.EdgeDriverManager;
import org.fundacionjala.salesforce.core.selenium.browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static io.github.bonigarcia.wdm.DriverManagerType.EDGE;

public class Edge implements IBrowser {
    @Override
    public WebDriver initDriver() {
        EdgeDriverManager.getInstance(EDGE).version("87.0.664.66").setup();
        return new EdgeDriver();
    }
}
