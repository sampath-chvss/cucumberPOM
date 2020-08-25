package cucmber_POM.cucmber_POM.acceptancetests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"cucmber_POM.cucmber_POM"},
        features = ".",
        format = {"pretty", "json:target/cucumber-reports/cucumber.json"},
        tags = {"@complete"}
)
public class AllTests {
}