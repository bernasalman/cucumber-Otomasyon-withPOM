package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java"}, //featurların yolu
        glue = {"stepDefinition"},  //adımların olduğu yer
        dryRun = false
)

public class RunnerGenel extends AbstractTestNGCucumberTests {
}
