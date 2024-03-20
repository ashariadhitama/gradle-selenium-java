package com.automation.test.Hooks;

import com.automation.test.WebDriver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;


public class GeneralHooks {

    @Autowired
    WebDriver driver;

    @Before
    public void before() {

    }

    @After
    public void after() {
        driver.quit();
    }

}
