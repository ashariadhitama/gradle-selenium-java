package com.automation.test.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

@Component("com.automation.test.WebDriver.Driver")
public class Driver {

    private WebDriver driver;

    public WebDriver getDriver(){
        return this.driver;
    }

    public ChromeDriver initialize() {
        return new org.openqa.selenium.chrome.ChromeDriver();
    }

    public void initializeDriver(){
        // ChromeDriver path on development machine, which is Windows
        System.setProperty("webdriver.chrome.driver",
                Paths.get("src/test/resources/chromedriver/chromedriver").toString());

        //If there is no driver running, run Chrome
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void quit(){
        this.driver.quit();
    }
}
