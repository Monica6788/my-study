package com.kh.ex1;
import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		//method1(); // 직각이등변삼각형
		method2(); // 가로 base 세로 height인 직사각형
	}
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();		
	}
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int height = sc.nextInt();
		for (int i = 1; i < height + 1; i++) {
			for (int j = 1; j < base + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();	
	}

}
// 직각이등변삼각형이라 최종 값 자체는 둘 다 n이지만 i = 높이, j = 밑변