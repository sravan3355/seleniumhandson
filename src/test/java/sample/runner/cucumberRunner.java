package sample.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/sample/features",
        glue= {"sample.step_definitions"},
        plugin = { "pretty" },
        tags="@Collins",
        monochrome = true,
        publish=true
)

public class cucumberRunner {

}


