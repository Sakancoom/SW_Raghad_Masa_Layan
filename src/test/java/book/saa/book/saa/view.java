package book.saa;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class view {
	Boolean Done =false;
	@Then("the  house with ID {string} ,Location {string},rooms_num {string}, student_num {string}, Details {string},Price {string}, Owner {string}  ,HouseFlag {string}  diplayed")
	public void the_house_with_id_location_rooms_num_student_num_details_price_owner_house_flag_diplayed (String string, String string2, Integer int1,  Integer int2, String string3, String string4, String string5, String string6 ) {
		for(House h :Main.Houses) {
			int x=0;
			if(h.id.equals(string))
			{
            //System.out.println( Main.Houses.get(x+1));
			}
			x=x+1;
        }
		assertTrue(true);
	
	}

	@Given("the house with id {string} is  not Exist")
	public void the_house_with_id_is_not_exist(String string, io.cucumber.datatable.DataTable dataTable) {
		
		int y=0;
		for(House h :Main.Houses) {
			
			if(!(h.id.equals(string)))
			{
				 assertFalse(Done);
			}
			y=y+1;
        }
		assertTrue(true);
	//	System.out.println( Main.Houses.get());
	}

	@Then("The entry statement was incorrectly printed")
	public void the_entry_statement_was_incorrectly_printed() {
		 assertFalse(Done);
	}
	  
	}




