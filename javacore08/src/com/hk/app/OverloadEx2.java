package com.hk.app;

public class OverloadEx2 {  // 1번: 정의
	
	public void line() {
		for(int i=0; i<20; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	
	public void line(char ch) {
		for(int i=0; i<20; i++) {
			System.out.print(ch);
		}
		System.out.println();
		
	}
	
	public void line(char ch, int n) {
		for(int i=0; i<n; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}

}
