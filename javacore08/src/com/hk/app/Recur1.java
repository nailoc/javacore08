package com.hk.app;

public class Recur1 {

	public static void main(String[] args) {
		
		// 팩토리얼문제
		// 5! = 5*4*3*2*1;
		
		// 1번째 - 반복문으로 풀수 있다
		int N= 5;
		int mx=1;
		for(int i=1; i<=N; i++) {
			mx = mx * i;
			System.out.println(i+"번째까지 곱은:"+mx);
			// 1*1
			// 1*1*2
			// 1*2*3
			// 
			// 1*2*3*4*5
		}
		
		// 2번째 - 재귀함수
		// 5*4*3*2*1 = fact(5)
		// 5* (4*3*2*1) = 5 * fact(4)		
		// fact(5) = 5 * fact(4)
		int mx2 = 1;
		mx2 = fact(N);
		System.out.println("mx2:"+mx2);
	}
	
	public static int fact(int N) {
		int result=1;
		
		if(N==1) {
			result = 1;
		}else {
			result = N*fact(N-1);
		}
		
		return result;
	}

}
