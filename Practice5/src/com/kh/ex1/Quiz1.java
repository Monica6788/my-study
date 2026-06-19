package com.kh.ex1;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수를 입력하세요: ");
		int n = sc.nextInt();
		if (n > 0) {
			for (int i = n; i > 0; i--) {
				System.out.printf("%d ", i);
			}		
		}
		else {
			System.out.println("자연수를 입력해주세요!");
		}
		sc.close();
	}
			
}

