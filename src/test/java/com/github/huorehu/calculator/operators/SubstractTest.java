package com.github.huorehu.calculator.operators;


import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

import com.github.huorehu.calculator.operators.Subtract;

public class SubstractTest {
    
    Subtract testSubject = new Subtract();
    
    @Test
    public void subtract_bigdec_bigdec_object() {
	//given
	BigDecimal a = new BigDecimal(-42);
	BigDecimal b = new BigDecimal(20);
	
	//when
	BigDecimal result = testSubject.doCalculation(a, b);
	
	//then
	Assert.assertEquals(new BigDecimal(-62), result);
    }
    
}
