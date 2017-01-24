package com.huorehu.calculators;

import java.math.BigDecimal;
import com.huorehu.calculators.operators.SimpleOperation;

public class SimpleCalculator {
	
	SimpleOperation simpleOperation;
	
	BigDecimal argOne; 
	
	BigDecimal argTwo;
	
	public void setArgumentOne(BigDecimal argOne) {
		this.argOne = argOne;
	}
	
	public void setArgumentTwo(BigDecimal argTwo) {
		this.argTwo = argTwo;
	}
	
	public void setOperation(String operator) {
		this.simpleOperation = ChosenOperator.choice(operator);
	}
	
	public BigDecimal executeOperation() throws NumberFormatException {
		if (simpleOperation == null) {
			throw new NumberFormatException();
		}
		return simpleOperation.doCalculation(argOne, argTwo);
	}

}
