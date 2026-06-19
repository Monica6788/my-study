package com.kh;

public class C_Branch {
	/*
	 * 분기문
	 * break : 제어문 내에서 사용시 강제로 종료시키는 구문
	 * continue : 반복문 내에서 사용시 뒤의 문장들을 스킵시키는 구문
	 * 			for문의 경우 {} 내의 남은 내용은 스킵하고 증감식으로 보내버림.
	 * 			while문의 경우 {} 내의 남은 내용은 스킵하고 조건식으로 보내버림.
	 * 			while문은 continue가 증감식보다 먼저 오면 무한 루프 되니까 주의.
	 */

	public static void main(String[] args) {
		//methodBreak();
		methodContinue();
		
	}
	
	public static void methodBreak() {
		// 1 이상 100 이하의 랜덤값을 추출하여 출력
		// 단, 해당 값이 짝수일 경우 반복문 종료
		
		while (true) {
			int n = (int) (Math.random() * 100 +1);
			if (n % 2 == 0) {
				System.out.printf("반복문 종료 직전 값: %d", n);
				break;
			}
			System.out.println(n);
		}
	}
	
	public static void methodContinue() {
		// 1부터 100까지의 정수 중 3의 배수이거나 5의 배수를 제외한 총합 구하기
		
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0 || i % 5 ==0) {
				continue;
			}
			else {
				sum += i;
			}
			// else 없이 sum += i;만 써도 됨
		}
		System.out.println(sum);
		System.out.println(5050 - 51 *33 - 105 * 10 + 105* 3);
	}

}
