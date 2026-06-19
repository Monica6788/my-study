package com.kh.ex1;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 입력: ");
		char small = sc.next().charAt(0);
		int capital = small-32;
		System.out.println("소문자: " + small);
		System.out.println("대문자: " + (char)capital);
		
		sc.close();
	}
}
