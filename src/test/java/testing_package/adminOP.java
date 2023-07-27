package testing_package;

import io.cucumber.java.en.*;

public class adminOP {

	@Given("a list of houses with their state.")
	public void aListOfHousesWithTheirState(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@Given("that the admin is logged in")
	public void thatTheAdminIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("there is a house with ID {string} ,Location {string},rooms_num {string}, student_num {string}, Details {string},Price {string}, Owner {string}")
	public void thereIsAHouseWithIDLocationRoomsNumStudentNumDetailsPriceOwner(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("a house whose ID {string} ,Location {string},rooms_num {string}, student_num {string}, Details {string},Price {string}, Owner {string} was added")
	public void aHouseWhoseIDLocationRoomsNumStudentNumDetailsPriceOwnerWasAdded(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("that you want to update the student_num to {string}  , Price {string}")
	public void thatYouWantToUpdateTheStudentNumToPrice(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("admin is logged in")
	public void adminIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("his own ID {string}")
	public void hisOwnID(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the information for a house was updated")
	public void theInformationForAHouseWasUpdated() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("that you want to delete a house whose id {string},Location {string},rooms_num {string}, student_num {string},Details {string}, Price {string}, Owner {string}")
	public void thatYouWantToDeleteAHouseWhoseIdLocationRoomsNumStudentNumDetailsPriceOwner(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("you delete all the information of the house")
	public void youDeleteAllTheInformationOfTheHouse() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the house is already exists")
	public void theHouseIsAlreadyExists() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("that you want to delete a worker whose id {string},Location {string},rooms_num {string}, student_num {string},Details {string}, Price {string}, Owner {string}")
	public void thatYouWantToDeleteAWorkerWhoseIdLocationRoomsNumStudentNumDetailsPriceOwner(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the house you want to delete does not exist")
	public void theHouseYouWantToDeleteDoesNotExist() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the house you want to update his information does not exist")
	public void theHouseYouWantToUpdateHisInformationDoesNotExist() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
