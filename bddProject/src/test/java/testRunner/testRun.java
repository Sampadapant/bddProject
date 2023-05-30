package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "src/test/resources/Features",
		glue = {"stepDefinitions"},
		plugin = {"json:target/cucumber.json"}
		
		)
public class testRun {

}
  