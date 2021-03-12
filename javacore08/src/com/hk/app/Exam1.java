package com.hk.app;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하시오:");
		double first = reader.nextDouble();
		
		System.out.print("두번째 숫자를 입력하시오:");
		double second = reader.nextDouble();
		
		System.out.print("연산자를 입력하시오(+.-,*,/): ");
		char operator = reader.next().charAt(0);  //0번째 문자열을 문자로 변환
		
		double result = calculate(first, second, operator);
		System.out.println("두수를 " + operator +"하면:"+result);

	}
	
	// 덧셈이 되는 함수를 작성하고 위의 코드를 함수가 있는 코드로 바꾸시오
	// 함수명 calculate() : 숫자 , 연산자 -> 결과
	public static double calculate(double no1, double no2, char op) {
		double cal = 0;
		
		switch(op) { // 시작
			case '+': 
				cal = no1 + no2; break;
			default: 
				break;
		} // 끝
		
		return cal;
	}

}
