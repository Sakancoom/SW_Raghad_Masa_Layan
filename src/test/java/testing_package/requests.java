package testing_package;

import io.cucumber.java.en.*;

public class requests {

	@Given("a list of requests with their state.")
	public void aListOfRequestsWithTheirState(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@Given("there is a housing request with id {string} , Location {string}, rooms_num {string} ,student_num {string},price {string}, details {string}, owner {string}")
	public void thereIsAHousingRequestWithIdLocationRoomsNumStudentNumPriceDetailsOwner(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("a worker whose id {string} , Location {string}, rooms_num {string} ,student_num {string},price {string}, details {string}, owner {string} was added")
	public void aWorkerWhoseIdLocationRoomsNumStudentNumPriceDetailsOwnerWasAdded(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The admin want to accept a housing request whose id {string} , Location {string}, rooms_num {string} ,student_num {string},price {string}, details {string}, owner {string}")
	public void theAdminWantToAcceptAHousingRequestWhoseIdLocationRoomsNumStudentNumPriceDetailsOwner(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("the admin select {string} option")
	public void theAdminSelectOption(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("this house will added to the houses")
	public void thisHouseWillAddedToTheHouses() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("there is a house with Location {string}, rooms_num {string} ,student_num {string},price {string}, details {string}, owner {string}")
	public void thereIsAHouseWithLocationRoomsNumStudentNumPriceDetailsOwner(String string, String string2, String string3, String string4, String string5, String string6) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("a house is already exists")
	public void aHouseIsAlreadyExists() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The admin want to reject a housing request whose id {string} , Location {string}, rooms_num {string} ,student_num {string},price {string}, details {string}, owner {string}")
	public void theAdminWantToRejectAHousingRequestWhoseIdLocationRoomsNumStudentNumPriceDetailsOwner(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("this house will not added to the houses")
	public void thisHouseWillNotAddedToTheHouses() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
