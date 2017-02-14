package com.github.huorehu.calculator.operators;


import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

public class MultiplyTest {
    
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
