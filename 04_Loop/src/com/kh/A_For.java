package com.kh;

// java.lang.Math에 있는 Math.random() 사용
// java.lang 경로에 있는 다른 예 : String
// java.lang 경로에 있는 것은

public class A_For {

	public static void main(String[] args) {
		/*
		 * 반복문 : 특정 코드를 반복적으로 수행하는 문법
		 * for문
		 * for (초기식; 조건식; 증감식) {
		 * 		// 반복적으로 실행할 내용;
		 * }
		 * for문 실행 순서
		 * 초기식 -> 조건식 검사 -> 결과가 true -> {} -> 증감식 -> 조건식 검사 -> ...
		 * -> 조건식 검사 결과 false -> 반복문 종료(반복문 탈출)
		 * 
		 * 참고 : 초기식, 조건식, 증감식은 생략이 가능하나 구분을 위해 세미콜론(;)은 필수.
		 * 		증감식 생략 : for (초기식; 조건식; ) {}
		 * 			이 경우 for문 탈출을 위해 {} 안에 증감식이나 break;가 있어야 함.
		 * 		조건식 생략 : for (초기식; ; 증감식) {}
		 * 			조건식이 없어서 조건식 결과 검사가 항상 true
		 * 		초기식 생략 :  for ( ; 조건식; 증감식){}
		 * 		심지어 모두 생략도 가능함. for (; ;)
		 * 			근데 이렇게 쓸 거면 for문을 뭐 하러 쓰냐? 그냥 이게 되네 정도로만 알아두자.
		 */
		//method1();
		method2();
		//method3();
		//method4();
		//method5();

	}
	
	public static void method1() {
		// "Hello"를 5번 출력
		// for문 모르면 System.out.println("Hello");를 5회 쓰면 됨.
		// 위와 같은 코드는 비효율적이라서 반복문이 탄생했다고 볼 수 있음.
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
		}
		
		for (int j = 5; j > 0; j--) {
			System.out.println("Hello");
		}
	}
	
	public static void method2() {
		// 1부터 10까지 출력
		for (int i = 1; i < 11; i++) {
			System.out.printf("%d ", i);
		}
		
		System.out.println();
		
		// 10부터 1까지 출력
		for (int j = 10; j > 0; j--) {
			System.out.printf("%d ", j);
		}
	}
	
	public static void method3() {
		// 1부터 10까지의 합
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i; // sum = sum + 1;이라고 써도 됨.
		}
		System.out.printf("1부터 10까지의 합은 %d입니다.", sum);
	}
	
	public static void method4() {
		// 1부터 10까지의 수 중 1부터 random 값까지의 sum
		/*
		 * [난수 발생시키기]
		 * Math.random() : 0.0 ~ 0.999999...
		 * Math.random() * 10 + 1 => 1.0 ~ 10.9999...
		 * => (int) (Math.random() * 10 +1)
		 */
		int random = (int) (Math.random() * 10 +1);
		System.out.println("랜덤값 : " + random);
		
		int sum = 0;
		for (int i = 1; i < random + 1; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.", random, sum);
	}
	
	public static void method5() {
		int dan = 6;
		System.out.printf("--- %d단 ---\n", dan);
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	
	}
}
