/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StepDefs;

import com.itexps.bdd1.Calculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;    
import org.junit.Assert;

/**
 *
 * @author Owner
 */
public class CalculatorStepDefs {
    Calculator c;
    double result;
    @Given("^user is on calucaltor application$")
    public void init(){
        c=new Calculator();
    }
    @When("^user adds 2 numbers$")
    public void testAddNumbers(){
        result=c.add(15.0, 25.0);
    }
    @Then("^system displays sum of two numbers$")
    public void testAddExpectation(){
        Assert.assertEquals(40.0,result,0.0);
    }
    @When("^user subtracts number2 from number1$")
    public void testSubtractNumbers(){
        result=c.subtract(300.00, 100.25);
    }
    @Then("^system displays difference of two numbers$")
    public void testSubtractExpectation(){
        Assert.assertEquals(199.75, result,0.0);
    }
}
