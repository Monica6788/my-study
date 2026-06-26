package com.kh.ex2;

public class BankAccount {
	private int balance;
	
	public BankAccount(int initialBalance) {
		this.balance = initialBalance;
	}
	
	public void withdraw(int amount) throws NotEnoughBalanceException {
		System.out.println("=== 신한은행 출금 시스템 ===");
		if(balance < amount) {
			System.out.println("현재 잔액: " + balance + "원");
			System.out.println("출금 시도 금액: " + amount + "원");
			throw new NotEnoughBalanceException
						("[출금 오류 발생] 잔액이 부족합니다.", balance, amount);
		} else {
			System.out.println("현재 잔액: " + balance + "원");
			System.out.println("출금 시도 금액: " + amount + "원");
			balance -= amount;
			System.out.println("출금 완료! 잔액: " + balance + "원");
		}
	}

}
