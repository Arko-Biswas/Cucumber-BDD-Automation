package com.test.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/java/FeatureFiles/Login.feature"}, 
		glue = {"stepDefinitionPackage", "MyHooksPackage"},
		tags = "@Login",   		
		plugin = {"json:target/MyReports/report.json", "junit:target/MyReports/report.xml"},
		dryRun = false//, // to check whether all scenarios have step definitions or not
		//publish = true // to generate web report
        )	

public class LoginTestRunner extends AbstractTestNGCucumberTests {

}
