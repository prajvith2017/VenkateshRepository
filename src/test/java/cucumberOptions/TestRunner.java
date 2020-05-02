package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
						glue="stepDefinitions",
						tags="@@Regression",
						dryRun=false,
						monochrome=true,
						strict=true,
						plugin={"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"})

public class TestRunner {
	
	

}
