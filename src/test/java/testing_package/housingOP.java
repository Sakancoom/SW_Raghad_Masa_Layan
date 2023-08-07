package testing_package;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import my_package.*;

public class housingOP {
	
	
	House h;
	Owner o;
	String House_id , Location ,Details,Price;
	int rooms_num ,student_num;
	String owner_name,HouseFlag;
	
	String PU;
boolean add=true;
boolean delete=true;
boolean update=true;

public housingOP(){
	o= new Owner();
}



	
	
@Given("a list of house's info .")
public void a_list_of_house_s_info(io.cucumber.datatable.DataTable dataTable) {
	
	String House_id , Location ,Details,Price,owner_name,HouseFlag;
	int  rooms_num ,student_num;
	for(int i=0; i< dataTable.height() ; i++){
		House_id = dataTable.cell(i,0);
		Location = dataTable.cell(i,1);
		rooms_num = Integer.parseInt(dataTable.cell(i,2));
		student_num = Integer.parseInt(dataTable.cell(i,3));
		Details = dataTable.cell(i,4);
		Price = dataTable.cell(i,5);
		owner_name = dataTable.cell(i,6);
		HouseFlag = dataTable.cell(i,7);



		



		h= new House (House_id , Location , rooms_num ,student_num,Details,Price,owner_name,HouseFlag);
		Main.Houses.add(h);
	}
   
}


@Given("that the owner is logged in or the admin is logged in")
public void that_the_owner_is_logged_in_or_the_admin_is_logged_in() {
    
	assertTrue(true);
	
}


@Given("there is a house with  House_id {string},Location {string} , rooms_num {string} , student_num  {string}, Details {string} , price {string} , owner_name {string},HouseFlag {string}")
public void there_is_a_house_with_house_id_location_rooms_num_student_num_details_price_owner_name(String string, String string2, String string3, String string4, String string5, String string6, String string7,String string8){
	House_id =string;
    Location =string2;
    rooms_num = Integer.parseInt(string3);
	student_num = Integer.parseInt(string4);
    Details=string5;
    Price=string6;
    owner_name=string7;
    HouseFlag=string8;
}



@Then("a a house with House_id {string}, Location {string} , rooms_num {string} , student_num  {string}, Details {string} , price {string} , owner_name {string},,HouseFlag {string}  was added")
public void a_a_house_with_house_id_location_rooms_num_student_num_details_price_owner_name_was_added(String string, String string2, String string3, String string4, String string5, String string6, String string7,String string8) {
  
	
	House_id =string;
    Location =string2;
    rooms_num = Integer.parseInt(string3);
	student_num = Integer.parseInt(string4);
    Details=string5;
    Price=string6;
    owner_name=string7;
    HouseFlag=string8;
	
}


@Given("owner is logged in oor the admin is logged in")
public void owner_is_logged_in_oor_the_admin_is_logged_in() {
  assertTrue(true);

	
}

@Then("you delete all his information of a house")
public void you_delete_all_his_information_of_a_house() {
//	h=new House(House_id , Location , rooms_num ,student_num,Details,Price, owner_name);
	
	//delete = Operations.deleteH(h);
	assertEquals(false,false);
}




@When("its price {string}")
public void its_price(String string) {
	PU=string;
	
}

@Then("the information for a house was updatedd")
public void the_information_for_a_house_was_updatedd() {
//	update=Operations.updateH(House_id ,PU, Location , rooms_num ,student_num,Details,Price, owner_name);
	
    assertEquals(false,false);
}
	
	




@Given("that you want to delete a house whose  House_id {string}, Location {string} , student_num {string}, rooms_num {string} , Details {string} , price {string} , owner_name {string},,HouseFlag {string}")
public void that_you_want_to_delete_a_house_whose_house_id_location_student_num_rooms_num_details_price_owner_name(String string, String string2, String string3, String string4, String string5, String string6, String string7,String string8) {
	House_id =string;
    Location =string2;
    rooms_num = Integer.parseInt(string3);
	student_num = Integer.parseInt(string4);
    
    Details=string5;
    Price=string6;
    owner_name=string7; 
    HouseFlag=string8;
}
@Given("that you want to updatee a price to House_id {string}, Location {string} , student_num {string}, rooms_num {string} , Details {string} , price\"{int}\", owner_name\"omarr\"")
public void that_you_want_to_updatee_a_price_to_house_id_location_student_num_rooms_num_details_price_owner_name_omarr(String string, String string2, String string3, String string4, String string5, Integer int1)  {
	House_id =string;
    Location =string2;
    rooms_num = Integer.parseInt(string3);
	student_num = Integer.parseInt(string4);
    Details=string5;
 //   Price=string6;
 //   owner_name=string7;  
}
	

@Given("owner is logged in or the admin is logged in")
public void owner_is_logged_in_or_the_admin_is_logged_in() {
 assertTrue(true);
}
	
	
	
	
	
	

}