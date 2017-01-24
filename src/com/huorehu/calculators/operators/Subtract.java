package com.huorehu.calculators.operators;

import java.math.BigDecimal;

public class Subtract implements SimpleOperation {
	
	@Override
	public BigDecimal doCalculation(BigDecimal argOne, BigDecimal argTwo) {
		return argOne.subtract(argTwo);
	}

}
