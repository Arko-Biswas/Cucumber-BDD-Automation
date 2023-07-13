package com.test.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/java/FeatureFiles/Amazon_Order_Page.feature"}, 
		glue = {"stepDefinitionPackage"},
		tags = "@Amazon",   		// tags must be present in the feature file || @Sanity or @Regression ==> execute those test cases which are tagged with @sanity or @Regression
		plugin = {"pretty"}                 // @Sanity and @Regression ==> execute those test cases which are tagged with @sanity and @Regression
        )									// not <tag> ==> execute those test cases without the tag

public class AmazonOrderPageTestRunner extends AbstractTestNGCucumberTests {

}
