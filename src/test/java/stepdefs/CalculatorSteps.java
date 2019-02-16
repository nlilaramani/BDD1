/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepdefs;

import com.itexps.rest.bdd1.Calculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

/**
 *
 * @author 212616565
 */
public class CalculatorSteps {
     Calculator calc;
     double result;
     @Given("^User is in the application$")
     public void setUp(){
         calc=new Calculator();
     }
     @When("^user adds two numbers$")
     public void testAdd(){
         result=calc.add(200.45,30.55);
         
    }
      @Then ("^user should get sum of two numbers a a result$")
      public void checkAddResult(){
         Assert.assertEquals(231.0, result, 0.0); 
      }
    
}
