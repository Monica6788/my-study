package com.kh.access;

public class Run {

	public static void main(String[] args) {
		//AccessTest 객체 생성 및 할당
		AccessTest test = new AccessTest();
		
		//public 멤버(publicField, publicMethod)에 접근
		String pf = test.publicField;
		System.out.println("public 변수 : " + pf);
		
		test.publicMethod();
		
		// protected 멤버에 접근
		String ptf = test.protectedField;
		System.out.println("protected 변수 : " + ptf);
		
		test.protectedMethod();
		
		// default 멤버에 접근
		System.out.println(test.defaultField);
		test.defaultMethod();
		
		//private 멤버에 접근
		//System.out.println(test.privateField);
		//test.privateMethod();
		// 둘 다 접근 불가! not visible 오류 발생.
		
	}

}
