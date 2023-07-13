package stepDefinitionPackage;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class userRegistration_stepDefinition {
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
		
		System.out.println(">>> User navigates to registration page");
	    
	}

	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable userRegistration_dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<List<String>> userList = userRegistration_dataTable.asLists(String.class);
		
		for(List<String> e : userList) {
			System.out.println(e);
		}
	    
	}
	
	@When("User enters following user details with columns")
	public void user_enters_following_user_details_with_columns(DataTable dataTable) {
	    
		List<Map<String, String>> userList = dataTable.asMaps(String.class, String.class);
		
		System.out.println(">>> Keys and Values: " + userList);
		System.out.println(">>> " + userList.get(0).get("firstname"));
		
		for(Map<String, String> e : userList) {
			System.out.println("-------------------------");
			System.out.println("==> " + e.get("firstname"));
			System.out.println("==> " + e.get("work"));
			System.out.println("==> " + e.get("email"));
			System.out.println("==> " + e.get("phone"));
			System.out.println("==> " + e.get("city"));
			System.out.println("-------------------------");
		}
		
	}

	@Then("User registration should be successful")
	public void user_registration_should_be_successful() {
		
		System.out.println(">>> User registration successful");
	    
	}

}
