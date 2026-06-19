package com.kh;
import java.util.Scanner;

public class B_Comparison {
	/*
	 * 비교 연산자 (이항 연산자) :  두 값을 비교하는 연산자
	 * 조건을 만족하면 true, 만족하지 않으면 false
	 * 대소 비교 연산자 : < > <= >=
	 * 동등 비교 연산자 : == !=
	 */
	public static void main(String[] args) {
		// 입력 받은 두 정수의 값을 비교
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수 1 입력: ");
		int n1 = s.nextInt();
		
		System.out.print("정수 2 입력: ");
		int n2 = s.nextInt();
		
		/*boolean b1 = n1 == n2;
		boolean b2 = n1 > n2;
		boolean b3 = n2 % 2 == 0;
		boolean b4 = n2 == 65;
		
		System.out.println("정수 1과 정수 2는 같은 값인가? : " + b1);
		System.out.println("정수 1이 정수 2보다 큰가? : " + b2);
		System.out.println("정수 2는 짝수인가? : " + b3);
		*/
		
		System.out.println("정수 1과 정수 2는 같은 값인가? : " + (n1 == n2));
		System.out.println("정수 1이 정수 2보다 큰가? : " + (n1 > n2));
		System.out.println("정수 2는 짝수인가? : " + (n2 % 2 == 0));
		
		// System.out.println("정수 2는 'A'의 유니코드(아스키코드)인가?: " + (n2 == 65));
		System.out.println("정수 2는 'A'의 유니코드(아스키코드)인가?: " + (n2 == 'A'));
		// char 변수 'A'가 int형으로 자동 형 변환되므로 형 변환 연산자 필요 없음.
		
		s.close();
		
	}

}
