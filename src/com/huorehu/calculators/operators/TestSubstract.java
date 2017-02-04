package com.huorehu.calculators.operators;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class TestSubstract {
    
    Subtract testSubject = new Subtract();
    
    @Test
    public void subtract_object_object_object() {
	//given
	BigDecimal a = new BigDecimal(-42);
	BigDecimal b = new BigDecimal(20);
	
	//when
	BigDecimal result = testSubject.doCalculation(a, b);
	
	//then
	Assert.assertEquals(new BigDecimal(-62), result);
    }
    
}
