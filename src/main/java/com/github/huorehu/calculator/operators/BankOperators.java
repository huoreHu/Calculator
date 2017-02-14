package com.github.huorehu.calculator.operators;

import java.util.HashMap;
import java.util.Map;

abstract public class BankOperators {
	
	protected Map<String, SimpleOperation> listOperation;
	
	public BankOperators() {
		this.listOperation = new HashMap<>();
	}
	
	public SimpleOperation choiceOparation(String operator) {
		return listOperation.get(operator);
	}

}
