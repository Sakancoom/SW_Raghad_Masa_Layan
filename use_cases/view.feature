@tag
Feature: View house information
  Discription:The tenant wants to see the house information
Actor: Tenant
Background: 
   Given a list of houses with their state.
    |2033|RasAlain|4|3|first floor|100|Layan Othman|1|
    |2024|BaitWazan|6|4|with balkon|130|lara ahmad|0|
  @tag1
  Scenario: View completed successfully
Given that the Tenant is logged in 
 |2033|RasAlain|4|3|first floor|100|Layan Othman|1|
|2024|BaitWazan|6|4|with balkon|130|lara ahmad|0| 

Then the  house with ID "2024" ,Location "BaitWazan",rooms_num "6", student_num "4", Details "with balkon",Price "130", Owner "lara ahmad"  ,HouseFlag "0"  diplayed

  @tag2
  Scenario: View failed
   Given that the Tenant is logged in 
Given the house with id "3333" is  not Exist

 
 |2033|RasAlain|4|3|first floor|100|Layan Othman|1|
|2024|BaitWazan|6|4|with balkon|130|lara ahmad|0| 

  
Then The entry statement was incorrectly printed