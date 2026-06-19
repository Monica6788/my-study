package com.kh;

public class B_Cast {
	public static void main(String[] args) {
		//autoCasting();
		forceCasting();
	}
	
	public static void forceCasting() {
	// forceCasting이라는 이름의 메서드 선언
		/*
		 강제 형 변환
		 : 자동 형 변환이 되지 않는 경우에 직접 형 변환을 해주는 것
		 
		 (변환할 자료형) 변환할 대상
		 
		 */
		
		// 실수형 변수 d1에 4.0
		// 정수형 변수 i1에 50
		// d1, i1 값을 더해 정수형 변수 result에 저장
		
		double d1 = 4.0;
		int i1 = 50;
		int result1 = (int)(d1+i1);
		int result2 = (int)d1+i1;
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		/* result1과 result2의 차이
		 result1은 d1과 i1을 합한 결과인 54.0을 int로 강제 형 변환한 것
		 result2는 d1을 int로 강제 형 변환한 4와 i1을 더한 것
		 */
		
		// 주의!: 강제 형 변환 시 데이터 손실이 발생될 수 있음.
		
		int i2 = 290;
		byte i3 = (byte)i2;
		
		// byte 값의 범위: [-128, 127] (closed range)
		
		System.out.println("i3: " + i3);
		
		/* i3의 값이 34가 된 이유
		 * 290이 2진수로 표현된 다음 byte 범위에 맞게 잘려나가면 34가 나오기 때문.
		 */
		
			
	}

	public static void autoCasting() {
	// autoCasting이라는 이름의 메서드 선언
	
		/*
			자동 형 변환 (묵시적 형 변환)
		 	: 값의 범위가 좁은(작은) 자료형에서 넓은(큰) 자료형으로 자동 형 변환
		*/
		
		// 정수형 변수 i1에 12라는 값을 저장.
		// 실수형 변수 d1에 i1의 값을 저장.
		
		int i1 = 12;
		double d1 = i1;
		System.out.println("d1: " + d1);
	}
	
}
