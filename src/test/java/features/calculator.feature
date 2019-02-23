#----------------------------------
# Sample feature file for calculator
#----------------------------------
Feature: Calculator
As a user I want to use this application to add, 
subtract, multiply and divide numbers
# Simple scenario for adding numbers
Scenario:
Given user is on calucaltor application
When user adds 2 numbers
Then system displays sum of two numbers

Scenario:
Given user is on calucaltor application
When user subtracts number2 from number1
Then system displays difference of two numbers

    

   
