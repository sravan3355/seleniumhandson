package sample.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/sample/features",
        glue= {"sample.step_definitions"},
        plugin = { "pretty","html:target/cucumber-reports.html",
        "json:target/cucumber-reports/Cucumber.json"},
        tags="@Collins",
        monochrome = true
)

public class cucumberRunner {

}


