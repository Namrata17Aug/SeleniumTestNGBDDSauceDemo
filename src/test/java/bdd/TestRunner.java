package bdd;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/", glue="stepDefinitions", monochrome = true,
plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
tags = "@sorting or @count")
public class TestRunner {
}

