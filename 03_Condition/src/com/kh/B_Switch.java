package com.kh;

import java.util.Scanner;

// Ctrl + Shift + F : 자동정렬
// 자동정렬 하면 여러 줄 주석은 오히려 보기 불편해질 수 있음...
// 혼자 공부할 때나 코드업 제출 전에 하면 좋을 듯?ㅎㅎ

public class B_Switch {
	/*
	 * 조건문 switch : 동등 비교를 통해 흐름을 제어
	 * 
	 * switch (비교대상) {
	 * 		case 값1 : 
	 * 					// 비교대상 == 값1일 때 실행할 내용
	 * 					break;
	 * 		case 값2 : 
	 * 					// 비교대상 == 값2일 때 실행할 내용
	 * 					break;
	 * 		default :
	 * 					// 모든 case에 해당사항 없을 때 실행할 내용
	 * 					break;
	 * 	}
	 */

	public static void main(String[] args) {
		//method1();
		method2();

	}

	public static void method1() {
		/* 정수를 입력받아 아래 조건에 맞게 출력
		 * 1 입력 : 빨간색
		 * 2 입력 : 노란색
		 * 3 입력 : 초록색
		 * 그 외 : 검은색
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("버튼을 입력하세요 : ");
		int button = sc.nextInt();
		String color;
		
		switch (button) {
			case 1 : color = "빨간색";
					break;
			case 2 : color = "노란색";
					break;
			case 3 : color = "초록색";
					break;
			default : color = "검은색";
					break;
		}
		System.out.print(color);

		sc.close();
	}
	
	public static void method2() {
		// 02_Operator 프로젝트 D_Ternary 클래스 method2() 내용을 switch문으로
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개를 입력하고 산술연산자 하나를 입력하세요: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char op = sc.next().charAt(0);
		
		switch(op) {
			case '+' : System.out.printf("%d %c %d = %d", a, op, b, a + b);
					break;
			case '-' : System.out.printf("%d %c %d = %d", a, op, b, a - b);
					break;
			case '*' : System.out.printf("%d %c %d = %d", a, op, b, a * b);
					break;
			case '/' : System.out.printf("%d %c %d = %d", a, op, b, a / b);
					break;
			case '%' : System.out.printf("%d %c %d = %d", a, op, b, a % b);
					break;
			default : System.out.println("잘못 입력되었습니다.");
					break;
					
		}
		
		
		sc.close();
	}
	// 지난 중첩 삼중연산자에서는 다른 연산자까지 하기엔 코드가 넘 드러워져서 못했지만 switch문에선 가능~

}
