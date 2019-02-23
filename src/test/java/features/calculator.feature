#----------------------------------
# Empty Cucumber .feature file
#----------------------------------
# Test comment
Feature: Calculator
   As a User, 
   I want to perform arithmetic operations 
   In order to get quick results that I can use in other applications

   Scenario: Add numbers
      Add numbers
      Given User is in the application
      When user adds two numbers
      Then user should get sum of two numbers a a result
