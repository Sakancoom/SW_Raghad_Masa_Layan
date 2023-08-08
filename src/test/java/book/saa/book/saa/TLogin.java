
package book.saa;

import static org.junit.Assert.*;

import io.cucumber.java.en.*;

public class TLogin {

	String name;
	String id;
	String email;
	Logging g;
	Tenant t;
	public String pass;
	
	public void logging_Tenant() {
		g=new Logging();
		//pass="123456";
		id="2001";
		email="alaa@gmail.com";
		g.password="alaa200";
		t=new Tenant(id,"alaa200",email,name);
		Main.Tenants.add(t);
		
	}@Given("that the Tenant is not logged in")
public void that_the_tenant_is_not_logged_in() {
		g.logState(false);
}

@Given("the password is {string}")
public void the_password_is(String string) {
	pass=string;
	email=t.getEmail();
    
}

@Then("the login operation succeeds")
public void the_login_operation_succeeds() {
	assertTrue(g.login(pass));
}

@Then("the Tenant is logged in")
public void the_tenant_is_logged_in() {
	assertTrue(g.getLogState());
}

@Then("the login operation fails")
public void the_login_operation_fails() {
	assertFalse(g.login(pass));
}

@Then("the Tenant is not logged in")
public void the_tenant_is_not_logged_in() {
	g.logState(false);
}

@Given("that the Tenant  email {string} is logged in")
public void that_the_tenant_email_is_logged_in(String string) {
	name=string;
}

@When("the Tenant logs out")
public void the_tenant_logs_out() {
	g.logout();
}}