package com.kh.ex1;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품명을 입력하세요: ");
			String name = sc.nextLine();
		System.out.print("수량을 입력하세요: ");
			int quantity = sc.nextInt();
		System.out.print("단가를 입력하세요: ");
			double price = sc.nextDouble();
			
		System.out.println("___장바구니 영수증___");
		System.out.printf("%-7s: %s\n", "상품명", name);
		//System.out.println("수량: " + quantity + " 잔");
		System.out.printf("%-7s: %d잔\n", "수량", quantity);
		//System.out.println("단가: " + price + " 원");
		System.out.printf("%-7s: %.1f원\n", "단가", price);
		System.out.println("----------------------");
		System.out.printf("%-7s: %.2f 원\n", "총 금액", quantity*price);
		
		//System.out.printf("%s님의 나이는 %d세이며, 키는 %.2fcm 입니다", name, age, height);
		//주석에서 빨간 밑줄 뜨는 건 크게 신경 안 써도 됨
		
		sc.close();
	}

}
