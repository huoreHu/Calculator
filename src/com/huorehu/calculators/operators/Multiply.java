package com.huorehu.calculators.operators;

import java.math.BigDecimal;
import java.math.MathContext;

public class Multiply implements SimpleOperation {
	
	@Override
	public BigDecimal doCalculation(BigDecimal argOne, BigDecimal argTwo) {
		return argOne.multiply(argTwo, MathContext.DECIMAL32);
	}

}
