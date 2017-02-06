package com.huorehu.calculators.operators;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class TestDivide {
    
    Divide testSubject = new Divide();
    
    @Test
    public void divide_bigdec_bigdec_object () {
	//given
	BigDecimal a = new BigDecimal(40);
	BigDecimal b = new BigDecimal(20);
		
	//when
	BigDecimal result = testSubject.doCalculation(a, b);
		
	//then
	Assert.assertEquals(new BigDecimal(2), result);
    }

    @Test(expected = ArithmeticException.class)
    public void subtract_bigdec_bigdec0_arithmeticException() {
	//given
	BigDecimal a = new BigDecimal(-40);
	BigDecimal b = new BigDecimal(0);
		
	//when
	BigDecimal result = testSubject.doCalculation(a, b);
		
	//then
	//throws exception
    }
}
