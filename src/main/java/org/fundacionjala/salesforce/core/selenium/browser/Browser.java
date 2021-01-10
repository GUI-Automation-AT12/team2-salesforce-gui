package org.fundacionjala.salesforce.core.selenium.browser;

public class Browser {
    private String name;
    private String implicitWaitingSeconds;
    private String explicitWaitingSeconds;
    private String sleepingTimeMills;

    /**
     * [Js]Get browser's name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * [Js]Get browser's implicitWaitingSeconds.
     * @return implicitWaitingSeconds
     */
    public String getImplicitWaitingSeconds() {
        return implicitWaitingSeconds;
    }

    /**
     * [Js]Get browser's explicitWaitingSeconds.
     * @return explicitWaitingSeconds
     */
    public String getExplicitWaitingSeconds() {
        return explicitWaitingSeconds;
    }

    /**
     * [Js]Get browser's sleepingTimeMills.
     * @return sleepingTimeMills
     */
    public String getSleepingTimeMills() {
        return sleepingTimeMills;
    }
}
