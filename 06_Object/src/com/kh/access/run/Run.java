package com.kh.access.run;
import com.kh.access.AccessTest;
// 다른 경로에 있는 클래스이므로 클래스가 있는 경로를 통해 이 클래스에도 포함시키는 것.
// import java.util.Scanner;도 같은 원리.

public class Run {

	public static void main(String[] args) {
		// AccessTest 객체 생성
		AccessTest test = new AccessTest();
		
		System.out.println(test.publicField);
		test.publicMethod();
		// => public 멤버 접근
		
		/*
		System.out.println(test.protectedField);
		test.protectedMethod();
		// 상속관계도 아니고 동일 패키지도 아니라서 접근 불가
		
		System.out.println(test.defaultField);
		test.defaultMethod();
		
		System.out.println(test.privateField);
		test.privateMethod();
		*/
		// protected, default, private 접근 불가
		// 패키지 경로가 다르기 때문.
		

	}

}
