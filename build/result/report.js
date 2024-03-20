$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/forgotpassword.feature");
formatter.feature({
  "name": "Forgot password",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@forgotpassword"
    }
  ]
});
formatter.scenario({
  "name": "Open google and search for Honda",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@forgotpassword"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to Google",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automation.test.Steps.GoogleSteps.navigateToGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Honda Motor\" on the search box",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.test.Steps.GoogleSteps.userEntersOnTheSearchBox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Search",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.test.Steps.GoogleSteps.userClickSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Web shows the result",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.test.Steps.GoogleSteps.webShowsTheResult()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});