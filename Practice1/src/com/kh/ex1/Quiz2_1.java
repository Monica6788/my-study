package com.kh.ex1;

public class Quiz2_1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("교환 전: a = " + a + ", b = " + b);
		int c = a;
		
		a = b;
		b = c;
		System.out.println("교환 후: a = " + a + ", b = " + b);
	}

}
