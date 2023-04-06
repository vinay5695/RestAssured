package runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources/functionalTests",
		glue= {"stepDefinitons"},
//		dryRun=true,
			plugin = {"json:target/cucumber.json"}
//			tags="@banking"
//		"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
		)
public class TestRunner {
}
