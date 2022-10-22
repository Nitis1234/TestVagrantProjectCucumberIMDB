package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/ValidateCountryAndRelese.feature",
		glue="StepDefination",
		dryRun=false,
		monochrome=true,
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Run {
   //This Class Should Be Empty
}
