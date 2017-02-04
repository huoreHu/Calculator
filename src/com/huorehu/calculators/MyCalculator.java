package com.huorehu.calculators;

import java.math.BigDecimal;

import com.huorehu.calculators.operators.BankOperators;
import com.huorehu.calculators.operators.Calculator;

public class MyCalculator implements Calculator {
	
	private final BankOperators bankOperators;
	
	public MyCalculator(BankOperators bankOperators) {
		this.bankOperators = bankOperators;
	}
	
	@Override
	public BigDecimal executeOperation(BigDecimal argOne, BigDecimal argTwo, String operator) throws ArithmeticException, NumberFormatException {
		return bankOperators.choiceOparation(operator).doCalculation(argOne, argTwo);
	}
	
}


