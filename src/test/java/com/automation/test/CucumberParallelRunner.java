package com.automation.test;

import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.junit.Courgette;
import org.junit.runner.RunWith;

@RunWith(Courgette.class)
@CourgetteOptions(
        threads = 10,
        runLevel = CourgetteRunLevel.SCENARIO,
        showTestOutput = true,
        reportTargetDir = "build/parallel",
        cucumberOptions = @courgette.api.CucumberOptions(
                features = "src/test/resources/features",
                glue = { "com.automation.test.Hooks", "com.automation.test.Steps"},
                tags = {"@googleSearch"},
                plugin = {
                        "pretty",
                        "json:build/cucumber-report/cucumber.json",
                        "html:build/cucumber-report/cucumber.html",
                        "junit:build/cucumber-report/cucumber.xml"}
        )
)
public class CucumberParallelRunner {

}
