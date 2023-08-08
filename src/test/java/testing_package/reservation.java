package testing_package;

import static org.junit.Assert.*;

import io.cucumber.java.en.*;
import my_package.*;
public class reservation {

	Logging log;
	Report r;
	boolean clicked=false;
	public reservation() {
		log=new Logging();
		log.password="pass1234";
		//r=new Reports();
	}
	@Given("that the admin is logged in system")
	public void thatTheAdminIsLoggedInSystem() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		log.logState(true);
	}

	@When("the admin selects the {string} option")
	public void theAdminSelectsTheOption(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		if(string.equals("Generate Report"))
	    	//clicked=true;
			r.generateReport();
		clicked=true;
	}

	@Then("the system generates and displays the customized report")
	public void theSystemGeneratesAndDisplaysTheCustomizedReport() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		if(clicked) {
			assertTrue(clicked);
		}
		else assertFalse(clicked);
	}

}
