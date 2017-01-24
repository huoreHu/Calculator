package com.huorehu.calculators;

import com.huorehu.calculators.operators.Divide;
import com.huorehu.calculators.operators.Multiply;
import com.huorehu.calculators.operators.SimpleOperation;
import com.huorehu.calculators.operators.Subtract;
import com.huorehu.calculators.operators.Sum;

public class ChosenOperator {
	
//	String operator;
//	
//	public ChosenOperator(String operator) {
//		this.operator = operator;
//	}
	
	public static SimpleOperation choice(String operator) {
		if (operator.equals("+")) {
			return new Sum();
		} else if (operator.equals("-")) {
			return new Subtract();
		} else if (operator.equals("*")) {
			return new Multiply();
		} else if (operator.equals("/")) {
			return new Divide();
		}
		return null;
	}
	
	

}
