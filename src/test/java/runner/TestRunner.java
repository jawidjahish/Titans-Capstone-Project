package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "./src/test/resources/feature",
		glue = "stepDef",
		dryRun = false,
		tags = "@RunTime",
		monochrome = true,
		strict = true,
	    plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber.json"},
		publish = true
		
		)

public class TestRunner {
	
	@AfterClass
	public static void generateReport() {
		CucumberReportingConfig.reportConfig();
	}
	 

}
