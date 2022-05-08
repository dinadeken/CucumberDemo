package cucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features", glue= {"stepDefinition"}, plugin = { "pretty","json:target/cucumber-reports/Cucumber.json","html:target/cucumber-reports/Cucumber.html" },
monochrome = true)
public class TestRunner {
	
	

}
