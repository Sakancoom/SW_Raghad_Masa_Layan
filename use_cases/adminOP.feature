Feature: Modifying the houses
Discription:Admin can modify the houses on the application by add,update,delete any of them.
Actor: Admin


Background: 
   Given a list of houses with their state.
    |2033|RasAlain|4|3|first floor|100|Layan Othman|
    |2024|BaitWazan|6|4|with balkon|130|Masa Yaseen|
    
Scenario: A house was added succefully
Given that the admin is logged in 
And there is a house with ID "2025" ,Location "Near an najah university",rooms_num "5", student_num "1", Details "The sakan is at 7th floor with elevator",Price "120 Dinar", Owner "Dalia Manasrah" 
Then a house whose ID "2025" ,Location "Near an najah university",rooms_num "5", student_num "1", Details "The sakan is at 7th floor with elevator",Price "120 Dinar", Owner "Dalia Manasrah" was added

Scenario: Update a house information
Given that you want to update the student_num to "4"  , Price "120"
And admin is logged in 
When his own ID "2033"
Then the information for a house was updated

Scenario: Delete a house
Given that you want to delete a house whose id "2024",Location "BaitWazan",rooms_num "6", student_num "4",Details "with balkon", Price "130", Owner "Masa Yaseen"
And admin is logged in 
Then you delete all the information of the house



Scenario: Adding house fails
Given that the admin is logged in 
And there is a house with ID "2025" ,Location "Near an najah university",rooms_num "5", student_num "1", Details "The sakan is at 7th floor with elevator",Price "120 Dinar", Owner "Dalia Manasrah" 
Then the house is already exists

Scenario: Delete a house fails
Given that you want to delete a worker whose id "2024",Location "BaitWazan",rooms_num "6", student_num "4",Details "with balkon", Price "130", Owner "Masa Yaseen"
And admin is logged in
Then the house you want to delete does not exist

Scenario: Update a house information fails
Given that you want to update the student_num to "4"  , Price "120"
And admin is logged in
Then the house you want to update his information does not exist