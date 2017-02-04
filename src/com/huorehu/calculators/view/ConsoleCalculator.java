 package com.huorehu.calculators.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

import com.huorehu.calculators.MyCalculator;
import com.huorehu.calculators.operators.BankSimpleOperators;
import com.huorehu.calculators.operators.Calculator;

public class ConsoleCalculator {
	
	private BigDecimal result;
	
	BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
	
	public void run() throws IOException {
		
		try {
			invitation();
			BigDecimal argOne = new BigDecimal(buff.readLine());
			System.out.println("Введите оператор(+ - * /):");
			String operator = buff.readLine();
			invitation();
			BigDecimal argTwo = new BigDecimal(buff.readLine());
			
			Calculator myCalc = new MyCalculator(new BankSimpleOperators());
		
			result = myCalc.executeOperation(argOne, argTwo, operator);
			System.out.println("Результат: " + result);
			
		} catch(ArithmeticException ae) {
			System.out.println("Попытка деления на ноль!");
		} catch(NumberFormatException nfe) {
			System.out.println("Неверный формат ввода!");
		} catch(NullPointerException nPe) {
			System.out.println("Скорее всего был введен несуществующий оператор!");
		}

		
	}

	private boolean continueRunAnswer() throws IOException {
		System.out.println("Желаете продолжить?(y/n)");
		if (!buff.readLine().equals("y")) {
			return false;
		}
		return true;
	}
	
	private void invitation() {
		System.out.println("Введите аргумент:");
	}
	
	public static void main(String[] args) throws IOException {
		
		ConsoleCalculator consolecalc = new ConsoleCalculator();
		
		do {
			consolecalc.run();
		} while(consolecalc.continueRunAnswer());
		
	}
		
}
	


	
	
	


