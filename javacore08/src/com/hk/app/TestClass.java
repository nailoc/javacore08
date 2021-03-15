package com.hk.app;

public class TestClass {

	public static void main(String[] args) {
		
		// 기본변수 - 전역변수
		int score = 90;
		
		String[] name = new String[10]; 
		name[0] = "홍길동";
		
		// 1번 - 기본변수를 함수의 입력값으로 대입을 하면 기본변수의 값을 복사만 해줌
		printGrade(score);
		System.out.println("점수의 상태는: "+score);
		// 클래스로 만든 참조변수 = 사용자정의변수와 같은 개념
		DfnClass kim = new DfnClass(); // 클래스의 멤버변수를 접근하려면 반드시 참조변수선언되어야함
		kim.score = 80;
		kim.name = "김건우";		
		kim.print2Grade();
		
		// 2번 - 참조변수를 함수의 입력값으로 대입을 하면 참조변수의 실제값이 전달됨
		changeShow(kim);
		System.out.println("김건우의 점수는:" + kim.score);
		
		System.out.println(DfnClass.total); //참조변수 만들지 않아도 사용가능
		
		int result = kim.min(10,5);
		System.out.println(result);

	}
	
	// 일반적인 함수
	public static void printGrade(int score) {
		// 학점출력하시오
		int sum= 0;       // 지역변수
		score=score+10;   // 10증가
		if(score>=70 ) {
			System.out.println("당신은 PASS입니다");
		}else {
			System.out.println("당신은 FAIL입니다");
		}
		
		int x=10; int y=5;
		int result = max(10,5);
		
	}
	
	public static void changeShow(DfnClass man) {
		man.score += 10;
		System.out.println("어떤 사람의 변경된 점수를 출력:"+man.score);
	}
	
	public static int max(int a, int b) {
		int max = 0;
		if(a>b) {
			max=a;
			return max;
		}else {
			max=b;
			return max;
		}
	}

}
