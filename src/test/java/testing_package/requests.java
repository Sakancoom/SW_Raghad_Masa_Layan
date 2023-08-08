package testing_package;

import static org.junit.Assert.*;

import io.cucumber.java.en.*;
import my_package.*;
public class requests {
	Logging log;
	request r;
	House hhh;
	String id,Location;
	int rooms_num;
	int student_num;
	String Details,Price,owner_name;
	boolean accept=true;
	//boolean reject=true;
	public requests() {
		r=new request(id,Location,rooms_num,student_num,Details,Price,owner_name);
		log=new Logging();
		hhh=new House(id,Location,rooms_num,student_num,Details,Price,owner_name,"0");
	}

	@Given("a list of requests with their state.")
	public void aListOfRequestsWithTheirState(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new io.cucumber.java.PendingException();
		
		String id,Location;
		int rooms_num;
		int student_num;
		String Details,Price,owner_name;
		for(int i=0; i< dataTable.height() ; i++){
			id = dataTable.cell(i,0);
		    Location = dataTable.cell(i,1);
			rooms_num = Integer.parseInt(dataTable.cell(i,2));
			student_num = Integer.parseInt(dataTable.cell(i,3));
			Details = dataTable.cell(i,4);
			Price = dataTable.cell(i,5);
			owner_name = dataTable.cell(i,6);
			r=new request(id,Location,rooms_num,student_num,Details,Price,owner_name);
			Main.requests.add(r);
			}
	}

	@Given("there is a housing request with id {string} , Location {string}, rooms_num {string} ,student_num {string},price {string}, details {string}, owner {string}")
	public void thereIsAHousingRequestWithIdLocationRoomsNumStudentNumPriceDetailsOwner(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		id = string;
	    Location = string2;
		rooms_num = Integer.parseInt(string3);
		student_num = Integer.parseInt(string4);
		Details = string5;
		Price = string6;
		owner_name = string7;
		
	}

	@Then("a house whose id {string} , Location {string}, rooms_num {string} ,student_num {string},price {string}, details {string}, owner {string} was added")
	public void aHouseWhoseIdLocationRoomsNumStudentNumPriceDetailsOwnerWasAdded(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//hhh=new House(id,Location,rooms_num,student_num,Details,Price,owner_name);
		//Main.Houses.add(hhh);
		assertTrue(hhh.addHouse(id,Location,rooms_num,student_num,Details,Price,owner_name,"0"));
		
	}

	@Given("The admin want to accept a housing request whose id {string} , Location {string}, rooms_num {string} ,student_num {string},price {string}, details {string}, owner {string}")
	public void theAdminWantToAcceptAHousingRequestWhoseIdLocationRoomsNumStudentNumPriceDetailsOwner(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		id = string;
	    Location = string2;
		rooms_num = Integer.parseInt(string3);
		student_num = Integer.parseInt(string4);
		Details = string5;
		Price = string6;
		owner_name = string7;
	}

	@Given("the admin select {string} option")
	public void theAdminSelectOption(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		if(string.equals("Accept Request")) {
	    	accept=true;
	    	assertTrue(accept);
		}
		
		else if(string.equals("Reject Request"))
			{
			accept=false;
			assertFalse(accept);
			}
	}

	@Then("this house will added to the houses")
	public void thisHouseWillAddedToTheHouses() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		accept=hhh.addHouse(id,Location,rooms_num,student_num,Details,Price,owner_name,"0");
		assertTrue(accept);
	}

	@Given("there is a house with Location {string}, rooms_num {string} ,student_num {string},price {string}, details {string}, owner {string}")
	public void thereIsAHouseWithLocationRoomsNumStudentNumPriceDetailsOwner(String string, String string2, String string3, String string4, String string5, String string6) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//id = string;
	    Location = string;
		rooms_num = Integer.parseInt(string2);
		student_num = Integer.parseInt(string3);
		Details = string4;
		Price = string5;
		owner_name = string6;
	}

	@Then("a house is already exists")
	public void aHouseIsAlreadyExists() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//accept=hhh.add_house(id,Location,rooms_num,student_num,Details,Price,owner_name);
		accept=false;
		assertFalse(accept);
	}

	@Given("The admin want to reject a housing request whose id {string} , Location {string}, rooms_num {string} ,student_num {string},price {string}, details {string}, owner {string}")
	public void theAdminWantToRejectAHousingRequestWhoseIdLocationRoomsNumStudentNumPriceDetailsOwner(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		id = string;
	    Location = string2;
		rooms_num = Integer.parseInt(string3);
		student_num = Integer.parseInt(string4);
		Details = string5;
		Price = string6;
		owner_name = string7;
	}

	@Then("this house will not added to the houses")
	public void thisHouseWillNotAddedToTheHouses() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		accept=false;
		assertFalse(accept);
	}

}
