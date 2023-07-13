package com.test.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//tags must be present in the feature file || @Sanity or @Regression ==> execute those test cases which are tagged with @sanity or @Regression
//@Sanity and @Regression ==> execute those test cases which are tagged with @sanity and @Regression
//not <tag> ==> execute those test cases without the tag

@CucumberOptions(
		features = {"src/test/java/FeatureFiles/Uber.feature"}, 
		glue = {"stepDefinitionPackage", "MyHooksPackage"},
		tags = "@For_All_Scenario",   		
		plugin = {"pretty", "json:target/MyReports/report.json", "junit:target/MyReports/report.xml"},
		dryRun = false//, // to check whether all scenarios have step definitions or not
		//publish = true // to generate web report
        )									

public class UberTestRunner extends AbstractTestNGCucumberTests{

}