package com.sss.calculators;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MainCalculator {

	public static void main(String[] args) throws IOException {
		
		String question = "y";
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
				
		while(question.equals("y") || question.equals("�"/*���������*/)) {
			
			try{
			
				System.out.println("������� ������ ��������:");
				double userInputOne = Double.parseDouble(buff.readLine());
				System.out.println("������� �������� (+ - * /:)");
				String operator = buff.readLine();
				System.out.println("������� ������ ��������:");
				double userInputTwo = Double.parseDouble(buff.readLine());
			
				ConsoleCalculator.printResult(userInputOne, operator, userInputTwo);
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.print("������ ���������� �������?(y/n): ");
				question = buff.readLine();
			} catch(Exception e) {
				System.out.println("�� ����� ���������� ��������!");
				System.out.println("���������� �������");
			}
		}
	}

}
