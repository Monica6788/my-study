package com.kh;

public class B_ArrayFeatures {
	/*
	 * 변수 종류
	 * 일반 변수 :  기본 자료형
	 * 		실제 데이터(리터럴)를 메모리에 바로 저장하는 변수
	 * 		stack 영역에 저장
	 * 		기본 자료형 : byte, short, int, long, float, double, char, boolean
	 * 참조 변수(참조 자료형) : 실제 데이터(리터럴)는 heap 영역에 저장하고, 그 주소값을 저장하는 변수
	 * 
	 * 배열의 특징
	 * 	생성한 후 직접 값을 초기화하지 않아도 기본값으로 초기화됨.
	 * 	heap이라는 영역은 빈 공간으로 존재할 수 없어서 공간이 만들어질 때 JVM에 의해 기본값으로 초기화되는 것.
	 * 
	 * 	단점 : 한 번 생성한 후 배열의 크기를 변경할 수 없다.
	 * 		=> 크기를 변경하고자 할 경우 새로운 배열을 생성해야 함.
	 * 	 */

	public static void main(String[] args) {
		// 정수형 배열 iArr 선언하고 크기가 10인 배열을 생성하여 할당.
		int[] iArr = new int[10]; // 볼 때마다 i아르르라고 읽고 싶음.
		
		// 실수형 배열 dArr 선언하고 크기가 4인 배열 생성하여 할당.
		double[] dArr = new double[4];
		
		// int[] iArr1 = new double[4]; // 컴파일 에러.
		// 형 변환의 문제가 아니라 그냥 선언한 자료형의 배열에 다른 자료형의 배열을 할당 못함.
		
		// => 배열을 생성까지만 한 상태.
		// iArr 배열의 값들 출력
		
		for (int i = 0; i < iArr.length; i++) {
			System.out.printf("%d ", iArr[i]);
		}
		
		System.out.println();
		
		for (int i : iArr) {
			System.out.printf("%d ", i);
		}
		
		System.out.println();
		
		for (int i = 0; i < dArr.length; i++) {
			//System.out.printf("%.1f ", dArr[i]);
			System.out.print(dArr[i] + " ");
		}
		
		System.out.println();
		
		for (double d : dArr) {
			System.out.printf("%.1f ", d);
		}
		System.out.println();
		
		System.out.println("------------------------------");
		
		System.out.println(iArr); // iArr 주소값
		System.out.println(dArr); // dArr 주소값
		// 배열의 자료형 + @ +16진수 주소값
		
		int[] arr = null; // stack 메모리의 arr 칸이 null인 상태
		// System.out.println(arr[0]);
		// null[0] -> NullPointerException 오류 발생
		// 컴파일 단계에서는 오류가 없지만 실행시키고서 오류 발생
		// 문법에 맞길래 일단 ㅇㅋ~ 하고 데이터 가지러 갔다가 막상 도착하고 보니 null이잖아;; 상태가 된 거라고 보면 됨
		
		arr = new int[5];
		System.out.println(arr[4]);
		// System.out.println(arr[5]);
		// 이것도 문법에는 맞는데 막상 봤더니 이 번호는 없는 번호입니다 상태가 됨.
		// ArrayIndexOutOfBoundsException 오류 발생
		// 인덱스 범위를 벗어났기 때문에 오류가 발생함. (반복문 사용 시 자주 발생하는 오류)
		
		// 재할당 -> 배열을 새로 생성해서 할당
		System.out.println("재할당 전 : " + arr);
		arr = new int[7];
		System.out.println("재할당 후 : " + arr);

	}

}
