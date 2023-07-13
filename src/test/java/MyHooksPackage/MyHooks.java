package MyHooksPackage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	
	// for before, the order goes like 1, 2, 3, 4....
	@Before( order = 1 )
	public void setup_browser() {
		System.out.println(">>> Launch Chrome Browser");
	}
	
	@Before( order = 2 )
	public void setup_url() {
		System.out.println(">>> Launch URL");
	}
	
	
	// for after, the order goes reverse like ....4, 3, 2, 1
	@After( order = 2 )
	public void tearDown_logOut() {
		
		System.out.println(">>> Logout from application");
		
	}
	
	@After( order = 1 )
	public void tearDown_close() {
		
		System.out.println(">>> Close the browser");
		
	}
	
		

}
