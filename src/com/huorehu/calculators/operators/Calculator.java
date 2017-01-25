package com.huorehu.calculators.operators;

import java.math.BigDecimal;

public interface Calculator {
	
	BigDecimal executeOperation(BigDecimal argOne, BigDecimal argTwo, String operator);
	
}
