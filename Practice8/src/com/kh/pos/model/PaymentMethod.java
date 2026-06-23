package com.kh.pos.model;

public class PaymentMethod {
	protected String name;
	protected int minAge;
	protected int transactionLimit;
	
	
	public PaymentMethod() {
		super();
	}
	public PaymentMethod(String name, int minAge, int transactionLimit) {
		super();
		this.name = name;
		this.minAge = minAge;
		this.transactionLimit = transactionLimit;
	}
	
	// 컨트롤러에서 name의 값을 확인하기 위해 메소드 추가.
	public String getName() {
		return name;
	}
	public int getMinAge() {
		return minAge;
	}
	
	public String toString() {
		return String.format("플랫폼: %s, 제한연령: %d세, 한도: %d원", 
								name, minAge, transactionLimit);
	}
}
