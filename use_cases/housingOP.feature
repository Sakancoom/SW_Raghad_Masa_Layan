Feature: Recording a full information of house
Actor: owner

Background: 
   Given a list of house's info .
    |amriah|3|2|have a balcony|3000|ahmad|  
     |rafidia|3|4|dont have a balcony|2500|omar|  

    
    
Scenario: A house was added succefully
Given that the owner is logged in or the admin is logged in
And there is a house with Location "amriah" , rooms_num "3" ,Details "have a balcony" ,price "3000" NIS,owner_name "ahmad"
Then a a house with Location "amriah" , rooms_num "3" ,Details "have a balcony" ,price "3000" NIS,owner_name "ahmad"  was added



Scenario: delete a house
Given that you want to delete   a house whoseLocation "amriah" , rooms_num "3" ,Details "have a balcony" ,price "3000" NIS,owner_name "ahmad"
And owner is logged in or the admin is logged in
Then you delete all his information of a product

Scenario: Update a house information
Given that you want to update a price to "amriah" , rooms_num "3" ,Details "have a balcony" ,price "3500" NIS,owner_name "ahmad"
And owner is logged in or the admin is logged in
When its price "3000"
Then the information for a house was updated

