@tag
Feature: Cpanel
Description: display Cpanel
Actor: Tenant

Scenario: Tenant can view info cpanel 
Given that the Tenant is  logged in 
Given that the Tenant is Booked a house with Houseflag="1"

Then display
