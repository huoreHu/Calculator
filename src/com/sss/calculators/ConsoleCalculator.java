package com.sss.calculators;

public class ConsoleCalculator {
	
	private static double result;
	
	private static double userInputOne;
	
	private static double userInputTwo;
	
	private static boolean errorOperator;

	private static double sum(double a, double b) {
		return a + b;
	}
	
	private static double subtract(double a, double b) {
		return a - b;
	}
	
	private static double multiplication(double a, double b) {
		return a * b;
	}
	
	private static double fission(double a, double b) {
		return a / b;
	}
	
	private static double calculate(double userInputOne, String operator, double userInputTwo) {
		switch(operator) {
			case "+":
				result = ConsoleCalculator.sum(userInputOne, userInputTwo);
				break;
			case "-":
				result = ConsoleCalculator.subtract(userInputOne, userInputTwo);
				break;
			case "*":
				result = ConsoleCalculator.multiplication(userInputOne, userInputTwo);
				break;
			case "/":
				result = ConsoleCalculator.fission(userInputOne, userInputTwo);
				break;
			default:
				System.out.println("Вы ввели неверный оператор!");
				errorOperator = true;
		}
		return result;
	}
	
	public static void printResult(double userInputOne, String operator, double userInputTwo) {
		errorOperator = false;
		calculate(userInputOne, operator, userInputTwo);
		if(errorOperator == false) {
			System.out.printf("Ваш результат: %.4f", result);
			System.out.println();
		}
	}
	
}
	
	
	


