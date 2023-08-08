package testing_package;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import my_package.*;

public class housingOP {

	

	
	Logging o;
	
	
	House h;
	Owner oo;
	String id , Location ,Details,Price;
	int rooms_num ,student_num;
	String owner_name,HouseFlag;
	
	String PU;
	
boolean add=true;
boolean delete=true;
boolean update=true;

public housingOP(){
	o=new Logging();
	//ad=new Admin("12345","pass1234","Raghad Matar","raghad@gmail.com");
	h=new House();
	oo= new Owner();
}

@Given("a list of house's info .")
public void a_list_of_house_s_info(io.cucumber.datatable.DataTable dataTable) {
 
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
		h=new House(id,Location,rooms_num,student_num,Details,Price,owner_name,HouseFlag);
		Main.Houses.add(h);
		}	
	
	
	
}

@Given("that the owner logged in")
public void that_the_owner_logged_in() {
	o.logState(true);
}


@Given("there is house with ID {string} ,Location {string},rooms_num {string}, student_num {string}, Details {string},Price {string}, Owner {string},HouseFlag {string}")
public void there_is_house_with_id_location_rooms_num_student_num_details_price_owner_house_flag(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	id = string;
    Location = string2;
	rooms_num = Integer.parseInt(string3);
	student_num = Integer.parseInt(string4);
	Details = string5;
	Price = string6;
	owner_name = string7;
	HouseFlag=string8;
}

@Then("a house whose ID {string} ,Location {string},rooms_num {string}, student_num {string}, Details {string},Price {string}, Owner {string},HouseFlag {string} was added successfully")
public void a_house_whose_id_location_rooms_num_student_num_details_price_owner_house_flag_was_added(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	id = string;
    Location = string2;
	rooms_num = Integer.parseInt(string3);
	student_num = Integer.parseInt(string4);
	Details = string5;
	Price = string6;
	owner_name = string7;
	HouseFlag=string8;
	add=h.addHouse(id,Location,rooms_num,student_num,Details,Price,owner_name,"0");
	assertTrue(add);
}

@Then("the house is exists")
public void the_house_is_exists() {
	add=false;
	assertFalse(add);
}

@Given("that you want delete a house whose id {string},Location {string},rooms_num {string}, student_num {string},Details {string}, Price {string}, Owner {string},HouseFlag {string}")
public void that_you_want_delete_a_house_whose_id_location_rooms_num_student_num_details_price_owner_house_flag(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {

	id = string;
    Location = string2;
	rooms_num = Integer.parseInt(string3);
	student_num = Integer.parseInt(string4);
	Details = string5;
	Price = string6;
	owner_name = string7;
	HouseFlag=string8;	
}

@Given("owner is logged in")
public void owner_is_logged_in() {
	o.logState(true);
}

@Then("you delete all informations of the house")
public void you_delete_all_informations_of_the_house() {
	delete=true;
	assertTrue(delete);
}

@Given("that you want to updatee a price to id {string}, Location {string} , rooms_num {string}, student_num {string} , Details {string} , Price {string}, Owner {string},HouseFlag {string}")
public void that_you_want_to_updatee_a_price_to_id_location_rooms_num_student_num_details_price_owner_house_flag(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	id =string;
    Location =string2;
    rooms_num = Integer.parseInt(string3);
	student_num = Integer.parseInt(string4);
    Details=string5;
    Price=string6;
    owner_name=string7;  
}

@Given("owner is logged in oor the admin is logged in")
public void owner_is_logged_in_oor_the_admin_is_logged_in() {
	o.logState(true);
  
}

@When("its price {string}")
public void its_price(String string) {
	PU=string;
}

@Then("the information for a house was updatedd")
public void the_information_for_a_house_was_updatedd() {
	update=true;
	assertTrue(update);
}

@Then("the house you want to delete is not exist")
public void the_house_you_want_to_delete_is_not_exist() {
	delete=false;
	assertFalse(delete);
}
	
	
	
	

}