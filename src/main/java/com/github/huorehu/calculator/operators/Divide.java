package com.github.huorehu.calculator.operators;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Divide implements SimpleOperation {

	@Override
	public BigDecimal doCalculation(BigDecimal argOne, BigDecimal argTwo) {
		return argOne.divide(argTwo, 3, RoundingMode.HALF_DOWN);
	}
	
}
