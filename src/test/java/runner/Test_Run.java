package runner;

import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;



@CucumberOptions(

		features = ".//Features//log.feature", glue = { "stepdefinition",
		"hook" }, monochrome = true, plugin = { "pretty",
		"html:reports/cucumber1.html" })
public class Test_Run extends AbstractTestNGCucumberTests{

}
