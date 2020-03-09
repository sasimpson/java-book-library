package us.scottic.library.StepDefs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features="src/test/resources/features", glue="us.scottic.library.StepDefs", strict = true)
public class CucumberTests {
}
