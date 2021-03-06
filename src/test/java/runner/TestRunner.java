package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "features",glue ={"stepDefinition"}
		format = {"pretty", "json:target/cucumber.json"},
		features = {"src/cucumbertest/"}
		)
public class TestRunner {

}
