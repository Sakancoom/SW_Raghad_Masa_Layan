package testing_package;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import my_package.Logging;

public class ownerloging {
	//here the class logging in the main
	
	
	//obj from class
	Logging o;
	public String password;
	
	
	
	
	public  ownerloging (){
		o=new Logging();
		o.password="owner123";

	} 
	
	@Given("that the owner is not logged in")
	public void that_the_owner_is_not_logged_in() {
		o.logState(false);
	   
	}
	
	@Then("the owner is logged in")
	public void the_owner_is_logged_in() {
		assertFalse(o.getLogState());
	   
	}
	
	@Given("the password  {string}")
	public void the_password(String string) {
		password = string;
	   
	}

	@Then("the login owner operation succeeds")
	public void the_login_owner_operation_succeeds() {
	//assertTrue(o.login(password));
		
	    
	}



	@Then("the login operation fail")
	public void the_login_operation_fail() {
		assertFalse(o.login(password));
	   
	}

	@Then("the owner is not logged in")
	public void the_owner_is_not_logged_in() {
	 o.logState(false);
	    
	}

	@Given("that the owner is logged in")
	public void that_the_owner_is_logged_in() {
		o.logState(true);
	   
	}

	@When("the owner logs out")
	public void the_owner_logs_out() {
		o.logout();
	   
	}


}
