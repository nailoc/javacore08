package com.hk.app;

public class TestOverloadEx2 {

	public static void main(String[] args) {
		
		OverloadEx2 draw = new OverloadEx2(); // 2번: 선언
		// ==================== -> =문자를 20번 출력 => line()
		draw.line();
		
		// ******************** -> *문자를 20번 출력 => line('*')
		// -------------------- -> -문자를 20번 출력 => line('-')
		draw.line('*');
		draw.line('-');
		
		// ++++++++++++++++++++++++++++++++++++++++
		// +문자를 40번 출력 ==> line('+', 40)
		draw.line('+',40);

	}

}
