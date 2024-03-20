package com.automation.test.Pages;

import com.automation.test.WebDriver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("com.automation.test.Pages.GooglePage")
public class GooglePage {

    @Autowired
    WebDriver driver;

    public void navigateToGoogle() {
        driver.navigate().to("https://www.google.com");
    }

    public void userEntersOnTheSearchBox(String search) {
        driver.findElement(By.name("q")).sendKeys(search);
    }

    public void userClickSearch() {
        WebElement buttonSearch = driver.findElement(By.name("btnK"));

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(buttonSearch));
        buttonSearch.click();
    }

    public Boolean webShowsTheResult() {
        WebElement result = driver.findElement(By.xpath("//*[contains(text(),'Astra Honda Motor')]"));

        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(result));
        return result.isDisplayed();
    }
}
