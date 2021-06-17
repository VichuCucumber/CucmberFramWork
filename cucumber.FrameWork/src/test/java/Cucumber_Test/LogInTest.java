package Cucumber_Test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/FeatureFile/createQuotes.feature",
			glue="stepDefanetions",tags="@RegTest",stepNotifications = true)
public class LogInTest {
   
}
