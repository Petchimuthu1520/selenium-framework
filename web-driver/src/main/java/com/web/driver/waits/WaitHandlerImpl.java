package com.web.driver.waits;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

/**
 * Implementation class for WaitHandler interface, providing methods to handle waits for Selenium WebDriver.
 *
 *  @author petchimuthu1520
 *  @version 1.0
 */
public class WaitHandlerImpl implements WaitHandler {

    private final WebDriver.Timeouts timeouts;

    /**
     * Constructor for WaitHandlerImpl.
     *
     * @param timeouts the timeouts for WebDriver
     */
    public WaitHandlerImpl(WebDriver.Timeouts timeouts) {
        this.timeouts = timeouts;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitHandler implicitlyWait(Duration duration) {
        return getInstance(timeouts.implicitlyWait(duration));
    }
}
