Feature: Housing requests
Description: Admin can accept or reject the requests of housing that comes from owners
Actor: Admin

Background: 
   Given a list of requests with their state.
    |1|Nablus|5|2|flat|100|Ali|
    |2|BaitWazan|6|3|with balkon|150|Ahmad| 
    
Scenario: A request was added succefully
Given that the admin is logged in 
And there is a housing request with id "3" , Location "Ras Alain", rooms_num "4" ,student_num "1",price "120", details "third floor", owner "Asem"
Then a worker whose id "3" , Location "Ras Alain", rooms_num "4" ,student_num "1",price "120", details "third floor", owner "Asem" was added



Scenario: Accept a request
Given that the admin is logged in 
And  The admin want to accept a housing request whose id "1" , Location "Nablus", rooms_num "5" ,student_num "2",price "100", details "flat", owner "Ali"
And the admin select "Accept Request" option
Then this house will added to the houses

Scenario: accept a request fails
Given that the admin is logged in 
And there is a house with Location "Nablus", rooms_num "5" ,student_num "2",price "100", details "flat", owner "Ali"
Then a house is already exists

Scenario: Reject a request
Given that the admin is logged in 
And  The admin want to reject a housing request whose id "2" , Location "BaitWazan", rooms_num "6" ,student_num "3",price "150", details "With balkon", owner "Ahmad"
And the admin select "Reject Request" option
Then this house will not added to the houses