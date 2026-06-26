package com.kh.run;

import java.io.IOException;

//import com.kh.A_UncheckedException;
import com.kh.B_CheckedException;
import com.kh.MyException;

public class Run {
	/*
	 * 에러 종류
	 * - 시스템 에러: 컴퓨터 오작동으로 발생하여, 소스코드로 해결 불가한 에러. 심각한 오류(에러)
	 * - 컴파일 에러: 소스 코드 문법 상의 에러 => 빨간 줄로 표시. 개발자의 실수...
	 * - 런타임 에러: 실행 중에 발생하는 문제. 코드 문법 상 문제는 없지만 실행 중 발생하는 에러.
	 * 				(실행 환경이나 입력 문제 등으로 발생.)
	 * - 논리 에러: 프로그램 문법에는 문제가 없지만 의도한 동작이나 결과가 다르게 나오는 경우.
	 * 
	 *  => 시스템 에러를 제외한 컴파일 에러, 런타임 에러, 논리 에러는 개발자가 처리할 수 있는 예외에 해당.
	 *  
	 *  예외 처리
	 *  : 예외가 발생했을 때 프로그램이 비정상 종료되지 않도록 처리하는 방법.
	 *  
	 *  예외 처리 방법
	 *  [1] try-catch 이용
	 *  [2] throws 이용
	 */
		public static void main(String[] args) {
			System.out.println("프로그램 시작");

//			A_UncheckedException a = new A_UncheckedException();
			B_CheckedException b = new B_CheckedException();
			
			// 생성자 안 만들어서 컴파일러가 기본 생성자 만들어 놨음. 그냥 쓰면 됨.
//			a.test1();
//			a.test2();
//			a.test3();
//			b.test1();
//			b.test2(); // 다른 데로 또 던지거나 예외 처리를 해줘야 함.
//			// 메인은 다른 데다 던질 수가 없으므로 무조건 예외 처리!
			
//			try {
//				b.test2();
//			} catch(IOException e) {
//				System.out.println("예외 발생!!!");
//			}
			
			
			try {
				method1();
			} catch(MyException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("프로그램 종료");
			
		}

		public static void method1() throws MyException {
			// main에서 바로 실행할 수 있게 하기 위해 static 예약어 추가함.
			// 예외 발생시키기: throw
			throw new MyException("내가 만든 예외 발생시킴!");
		}
}
