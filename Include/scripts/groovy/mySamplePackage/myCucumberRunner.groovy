package mySamplePackage



import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features", glue="mySamplePackage", plugin = ["pretty",
	"junit:ReportCucumber/cucumber.xml",
	"html:ReportCucumber",
	"json:ReportCucumber/cucumber.json"])


public class myCucumberRunner {}