package com.github.huorehu.calculator.operators;

import java.math.BigDecimal;

public interface Calculator {
	
	BigDecimal executeOperation(BigDecimal argOne, BigDecimal argTwo, String operator);
	
}
