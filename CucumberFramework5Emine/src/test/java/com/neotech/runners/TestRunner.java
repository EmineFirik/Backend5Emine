


package com.neotech.runners;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(
		
		
	features = "src/test/resources/Features/",	
		
	
		
		glue = "com.neotech.steps",
		
		
		dryRun =false,
		
		
		tags = "@HW3",
		
		
		monochrome = true
		
		)

public class TestRunner {

	
	
}
