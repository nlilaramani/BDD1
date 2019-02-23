/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StepDefs;

import com.itexps.bdd1.BankAccount;
import com.itexps.bdd1.BankCustomer;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Owner
 */
public class BankAccountStepDefs {
    private BankAccount savings;
    private BankAccount checking;
    BankCustomer bc;
    @Given("^Tom is a Bank Customer$")
    public void createCustoer(){
        bc=new BankCustomer("Tom", "Smith",123);
    }
    @Given("^Tom has a Savings account with balance of 5000.00$")
    public void createSavingAccount(){
        savings=new BankAccount(123,bc,"Savings",5000.00);
    }
    @Given("^has a Checking account with balance of 2500.00$")
    public void createCheckingAccount(){
        checking=new BankAccount(123,bc,"Checking",2500.00);
    }
    @When("^Tom transfers <amount> from <account1> to <account2>$")
    public void testTransferAmount(double amount,String acc1,String acc2){
        if(acc1.equalsIgnoreCase("Savings")){
            savings.transferMoney(amount, checking);
        }else{
            checking.transferMoney(amount, checking);
        }
    }
    @Then("^<account1> has balance of <balance1>$")
    public void testAssertion(String account,double amount){
         if(account.equalsIgnoreCase("Savings")){
            assertEquals(savings.getBalance(),amount,0.0);
        }else{
            assertEquals(checking.getBalance(),amount,0.0);
        }
    }
    @Then("^<account2> has balance of <balance2>$")
    public void testAssertion2(String account,double amount){
         testAssertion(account, amount);
    }
  
    boolean status;
    @When("^Tom transfers (\\d+) from Saving Account to Checking Account$")
    public void testTransfer(double amount){
        status=savings.transferMoney(amount, checking);
    }
        
   @When("^Transaction is successful$")
    public void testStastus(){
        assertEquals(status, true);
    }
   @When("^Transaction is unsuccessful$")
           public void testFailStastus(){
                assertEquals(status, false);
           }

    @Then("^Tom should have (\\d+) and (\\d+)$")
    public void testBalances(double sBalance,double cBalance){
        assertEquals(savings.getBalance(), sBalance,0.0);
        assertEquals(checking.getBalance(),cBalance,0.0);
    }
}
