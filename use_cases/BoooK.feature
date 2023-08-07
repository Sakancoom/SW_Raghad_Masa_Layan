@tag
Feature: booking house
Discription:Tenant book house
Actor: Tenant
Background: 
   Given a list of houses with their state.
    |2033|RasAlain|4|3|first floor|100|Layan Othman|1|
    |2024|BaitWazan|6|4|with balkon|130|lara ahmad|0|

Scenario: Booking a Specific House successfully

Given that the Tenant is logged in 
Given the house with HouseFlag "1" is booked
 When the tenant book an house 
 
|2033|RasAlain|4|3|first floor|100|Layan Othman|1|
|2024|BaitWazan|6|4|with balkon|130|lara ahmad|0|  

And the house with ID "2024" ,Location "BaitWazan",rooms_num "6", student_num "4", Details "with balkon",Price "130", Owner "lara ahmad"  ,HouseFlag "0" is not booked

  Then  the tenant booked an house with  ID "2024" ,Location "BaitWazan",rooms_num 6, student_num 4, Details "with balkon",Price "130", Owner "lara ahmad"  ,HouseFlag "0" 



  @tag2
Scenario: can not book a Specific House successfully
Given that the Tenant is logged in 
Given the house with HouseFlag "1" booked
 When the tenant book an house 
 
|2033|RasAlain|4|3|first floor|100|Layan Othman|1|
|2024|BaitWazan|6|4|with balkon|130|lara ahmad|0|  


 And the house with   ID "2033" ,Location "RasAlain",rooms_num "4", student_num "3", Details "first floor",Price "100", Owner "Layan Othman"  ,HouseFlag "1"  is   Booked
 Then the Tenant does not book house with  ID "2033" ,Location "RasAlain",rooms_num 4, student_num 3, Details "first floor",Price "100", Owner "Layan Othman"  ,HouseFlag "1" 
