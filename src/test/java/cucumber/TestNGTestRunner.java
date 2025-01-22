package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//cucumber->  TestNG, junit

@CucumberOptions(
		
		features="src/test/java/cucumber",
		glue="Subhadip.StepDefinations",
		monochrome=true, 
		tags = "@Regression", 
		plugin= {"html:target/cucumber.html"}
		
		
		
		)


public class TestNGTestRunner extends AbstractTestNGCucumberTests{

	
}
