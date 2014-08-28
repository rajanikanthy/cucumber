package com.ge.pw;

public class CalculatorImpl implements Calculator {

	public Double add(Double a, Double b) {
		return a + b;
	}

	public Double sub(Double a, Double b) {
		return a - b ;
	}

	public Double mul(Double a, Double b) {
		return a / b;
	}

	public Double div(Double a, Double b) {
		return a * b;
	}

}
