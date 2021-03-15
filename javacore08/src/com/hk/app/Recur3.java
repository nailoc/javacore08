package com.hk.app;

public class Recur3 {

	public static void main(String[] args) {
		
		// 3^4 = 3*3*3*3 (계산수, 카운트) = pow(num, N)
		// pow(3,4) = 3 * pow(3,3)
		int mx = pow(3, 4);
		System.out.println("mx="+mx);
		System.out.println("Math.pow()="+Math.pow(3.0,4.0));

	}
	
	public static int pow(int num, int N) {
		int res = 1;
		if(N==0) { // N==1인경우도 num를 곱하기 함
			res = 1;
		}else {
			res = num * pow(num, N-1);
		}
		return res;
	}

}
