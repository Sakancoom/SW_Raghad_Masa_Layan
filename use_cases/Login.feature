@tag
Feature: Tenant logging
Description: Tenant during his logging into the system goes through several cases
Actor: Tenant

Scenario: Tenant can login 
Given that the Tenant is not logged in 
And the password is "pass1234"
Then the login operation succeeds
And the Tenant is logged in

Scenario: Tenant enter wrong password
Given that the Tenant is not logged in
And the password is "Wrong_password"
Then the login operation fails
And the Tenant is not logged in  

Scenario: Tenant logs out
Given that the Tenant  name "Masa Yaseen" is logged in
When the Tenant logs out
Then the Tenant is not logged in