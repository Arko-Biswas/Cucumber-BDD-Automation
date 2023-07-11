package stepDefinitionPackage;

import org.junit.jupiter.api.Assertions;

import amazonImplementation.*;
import io.cucumber.java.en.*;

public class Search_stepDefinition {
	
	AmazonImplementation AmazonImplementation_object; //Create an Object here
	SearchAmazon searchAmazon_object;
	
		
	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		System.out.println(">>> Step 1 Executed: I'm on search page");
		
	}

	@When("I search for a product with name {string} and the price {int}")
	public void i_search_for_a_product_with_name_and_the_price(String productName, Integer productPrice) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		System.out.println(">>> Step 2 Executed: Product searched with name - " + productName + " and with Product price - " + productPrice);
		
		
		AmazonImplementation_object = new AmazonImplementation(productName, productPrice); //Initialise the object 
				
	}


	@Then("Product with name {string} should be displayed to me")
	public void product_with_name_should_be_displayed_to_me(String productName) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		System.out.println(">>> Step 3 Executed: Product displayed - ");
		
		searchAmazon_object = new SearchAmazon();
		System.out.println(searchAmazon_object.displayProduct(AmazonImplementation_object));
		
		//Assertions.assertEquals(searchAmazon_object.displayProduct(AmazonImplementation_object), productName); // ******** you can use assertions to check equality *********
		
	}

	

}
