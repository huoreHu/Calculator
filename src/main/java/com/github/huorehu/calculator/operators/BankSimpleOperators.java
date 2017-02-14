package com.github.huorehu.calculator.operators;

public class BankSimpleOperators extends BankOperators {
	
	public BankSimpleOperators() {
		listOperation.put("+", new Sum());
		listOperation.put("-", new Subtract());
		listOperation.put("*", new Multiply());
		listOperation.put("/", new Divide());
		
	}
	
}
