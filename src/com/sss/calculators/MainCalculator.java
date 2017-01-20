package com.sss.calculators;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MainCalculator {

	public static void main(String[] args) throws IOException {
		
		String question = "y";
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
				
		while(question.equals("y") || question.equals("у"/*кириллица*/)) {
			
			try{
			
				System.out.println("Введите первый аргумент:");
				double userInputOne = Double.parseDouble(buff.readLine());
				System.out.println("Введите действие (+ - * /:)");
				String operator = buff.readLine();
				System.out.println("Введите второй аргумент:");
				double userInputTwo = Double.parseDouble(buff.readLine());
			
				ConsoleCalculator.printResult(userInputOne, operator, userInputTwo);
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.print("Хотите продолжить считать?(y/n): ");
				question = buff.readLine();
			} catch(Exception e) {
				System.out.println("Вы ввели нечисловое значение!");
				System.out.println("Попробуйте сначала");
			}
		}
	}

}
