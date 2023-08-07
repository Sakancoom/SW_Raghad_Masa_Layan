package book.saa;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
public class Login {

	String name;
	String id;
	String email;
	Logging g;
	Tenant t;
	 String pass;
	 
	 


	  
Boolean l=true;
	
	 public void logging_Tenant() {
	
			//pass="123456";
			id="50";
			email="masayaseen1@gmail.com";
			g.password="pass1234";
			t=new Tenant(id,name,"pass1234",email);
			Main.Tenants.add(t);
			
			
		}
	 
	 @Given("a Tenant exists")
	    public void a_tenant_exists() {
	        logging_Tenant();
	    }

	 @Given("the Tenant is not logged in")
	 public void the_tenant_is_not_logged_in() {
	 	this.g.logState(false);
	 }
	 
@Given("the password is {string}")
public void the_password_is(String string) {
	pass=string;
	name=t.getName();
}

@Then("the login operation succeeds")
public void the_login_operation_succeeds() {
	assertTrue(g.login(pass));
	this.g.logState(true);
	
}

@Then("the Tenant is logged in")
public void the_tenant_is_logged_in() {
	assertTrue(g.getLogState());
	this.g.logState(true);
}

@Then("the login operation fails")
public void the_login_operation_fails() {
assertFalse(g.login(pass));
g.logState(false);
}




@Given("that the Tenant  name {string} is logged in")
public void that_the_tenant_name_is_logged_in(String string) {
	name=string;
}
@Given("that the Tenant is not logged in")
public void that_the_tenant_is_not_logged_in() {
	this.g.logState(false);
}

@When("the Tenant logs out")
public void the_tenant_logs_out() {
	this.g.logout();
	
}
}
