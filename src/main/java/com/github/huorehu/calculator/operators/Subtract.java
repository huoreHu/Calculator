package com.github.huorehu.calculator.operators;

import java.math.BigDecimal;

public class Subtract implements SimpleOperation {
	
	@Override
	public BigDecimal doCalculation(BigDecimal argOne, BigDecimal argTwo) {
		return argOne.subtract(argTwo);
	}

}
