package stepDefinitionPackage;

import io.cucumber.java.en.*;

public class UberBooking_stepDefinition {
	
	@Given("User wants to select a car type {string} from the app")
	public void user_wants_to_select_a_car_type_from_the_app(String carType) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Step 1: " + carType);
	}
	@When("User selects car type {string} and pick up point {string} and drop point {string}")
	public void user_selects_car_type_and_pick_up_point_and_drop_point(String carType, String pickUpLocation, String dropLocation) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 2: " + carType + " " + pickUpLocation + " " + dropLocation);
	}
	@Then("Driver starts journey")
	public void driver_starts_journey() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3");
	}
	@When("driver ends journey")
	public void driver_ends_journey() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 4");
	}
	@Then("^user pays (\\d+) USD for the car type \"([^\"]+)\" ride$") //using regular expression ==> read Documentation
	public void user_pays_usd(Integer amount, String carType) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 5: " + amount + " for car type " + carType + " ride");
	}

}
