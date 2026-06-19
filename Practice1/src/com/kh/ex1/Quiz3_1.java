package com.kh.ex1;
import java.util.Scanner;

public class Quiz3_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 입력: ");
		char ch1 = sc.next().charAt(0);
		int ch2 = ch1-32;
		System.out.print((char)ch2);
		
		sc.close();
		
	}

}
