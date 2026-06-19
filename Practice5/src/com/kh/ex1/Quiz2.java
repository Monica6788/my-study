package com.kh.ex1;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		//method1();
		method2();
	}
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수를 입력하세요 : ");
		int n = sc.nextInt();
		while (n < 1) {
			System.out.println("자연수를 입력해주세요.");
			System.out.print("자연수를 입력하세요 : ");
			n = sc.nextInt();
			//if (n >= 1) {break;} //필요 없음...
		}
		if (n >= 1) {
			for (int i = n; i > 0; i--) {
				System.out.printf("%d ", i);
			}
		}	
		sc.close();
	}
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		
		
		sc.close();
	}

}
// 개인적으로 이게 제일 어려웠다... 복습 필수