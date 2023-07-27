Feature: Owner Dashboard Control Panel
  Description: Owner can access and interact with the control panel to manage their housing units.

  Actor: owner

  Scenario: View department Details in Control Panel
  
    Given the owner is logged in
    When the owner accesses the control panel
    Then the owner sees their departments in the control panel
    

  Scenario: View Number of Tenants for a department
    Given the owner is logged in
    And the owner is viewing the control panel
    When the owner selects a specific department
    Then the owner sees the number of tenants in department
    

  Scenario: View department Details 
    Given the owner is logged in
    And the owner is viewing the control panel
    When the owner selects a specific department
    
    Then the owner sees the dpartments details
    

  Scenario: View Tenant Details for a Specific department
    Given the owner is logged in
    And the owner is viewing the control panel
    When the owner selects a specific department
   
    Then the owner sees the names of the tenants and their means of communication
    And the owner sees the number of bathrooms, bedrooms, and whether the apartment has a balcony
    
    
    
    
    
    
    
    
    
    
    
