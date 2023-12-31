package com.test.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    
//tags must be present in the feature file || @Sanity or @Regression ==> execute those test cases which are tagged with @sanity or @Regression
//@Sanity and @Regression ==> execute those test cases which are tagged with @sanity and @Regression
//not <tag> ==> execute those test cases without the tag
@CucumberOptions(
		features = {"src/test/java/FeatureFiles"}, 
		glue = {"stepDefinitionPackage"}   
        )									
    
public class commonTestRunner extends AbstractTestNGCucumberTests {
    
}