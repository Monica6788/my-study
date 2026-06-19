package com.kh.ex1;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0-100) : ");
		double score = sc.nextDouble();

		if (score >= 0 && score <= 100) { // 점수 범위에 해당하는지
			if (score >= 90) {
				System.out.println("A");
			} else if (score >= 80) {
				System.out.println("B");
			} else if (score >= 70) {
				System.out.println("C");
			} else {
				System.out.println("F");
			}
		} else {
			System.out.println("점수를 올바르게 입력해주세요.");
		}
		
		// 강의 중 풀이에서는 if-else 구문의 바깥쪽부터 완성하고 안쪽(중첩)으로 들어가는 식
		// 안 헷갈리려면 뭐가 나은지 잘 골라서 쓰기~

		sc.close();
	}

}
