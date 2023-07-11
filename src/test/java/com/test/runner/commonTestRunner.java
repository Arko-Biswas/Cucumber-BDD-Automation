package com.test.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    
@CucumberOptions(
		features = {"src/test/java/FeatureFiles"}, 
		glue = {"stepDefinitionPackage"},
		plugin = {"pretty"}
        )
    
public class commonTestRunner extends AbstractTestNGCucumberTests {
    
}