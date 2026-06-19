package com.kh.ex1;
import java.util.Scanner;

public class Quiz2_2 {
	// 이우진님 풀이 받아서 보는 중.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			if (num >= 1) {
				break;
			}
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		for (int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
		sc.close();

	}
}
