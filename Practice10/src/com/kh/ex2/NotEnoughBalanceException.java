package com.kh.ex2;

public class NotEnoughBalanceException extends Exception {
	private int balance;
	private int withdrawalAmount;
	
	public NotEnoughBalanceException(String message, int balance, int withdrawlAmount) {
		super(message);
		this.balance = balance;
		this.withdrawalAmount = withdrawlAmount;
	}
	
	/**
	 * 부족한 금액을 반환하는 메소드
	 * @return withdrawalAmount - balance;
	 */
	public int getShortfallAmount() {
		return Math.abs(withdrawalAmount - balance);
	}
	
	public int getBalance() {
		return balance;
	}

}
