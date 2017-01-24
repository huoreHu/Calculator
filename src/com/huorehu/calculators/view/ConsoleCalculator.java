package com.huorehu.calculators.view;

import java.math.BigDecimal;
import com.huorehu.calculators.SimpleCalculator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConsoleCalculator {
	
	public static void main(String[] args) throws IOException {
		
		final String PROGRAM_ON = "y";
		
		String continues = "y";
		
		while(continues.equals("y")) {
			
			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			
			try {
				invitation();
				BigDecimal argOne = new BigDecimal(buff.readLine());
				System.out.println("Введите оператор:");
				String operator = buff.readLine();
				invitation();
				BigDecimal argTwo = new BigDecimal(buff.readLine());
				
				SimpleCalculator simpleCalculator = new SimpleCalculator();
				simpleCalculator.setArgumentOne(argOne);
				simpleCalculator.setArgumentTwo(argTwo);
				simpleCalculator.setOperation(operator);
				
				System.out.println("Результат: " + simpleCalculator.executeOperation());
			} catch(ArithmeticException ae) {
				System.out.println("Ошибка: Деление на ноль!");			
			} catch(NumberFormatException nf) {
				System.out.println("Ошибка формата ввода!");
			}
			System.out.println("Желаете продолжить?");
			continues = buff.readLine();
			if (continues.equals(PROGRAM_ON)) {
				continue;
			}
		
		}
		
	}
	
	public static void invitation() {
		System.out.println("Введите аргумент:");
	}
	
}
	
	
	


