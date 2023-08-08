package testing_package;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;
import my_package.*;
import io.cucumber.java.en.Given;
import  io.cucumber.java.en.Then;
import  io.cucumber.java.en.When;

import java.util.Optional;


public class Price {
	 Tenant tenant;
	 int x;
	 @Given("inter number mounth and give the bill")
	 public void inter_number_mounth_and_give_the_bill() {
		 tenant = new Tenant();
	 }
	 
	 @When("I specify the number of months to rent as <{int}> and price for House <{int}>")
	 public void i_specify_the_number_of_months_to_rent_as_and_price_for_house(Integer int1, Integer int2) {
		 x= tenant.checkbill(int1 , int2 ) ;
	 }


@Then("the rent amount for the chosen house should be <{int}")
public void the_rent_amount_for_the_chosen_house_should_be(Integer expectedRentAmount) {
	assertEquals(String.valueOf(expectedRentAmount) ,String.valueOf(x));

	
	
	
	assertEquals( String.valueOf(expectedRentAmount),  String.valueOf(x));

}

 }
