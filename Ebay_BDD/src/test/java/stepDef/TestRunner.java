package stepDef;


import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
 
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
                 glue={"stepDef"},
                 plugin= {"pretty","html:target/htmlreport.html",
		                           "json:target/jsonreport"}
)

 
 

public class TestRunner {

}
