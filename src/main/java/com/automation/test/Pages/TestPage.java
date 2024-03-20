package com.automation.test.Pages;

import com.automation.test.WebDriver.Driver;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

@Component("com.automation.test.Pages.TestPage")
public class TestPage {

    @Autowired
    WebDriver driver;

    public void openForgotPasswordPage() {
        driver.navigate().to("https://the-internet.herokuapp.com/forgot_password");
    }
}
