package com.github.huorehu.calculator;

import java.math.BigDecimal;
import com.github.huorehu.calculator.operators.BankOperators;
import com.github.huorehu.calculator.operators.Calculator;

public class MyCalculator implements Calculator {
	
	private final BankOperators bankOperators;
	
	public MyCalculator(BankOperators bankOperators) {
		this.bankOperators = bankOperators;
	}
	
	@Override
	public BigDecimal executeOperation(BigDecimal argOne, BigDecimal argTwo, String operator) throws ArithmeticException, NullPointerException {
		return bankOperators.choiceOparation(operator).doCalculation(argOne, argTwo);
	}
	
}


