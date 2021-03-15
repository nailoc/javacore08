package com.hk.app;

public class Recur2 {

	public static void main(String[] args) {
		
		// 1+2+..10 = 반복문으로 구할 수 있음
		
		// 재귀함수를 사용하여 합을 구하시오
		// sum(10) = 10 + 9 ..  + 4 + 3 + 2 + 1
		// sum(10) = 10 + sum(9)

		int result = 0;
		result = Sum(10);
		System.out.println("재귀함수를 이용한 sum은:"+result);
	}
	
	// 재귀함수
	public static int Sum(int N) {
		int sum = 0;
		if(N==1)
			sum = 1;
		else {
			sum = N + Sum(N-1);
		}
		return sum;
	}

}
