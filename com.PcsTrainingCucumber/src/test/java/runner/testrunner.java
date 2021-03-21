package runner;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//https://www.axelerant.com/resources/team-blog/setup-for-selenium-with-cucumber-using-maven

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src\\test\\java\\feature"
,glue= {"stepDefinitions"}
)
public class testrunner {
	
//Test Case  runner class for the cucumber projects


}
