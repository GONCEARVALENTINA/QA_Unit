package com.chap004testswithotherclasses.examles;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;


public class TestTitleApp {
    @Test
    public void canGetUrlStatically() {
        assertEquals("Returns Hard Coded URL", "http://192.123.0.3:67", TestAppEnv.getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically() {
        assertEquals("Return domain", "192.123.0.3", TestAppEnv.DOMAIN);
        assertEquals("Return domain", "67", TestAppEnv.PORT);

    }


    @Test
    public void checkTitleCorrectOnApp() {

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://192.123.0.3:67");
        assertEquals("Title should match", "Test app", driver.getTitle());
    }
}
