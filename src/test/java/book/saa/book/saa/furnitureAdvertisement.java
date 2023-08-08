package book.saa;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class furnitureAdvertisement {

	Furn f;
		String name,des;
		double price;
		@Given("the user wants to advertise furniture")
		public void the_user_wants_to_advertise_furniture() {
	    f= new Furn();
		}

		@When("the user provides the following details name<{string}> and Description <{string}> and price <{double}> :")
		public void the_user_provides_the_following_details_name_and_description_and_price(String string, String string2, Double double1) {
		
		name =string;
				f.setName(string);
				
		des=string2;
				f.setDescription(string2);
		 price=double1;
		 f.setPrice(double1);
		}
		@Then("the furniture should be advertised successfully")
		public void the_furniture_should_be_advertised_successfully() {
		assertTrue(f.getDescription().equals(des) && f.getName().equals(name) && f.getPrice()==price);
		}
	}

