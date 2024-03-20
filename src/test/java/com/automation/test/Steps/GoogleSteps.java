package com.automation.test.Steps;

import com.automation.test.Pages.GooglePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class GoogleSteps {

    @Autowired
    GooglePage googlePage;

    @Given("Navigate to Google")
    public void navigateToGoogle() {
        googlePage.navigateToGoogle();
    }

    @When("User enters {string} on the search box")
    public void userEntersOnTheSearchBox(String search) {
        googlePage.userEntersOnTheSearchBox(search);
    }

    @And("User click Search")
    public void userClickSearch() {
        googlePage.userClickSearch();
    }

    @Then("Web shows the result")
    public void webShowsTheResult() {
        Assert.assertTrue(googlePage.webShowsTheResult());
    }
}
