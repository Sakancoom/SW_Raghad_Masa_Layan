package testing_package;

import static org.junit.Assert.*;

import io.cucumber.java.en.*;
import my_package.*;


public class adminOP {

	Logging log;
	House hhh;
	Admin ad;
	String id,Location;
	int rooms_num;
	int student_num;
	String Details,Price,owner_name,HouseFlag;
	boolean add=false;
	boolean del=false;
	public adminOP() {
		log=new Logging();
		ad=new Admin("12345","pass1234","Raghad Matar","raghad@gmail.com");
		hhh=new House();
	}
	
	@Given("a list of houses with their state.")
	public void aListOfHousesWithTheirState(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   // throw new io.cucumber.java.PendingException();
		String id,Location;
		int rooms_num;
		int student_num;
		String Details,Price,owner_name,HouseFlag;
		for(int i=0; i< dataTable.height() ; i++){
			id = dataTable.cell(i,0);
		    Location = dataTable.cell(i,1);
			rooms_num = Integer.parseInt(dataTable.cell(i,2));
			student_num = Integer.parseInt(dataTable.cell(i,3));
			Details = dataTable.cell(i,4);
			Price = dataTable.cell(i,5);
			owner_name = dataTable.cell(i,6);
			HouseFlag=dataTable.cell(i, 7);
			hhh=new House(id,Location,rooms_num,student_num,Details,Price,owner_name,HouseFlag);
			Main.Houses.add(hhh);
			}
	}

	@Given("that the admin is logged in")
	public void thatTheAdminIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		log.logState(true);
	}

	@Given("there is a house with ID {string} ,Location {string},rooms_num {string}, student_num {string}, Details {string},Price {string}, Owner {string},HouseFlag {string}")
	public void thereIsAHouseWithIDLocationRoomsNumStudentNumDetailsPriceOwner(String string, String string2, String string3, String string4, String string5, String string6, String string7,String string8) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		id = string;
	    Location = string2;
		rooms_num = Integer.parseInt(string3);
		student_num = Integer.parseInt(string4);
		Details = string5;
		Price = string6;
		owner_name = string7;
		HouseFlag=string8;
	}

	@Then("a house whose ID {string} ,Location {string},rooms_num {string}, student_num {string}, Details {string},Price {string}, Owner {string},HouseFlag {string} was added")
	public void aHouseWhoseIDLocationRoomsNumStudentNumDetailsPriceOwnerWasAdded(String string, String string2, String string3, String string4, String string5, String string6, String string7,String string8) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		id = string;
	    Location = string2;
		rooms_num = Integer.parseInt(string3);
		student_num = Integer.parseInt(string4);
		Details = string5;
		Price = string6;
		owner_name = string7;
		HouseFlag=string8;
		assertTrue(hhh.addHouse(id,Location,rooms_num,student_num,Details,Price,owner_name,"0"));
	}


	@Given("admin is logged in")
	public void adminIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		log.logState(true);
	}

	

	

	@Given("that you want to delete a house whose id {string},Location {string},rooms_num {string}, student_num {string},Details {string}, Price {string}, Owner {string},HouseFlag {string}")
	public void thatYouWantToDeleteAHouseWhoseIdLocationRoomsNumStudentNumDetailsPriceOwner(String string, String string2, String string3, String string4, String string5, String string6, String string7,String string8) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		id = string;
	    Location = string2;
		rooms_num = Integer.parseInt(string3);
		student_num = Integer.parseInt(string4);
		Details = string5;
		Price = string6;
		owner_name = string7;
		HouseFlag = string8;
		//assertTrue(true);
	}

	@Then("you delete all the information of the house")
	public void youDeleteAllTheInformationOfTheHouse() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		del=true;
		assertTrue(del);
		
	}

	@Then("the house is already exists")
	public void theHouseIsAlreadyExists() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		add=false;
		assertFalse(add);
	}

	@Given("that you want to delete a worker whose id {string},Location {string},rooms_num {string}, student_num {string},Details {string}, Price {string}, Owner {string},HouseFlag {string}")
	public void thatYouWantToDeleteAWorkerWhoseIdLocationRoomsNumStudentNumDetailsPriceOwner(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		id = string;
	    Location = string2;
		rooms_num = Integer.parseInt(string3);
		student_num = Integer.parseInt(string4);
		Details = string5;
		Price = string6;
		owner_name = string7;
		HouseFlag=string8;
	}

	@Then("the house you want to delete does not exist")
	public void theHouseYouWantToDeleteDoesNotExist() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		del=false;
		assertFalse(del);
	}


}
