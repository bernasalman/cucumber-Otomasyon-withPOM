package Runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        plugin =
                {"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"},

        tags = {"@SmokeTest"}
        ,
        features = {"src/test/java"},

        glue = {"stepDefinition"},

        dryRun = false
)

        public class SmokeTest extends AbstractTestNGCucumberTests {
        @AfterClass
        public static void afterClass(){
                Reporter.loadXMLConfig("src/main/java/XMLFiles/extendReportSet.xml");

                Reporter.setSystemInfo("QA Tester : ", "Berna Salman");//kendi bilgilerinizi ekleyin.
                Reporter.setSystemInfo("Application name : ", "Your Store Test  ");
                Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
                Reporter.setSystemInfo("Department", "QA");
                Reporter.setTestRunnerOutput("Test execution Cucumber Report");
        }
}
