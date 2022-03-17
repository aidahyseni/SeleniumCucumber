package testRuner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//aida.hyseni//IdeaProjects//SeleniumCucumber//Features//Login.feature",
        glue = "stepDefinition")
public class TestRunner
{
}
