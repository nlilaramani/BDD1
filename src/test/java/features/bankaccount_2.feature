#----------------------------------
# Empty Cucumber .feature file
#----------------------------------
Feature: BankAccount Money Transfer
As a customer, I want to transfer money online from one account 
to another account so that I do nnot have to wait for bank to be open 

Background: 
Given Tom is a Bank Customer
And Tom has a Savings account with balance of 5000.00
And has a Checking account with balance of 2500.00



   Scenario Outline: Money transfer Saving to Checking
      When Tom transfers <amount> from <account1> to <account2>
      Then <account1> has balance of <balance1>
      And <account2> has balance of <balance2> 
      |amount|account1|account2 balance1|balance2|
      |1000.00 |Savings |Checking |4000.00 |3500.00|

      
   