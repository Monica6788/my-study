package com.kh;
import java.util.Scanner;

public class A_If {
	/*
	 * 기본적으로 프로그램은 순차적으로 실행한다 (상 -> 하, 좌 -> 우)
	 * 순차적인 흐름을 바꿀 때 "제어문"을 사용하여 처리 가능
	 * 
	 * 조건문 if
	 * 1) 단독 if문
	 * if (조건식) {
	 * 		조건식의 결과가 true일 때 실행할 내용
	 * }
	 * 
	 * 2) if-else문
	 * if (조건식) {
	 * 	조건식이 true일 때 실행할 내용
	 * }
	 * else {
	 * 	조건식이 false일 때 실행할 내용
	 * }
	 * 
	 * 3) if-else if-else문
	 * if (조건식1) {
	 * 	조건식1이 true일 때 실행
	 * }
	 * else if (조건식2) {
	 *  조건식1은 f, 조건식2는 t일 때 실행
	 * }
	 * else {
	 * 	조건식1, 2가 모두 f일 때 실행
	 * }
	 */

	public static void main(String[] args) {
		//method1();
		method2();

	}
	
	public static void method1() {
		// 입력받은 값이 1과 10 사이의 값이면 해당 값을 출력
		// 그렇지 않으면 "범위를 벗어났습니다." 출력
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if (i > 1 && i < 10) {
			System.out.println(i);
		}
		else {
			System.out.println("범위를 벗어났습니다.");
		}
		sc.close();
	}
	
	public static void method2() {
		/*
		 * 주민번호를 입력 받아 성별을 출력 ("Female", "Male")
		 * 단, -를 포함하여 입력받은 길이가 14자리가 아닌 경우
		 * "잘못 입력되었습니다." 출력
		 * 문자열 길이 : 문자열.length()
		 * 특정 위치의 한 문자만 추출 : 문자열.charAt(p)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(-포함): ");
		String num = sc.next();
		
		// if문 중첩
		if (num.length() == 14) {
			char sex = num.charAt(7);
			// char를 겉 if문 밖에 쓰면 num의 길이가 8보다 작게 입력되었을 때 오류 발생!!!
			
			if (sex == '2' || sex == '4') {
				System.out.print("Female");
			}
			else if (sex == '1' || sex == '3') {
				System.out.print("Male");
			}
			else {
				System.out.print("잘못 입력되었습니다.");
			}
		}
		else {
			System.out.print("잘못 입력되었습니다.");
		}
		
		// switch문 안에 if문
		// 근데 솔직히 내가 봐도 if문 중첩이 더 깔끔함ㅋ
		// case '2' : case '4' : 형태도 가능하긴 함!
		switch(num.length()) {
			case 14 : 
				char sex = num.charAt(7);
				if (sex == '2' || sex == '4') {
					System.out.print("Female");
				}
				else if (sex == '1' || sex == '3') {
					System.out.print("Male");
				}
				else {
					System.out.print("잘못 입력되었습니다.");
				}
				break;
			default : System.out.print("잘못 입력되었습니다.");
				break;
		}
		
		// 주의할 점 : sex는 int가 아닌 char이므로 '' 없이 숫자만 쓰면 원하는 결과가 안 나온다~ㅋㅋ
		
		sc.close();
		
	}

}
