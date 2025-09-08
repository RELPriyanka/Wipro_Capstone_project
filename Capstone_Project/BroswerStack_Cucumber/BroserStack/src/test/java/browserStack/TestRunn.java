package browserStack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
                glue={"browserStack"},
                plugin= {"pretty","html:target/htmlreport.html",
		                           "json:target/jsonreport",
		                           "junit:target/junitreport.xml"}
)


public class TestRunn {

}
