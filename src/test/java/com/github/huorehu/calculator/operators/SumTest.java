package com.github.huorehu.calculator.operators;

import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import com.github.huorehu.calculator.operators.Sum;

public class SumTest {
    
    Sum testSubject = new Sum();
    
    @Test
    public void sum_bigdec_bigdec_validSum() {
	//givens
	BigDecimal a = new BigDecimal(-42);
	BigDecimal b = new BigDecimal(20);
	
	//when
	BigDecimal result = testSubject.doCalculation(a, b);
	
	//then
	Assert.assertEquals(new BigDecimal(-22), result);
	
    }
    
    @Test(expected = NullPointerException.class)
    public void sum_null_null_NullPointerException() {
	//givens
	BigDecimal a = null;
	BigDecimal b = null;
	
	//when
	BigDecimal result = testSubject.doCalculation(a, b);
	
	//then
	//throws exception 
    }
    
    @Test(expected = NullPointerException.class)
    public void sum_bigdec_null_NullPointerException() {
	//givens
	BigDecimal a = new BigDecimal(-42);
	BigDecimal b = null;
	
	//when
	BigDecimal result = testSubject.doCalculation(a, b);
	
	//then
	//throws exception 
    }
    
    @Test(expected = NullPointerException.class)
    public void sum_null_bigdec_NullPointerException() {
	//givens
	BigDecimal a = null;
	BigDecimal b = new BigDecimal(20);
	
	//when
	BigDecimal result = testSubject.doCalculation(a, b);
	
	//then
	//throws exception 
    }

}
