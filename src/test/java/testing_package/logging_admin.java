package testing_package;

import static org.junit.Assert.*;

import io.cucumber.java.en.*;
import my_package.*;
public class logging_admin {

	String name;
	String id;
	String email;
	Logging g;
	Admin ad;
	public String pass;
	public logging_admin() {
		g=new Logging();
		//pass="123456";
		g.password=pass;
		ad=new Admin(id,name,"123456",email);
		Main.Admins.add(ad);
		
	}
	@Given("that the admin is not logged in")
	public void thatTheAdminIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		g.logState(false);
	}

	@Given("the password is {string}")
	public void thePasswordIs(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		pass=string;
		name=ad.getName();
	    
	}

	@Then("the login operation succeeds")
	public void theLoginOperationSucceeds() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		assertTrue(g.login(pass));
	}

	@Then("the admin is logged in")
	public void theAdminIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the login operation fails")
	public void theLoginOperationFails() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		assertFalse(g.login(pass));
	}

	@Then("the admin is not logged in")
	public void theAdminIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("that the admin  name {string} is logged in")
	public void thatTheAdminNameIsLoggedIn(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the admin logs out")
	public void theAdminLogsOut() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}

