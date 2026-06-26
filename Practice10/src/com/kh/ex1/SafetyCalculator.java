package com.kh.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafetyCalculator {
	
	
	public static void main(String[] args) {
		method1();
		System.out.println("프로그램이 안전하게 종료되었습니다.");
	}
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 안전한 나눗셈 계산기 ===");
		
		try {
			System.out.print("첫 번째 정수를 입력하세요: ");
			int n1 = sc.nextInt();
			System.out.print("두 번째 정수를 입력하세요: ");
			int n2 = sc.nextInt();
			int answer = n1 / n2;
			System.out.println("나눗셈 결과: " + answer);
//			System.out.println("나눗셈 결과: " + n1 / n2);
//			System.out.println("나눗셈 결과: " + (n1 / n2));
//			위의 두 줄처럼 해도 됨.
		}catch(InputMismatchException e) {
				System.out.println("[예외 발생] 숫자만 입력할 수 있습니다.");
		} catch(ArithmeticException e) {
			System.out.println("[예외 발생] 0으로 나눌 수 없습니다. 다시 시도해주세요.");
		} 
//		ArithmeticException을 캐치하는 블록이 위로 와도 됨.
		sc.close();
	}
	

}
