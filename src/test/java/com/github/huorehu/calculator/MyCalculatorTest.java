package com.github.huorehu.calculator;


import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import com.github.huorehu.calculator.MyCalculator;
import com.github.huorehu.calculator.operators.BankOperators;
import com.github.huorehu.calculator.operators.BankSimpleOperators;


public class MyCalculatorTest {
    
    private BankOperators bankOperators = new BankSimpleOperators();
    MyCalculator testSubject = new MyCalculator(bankOperators);
    
    @Test
    public void executeoperations_bigdec_bigdec_string_bigdec() {
	//givens
	BigDecimal a = new BigDecimal(-42);
	BigDecimal b = new BigDecimal(20);
	String operator = "+";
		
	//when
	BigDecimal result = bankOperators.choiceOparation(operator).doCalculation(a, b);
		
	//then
	Assert.assertEquals(new BigDecimal(-22), result);
    }
    
    @Test(expected = ArithmeticException.class)
    public void executeoperations_bigdec_bigdec0_stringdiv_bigdec() {
	//givens
	BigDecimal a = new BigDecimal(-42);
	BigDecimal b = new BigDecimal(0);
	String operator = "/";
			
	//when
	BigDecimal result = bankOperators.choiceOparation(operator).doCalculation(a, b);
			
	//then
	//throws exception
    }
    
    @Test(expected = NullPointerException.class)
    public void executeoperations_stringz_nullpointerexception() {
	//givens
	BigDecimal a = new BigDecimal(-42);
	BigDecimal b = new BigDecimal(0);
	String operator = "z";
		
	//when
	BigDecimal result = bankOperators.choiceOparation(operator).doCalculation(a, b);
		
	//then
	//throws exception
    }
    
    @Test(expected = NullPointerException.class)
    public void executeoperations_null_bigdec_stringoperator_nullpointerexception() {
	//givens
	BigDecimal a = null;
	BigDecimal b = new BigDecimal(0);
	String operator = "+";
		
	//when
	BigDecimal result = bankOperators.choiceOparation(operator).doCalculation(a, b);
		
	//then
	//throws exception
    }
    
}
