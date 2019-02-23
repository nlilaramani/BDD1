#----------------------------------
# Empty Cucumber .feature file
#----------------------------------
Feature: Security
As a Registered User, I shouild have secure access to application
so that all my transactions are secure


Scenario: User Login
Example for User Login
Given user is on homepage
When user logs in
Then System should display user account
    
Scenario: Invalid Login
Example of invalid user login
Given user is on homepage
When user logs in with invalid credentials
Then system should display an error page


   
