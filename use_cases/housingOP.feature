Feature: Recording a full information of house
Actor: owner

Background: 
   Given a list of house's info .
    |41|amriah |3|2|The sakan is has balcony    |3000|ahmad|0|  
    |52|rafidia|3|4|The sakan is has balcony|2500|omar| 0 |

    
    



Scenario: A house was added succefully
Given that the owner is logged in 
And there is house with ID "12" ,Location "near barlin",rooms_num "3", student_num "2", Details "The sakan is has balcony",Price "2000", Owner "hatem",HouseFlag "0" 
Then a house whose ID "12" ,Location "near barlin",rooms_num "3", student_num "2", Details "The sakan is has balcony",Price "2000", Owner "hatem",HouseFlag "0" was added successfully



Scenario: Adding house fails
Given that the owner logged in 
And there is a house with ID "12" ,Location "near barlin",rooms_num "3", student_num "2", Details "The sakan is has balcony",Price "2000", Owner "hatem",HouseFlag "0"  
Then the house is exists



Scenario: Delete a house
Given that you want delete a house whose id "41",Location "amriah",rooms_num "3", student_num "2",Details "The sakan is has balcony", Price "2500", Owner "omar",HouseFlag "0"
And owner is logged in 
Then you delete all informations of the house


#Scenario: Updatee a house informationn
#Given that you want to updatee a price to id "H2", Location "rafidia" , rooms_num "4", student_num "3" , Details "dont have a balcony" , Price"2500", Owner "omar",HouseFlag "0"
#And owner is logged in oor the admin is logged in
#When its price "2500"
#Then the information for a house was updatedd
#Scenario: Update a house information
#Given that you want to update the student_num to "4"  , Price "120"
#And admin is logged in 
#When his own ID "41"
#Then the information for a house was updated
#
#
#Scenario: Update a house information fails
#Given that you want to update the student_num to "4"  , Price "120"
#And admin is logged in
#Then the house you want to update his information does not exist



Scenario: Delete a house fails
Given that you want delete a house whose id "41",Location "amriah",rooms_num "3", student_num "2",Details "", Price "2500", Owner "omar",HouseFlag "0"
And owner is logged in
Then the house you want to delete is not exist