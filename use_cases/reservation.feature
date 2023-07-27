Feature: watching reservation via the system
Description: The system give the admin a report about all reservation on the application
Actor: Admin

Scenario: Generate a reservation report
Given that the admin is logged in system
When the admin selects the "View reservations report" option
Then the system generates and displays the customized report