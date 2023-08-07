package book.saa;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

public class Boook {
	
	Tenant t1;
	  House h1;

		boolean isbooked=false;
		boolean isEmpty=false;
		
		public void booking(Tenant t , House h)
		{
			t1=t;
			h1=h;
			
		}
	
	
		@Given("a list of houses with their state.")
		public void aListOfHousesWithTheirState(io.cucumber.datatable.DataTable dataTable) {
			assertTrue(true);
		}

			@Given("the house with HouseFlag {string} is booked")
			public void the_house_with_house_flag_is_booked(String string) {

				 
				for(House h :Main.Houses) {
			    	if(h.HouseFlag.equals(string)) {
			    		isbooked=true;
			    		isEmpty=false;
			    	}
			    	else
			    		isbooked=false;
			    	isEmpty=true;
			 }
			}
			@When("the tenant book an house")
			public void the_tenant_book_an_house(io.cucumber.datatable.DataTable dataTable) {

				for(int i=0; i<2;i++)
				{
					h1=new House();
					String A1 = dataTable.cell(i, 0);
					String A2 = dataTable.cell(i, 1);
					int A3 =Integer.parseInt(dataTable.cell(i, 2)); 
					int A4 =Integer.parseInt(dataTable.cell(i,3)); 
					String A5= dataTable.cell(i, 4);
					String A6 = dataTable.cell(i, 5);
					String  A7= dataTable.cell(i, 6);
					String A8= dataTable.cell(i, 7);
					//String  A9= dataTable.cell(i, 8);
					
					h1.id=A1;
					h1.Location=A2;
					h1.rooms_num=A3;
					h1.student_num=A4;
					h1.Details=A5;
					h1.Price=A6;
					h1.owner_name=A7;
					h1.HouseFlag=A8;
					//h1.HouseFlag=A9;
					
					Main.Houses.add(h1);
					
				}
			}


		
		@When("the house with ID {string} ,Location {string},rooms_num {int}, student_num {int}, Details {string},Price {string}, Owner {string}  ,HouseFlag {string} is not booked")
		public void theHouseWithIDLocationRoomsNumStudentNumDetailsPriceOwnerHouseFlagIsNotBooked(String string, String string2, int int1,  int int2, String string3, String string4, String string5, String string6 ) {
			 
			for(House h :Main.Houses) {
		    	if(!(h.HouseFlag.equals(string))) {
		    		isbooked=false;
		    		isEmpty=true;
		    	}
		    	else
		    		isbooked=true;
		    	isEmpty=false;
		}
			
		}





	@Then("the tenant booked an house with  ID {string} ,Location {string},rooms_num {int}, student_num {int}, Details {string},Price {string}, Owner {string}  ,HouseFlag {string}")
	public void the_tenant_booked_an_house_with_id_location_rooms_num_student_num_details_price_owner_house_flag(String string, String string2,  Integer int1,  Integer int2, String string3, String string4, String string5, String string6 ) {

		for( House h :Main.Houses) {
	    	if(!(h.id.equals(string)))
	    	{
	    		h.HouseFlag="1";
	    		
	    		isbooked=true;
	    		isEmpty=false;
	    	}
	    
	      
	  assertTrue(true);	
	 }
	     
	     
	}

	

	

	@Then("the Tenant does not book house with  ID {string} ,Location {string},rooms_num {int}, student_num {int}, Details {string},Price {string}, Owner {string}  ,HouseFlag {string}")
	public void the_tenant_does_not_book_house_with_id_location_rooms_num_student_num_details_price_owner_house_flag(String string, String string2, Integer int1,  Integer int2, String string3, String string4, String string5, String string6 ) {
		if (isbooked==true) {
			assertTrue(!isbooked);
	}
	}

}
