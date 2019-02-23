#----------------------------------
# Empty Cucumber .feature file
#----------------------------------
Feature: BankAccount Money Transfer
As a customer, I want to transfer money online from one account 
to another account so that I do nnot have to wait for bank to be open 




   Scenario: Transfer from savings to checking
      Given Tom is a Bank Customer
      And Tom has a Savings account with balance of 5000.00
      And has a Checking account with balance of 2500.00
      And Tom is logged in using his online credentials
      When Tom transfers 1000.00 from Saving Account to Checking Account
      And Transction is successfull
      Then Savings Account balance is 4000.00 
      And Checking Account balance is 3500.00

 Scenario: Transfer from checking to saving
      Given Tom is a Bank Customer
      And Tom has a Savings account with balance of 5000.00
      And has a Checking account with balance of 2500.00
      And Tom is logged in using his online credentials
      When Tom transfers 1000.00 from Checking Account to Saving Account
      And Transction is successfull
      Then Checking Account balance is 1500.00 
      And Saving Account balance is 6000.00
  
