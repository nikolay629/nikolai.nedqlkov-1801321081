package uni.fmi;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", plugin = {"pretty", "html:target/cucumberRaport"})
public class CucumberStarter {
}
