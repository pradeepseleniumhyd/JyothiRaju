package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\marri\\OneDrive\\Desktop\\JyothiRaj\\Code\\ToolsQAPracticeForm\\src\\test\\java\\features\\LoginScenaioOutline2.feature",
		glue= {"stepdefinitions"},
		dryRun=false,
		plugin = {"pretty","html:target/raju/jyothi.html","junit:target/raju/jyothi.json","junit:target/raju/jyothi.xml"},
	monochrome = true,
	publish=true
		
		)
public class ToolsQARunner {
	
	//code
	

}
