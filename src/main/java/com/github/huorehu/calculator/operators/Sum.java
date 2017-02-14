package com.github.huorehu.calculator.operators;

import java.math.BigDecimal;

public class Sum implements SimpleOperation {
	
	@Override
	public BigDecimal doCalculation(BigDecimal argOne, BigDecimal argTwo) {
		return argOne.add(argTwo);
	}

}
