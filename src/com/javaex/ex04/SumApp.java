package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		int x =0;
		
	
		for (int i=0; i<numLine.length(); i++) {
			
			Integer[] numArray = new Integer[numLine.length()];
			numArray[i] = Integer.parseInt(numLine);
			sum = sum + x ;
			
		}
		
		
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
