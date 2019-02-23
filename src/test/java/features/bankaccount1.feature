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

Scenario:
When Tom transfers 1000.00 from Savings Account to Checking Account
And Transaction is successful
Then correct balances should be reflected in both accounts

Scenario:
When Tom transfers 1000.00 from Savings Account to Checking Account
And Transaction is unsuccessful
Then correct balances should be reflected in both accounts

Scenario Outline:Transfer valid amount
When Tom transfers <amount> from Saving Account to Checking Account
When Transaction is <status>
Then Tom should have <SavingBalance> and <CheckingBalance>
Examples:
| amount | status | SavingBalance | CheckingBalance |
| 1000 | successful | 4000| 3500|
| 1500| successful | 3500| 4000|
| 10000| unsuccessful | 5000| 2500|

    

   
