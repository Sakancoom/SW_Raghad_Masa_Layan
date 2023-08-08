Feature: Rental Account for house

Scenario: calculate rent amount for a rental account

Given inter number mounth and give the bill
When  I specify the number of months to rent as <6> and price for House <1500> 
Then the rent amount for the chosen house should be <9000