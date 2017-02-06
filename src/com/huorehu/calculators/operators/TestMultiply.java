package com.huorehu.calculators.operators;

import java.math.BigDecimal;

import org.junit.Test;

import junit.framework.Assert;

public class TestMultiply {
    
    Multiply testSubject = new Multiply();
    
    @Test
    public void multiply_bigdec_bigdec_object() {
	//given
	BigDecimal a = new BigDecimal(-42);
	BigDecimal b = new BigDecimal(20);
	
	//when
	BigDecimal result = testSubject.doCalculation(a, b);
	
	//then
	Assert.assertEquals(new BigDecimal(-840), result);
	
    }
    
    
    

}
