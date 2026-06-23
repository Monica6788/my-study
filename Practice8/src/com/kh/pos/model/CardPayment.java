package com.kh.pos.model;

public class CardPayment extends PaymentMethod {
	private boolean hasCashback;

	public CardPayment() {
		super();
	}

	public CardPayment(String name, int minAge, int transactionLimit, boolean hasCashback) {
		super(name, minAge, transactionLimit);
		this.hasCashback = hasCashback;
	}
	
	

	public boolean isHasCashback() {
		return hasCashback;
	}

	@Override
	public String toString() {
		String cashback;
		if(hasCashback == true) {
			cashback = " | 캐시백 여부: 캐시백 가능";
		} else {cashback = " | 캐시백 여부: 캐시백 없음";}
		return "신용/체크카드 - " + super.toString() + cashback;
	}
	
	
	
	
	
}
