package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features=".//Features//orangeHRM.feature",
		glue="stepdefinition",
		 plugin = { "pretty",
					"html:reports/cucumber1.html"},
		 monochrome=true)
public class AmazonTestRunner extends AbstractTestNGCucumberTests{

}
 