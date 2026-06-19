package com.kh.ex1;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("지불한 돈: ");
		int money = s.nextInt();
		System.out.print("물건 가격: ");
		int price = s.nextInt();
		
		int change = money - price;
		int tho = change / 1000;
		int hun = (change - tho * 1000) / 100;
		// int hun = change % 1000 / 100
		
		System.out.println("--- 거스름돈 내역 ---");
		System.out.printf("천원 지폐: %d장\n", tho);
		System.out.printf("백원 동전: %d개\n", hun);
		
		s.close();
	}
	
}