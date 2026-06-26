package com.kh;

import java.util.Scanner;

public class A_UncheckedException {
	/*
	 * RuntimeException: 프로그램 실행 시 발생하는 예외들.
	 * => 대부분 예측 가능한 상황에서 발생.
	 * 	  if문, 조건식을 통해 애초에 예외가 발생되지 않도록 방지 가능.
	 * 오류 수정이 강제되지 않는 예외.
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	
	/**
	 * ArithmeticException 테스트
	 */
	public void test1() {
		System.out.print("첫 번째 수: ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 수: ");
		int n2 = sc.nextInt();
		
//		int result = n1 / n2;
//		//두 번째 수가 0인 경우 예외 발생. => 프로그램이 비정상 종료됨.
//		System.out.println("n1 / n2 = " + result);
		
		/*
		 * try { 
		 * 		예외가 발생되는 부분
		 * } catch(발생할_예외_클래스명 변수명) {
		 * 		해당 예외가 발생했을 때 실행할 내용
		 * }
		 */
		
		try {
			int result = n1 / n2;
			System.out.println("n1 / n2 = " + result);
		} catch(ArithmeticException e) {
			System.out.println("[Exception] 0으로는 나눌 수 없습니다.");
			System.out.println(e.getMessage());
			// getMessage(): 예외에 대한 설명을 문자열로 반환
			e.printStackTrace();
			// printStacTrace(): 예외 정보, 발생 지점을 출력해주는 메소드 (반환형: void)
		}
		sc.close();
	}
	/**
	 * NegativeArraySizeException,
	 * ArrayIndexOutOfBoundsException 테스트
	 */
	public void test2() {
		System.out.print("배열 크기: ");
		int size = sc.nextInt();
		
//		int[] arr = new int[size];
//		System.out.println("77번 인덱스의 값: " + arr[77]);
		
		// if문으로 예외 방어
//		if (size > 77) {
//			System.out.println("77번 인덱스의 값: " + arr[77]);
//		} else {
//			System.out.println("배열의 크기 범위를 벗어났습니다.");
//		}
		
		try {
			int[] arr = new int[size];
			System.out.println("77번 인덱스의 값: " + arr[77]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("[Exception] 인덱스 접근 범위를 벗어났습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(NegativeArraySizeException e) {
			System.out.println("[Exception] 배열의 크기는 음수일 수 없습니다.");
			System.out.println("입력한 크기: " + e.getMessage());
			e.printStackTrace();
		}
		sc.close();

	}
	/**
	 * catch 블록에 사용할 예외가 상속 관계일 때 테스트
	 */
	public void test3() {
		System.out.print("배열 크기: ");
		int size = sc.nextInt();
		
		try {
			int[] arr = new int[size];
			System.out.println("77번 인덱스의 값: " + arr[77]);
		} catch(ArrayIndexOutOfBoundsException e) {
			//
		} catch(RuntimeException e) {
			System.out.println("[Exception] 배열 크기가 음수이거나, "
					+ "실행 중 어떠한 에러가 발생했습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		// catch(부모타입 클래스 e) 블록은 항상!!! catch(자식타입 클래스 e)보다 아래에 있어야 한다.
		// 여러 개의 catch 블록으로 예외 처리 시
		// 해당 예외 클래스 간에 상속 관계가 있는 경우, 부모타입보다 자식타입이 먼저(윗줄에) 작성되어야 함.
	}
	
	

}
