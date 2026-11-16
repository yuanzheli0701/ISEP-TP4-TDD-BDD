package fr.isep.tp4;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "classpath:features",
    glue = "fr.isep.tp4",
    plugin = {"pretty", "html:target/cucumber-report.html"},
    monochrome = true
)
public class RunCucumberTest {
}
