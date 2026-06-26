package com.kh.ex2;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(10000);
		Scanner sc = new Scanner(System.in);
		
		try {
			ba.withdraw(sc.nextInt());
		} catch(NotEnoughBalanceException e) {
			System.out.println(e.getMessage());
			System.out.println("부족한 금액: " + e.getShortfallAmount() + "원");
			
		} finally {
			System.out.println("=== 거래가 종료되었습니다 ===");
		}
		sc.close();

	}

}
