Feature: owner login
Description: owner during his logging into the system goes through several cases and logging out
Actor: owner




Scenario: owner can login 

Given that the owner is not logged in 
And the password  "3456"
Then the login owner operation succeeds
And the owner is logged in



Scenario: owner enter wrong password
Given that the owner is not logged in
And the password  "Wrong_password"
Then the login operation fail
And the owner is not logged in 



Scenario: owner logs out
	Given that the owner is logged in
	When the owner logs out
	Then the owner is not logged in