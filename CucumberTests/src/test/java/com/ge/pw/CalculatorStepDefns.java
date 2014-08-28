package com.ge.pw;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorStepDefns {
	private Calculator calculator;
	private Double left;
	private Double right;
	
	@Given("^a calculator")
	public void give_calculator(){
		calculator = new CalculatorImpl();
	}
	
	@When("^I add (\\d+) and (\\d+)$")
	public void add(Double left, Double right){
		this.left = left;
		this.right = right;
	}
	
	@Then("^the result is (\\d+)$")
	public void addResult(Double result){
		Assert.assertEquals(result, calculator.add(left, right));
	}
}
