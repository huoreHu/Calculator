package com.huorehu.calculators.operators;

import java.math.BigDecimal;
import org.junit.Test;
import junit.framework.Assert;

public class TestSum {
    
    Sum testSubject = new Sum();
    
    @Test
    public void sum_object_object_validSum() {
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
    public void sum_object_null_NullPointerException() {
	//givens
	BigDecimal a = new BigDecimal(-42);
	BigDecimal b = null;
	
	//when
	BigDecimal result = testSubject.doCalculation(a, b);
	
	//then
	//throws exception 
    }
    
    @Test(expected = NullPointerException.class)
    public void sum_null_object_NullPointerException() {
	//givens
	BigDecimal a = null;
	BigDecimal b = new BigDecimal(20);
	
	//when
	BigDecimal result = testSubject.doCalculation(a, b);
	
	//then
	//throws exception 
    }

}
