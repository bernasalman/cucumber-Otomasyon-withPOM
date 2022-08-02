package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import javax.swing.*;

@CucumberOptions(
        features = {"src/test/java/Register.feature"}, //featurların yolu
        glue = {"stepDefinition"},  //adımların olduğu yer

       //testti yaptıktan sonra bize basit raparlar vermesi için
        plugin = { "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json","html:target/cucumber-html-report","usage:target/cucumber-usage.json","" +
                "junit:target/cucumber-results.xml" },
        dryRun = false
)

public class RunnerBelirliTestler extends AbstractTestNGCucumberTests {
}
