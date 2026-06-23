package com.kh.pos.model;

public class MobilePay extends PaymentMethod {
	private String payVendor;

	public MobilePay() {
		super();
	}

	public MobilePay(String name, int minAge, int transactionLimit, String payVendor) {
		super(name, minAge, transactionLimit);
		this.payVendor = payVendor;
	}

	@Override
	public String toString() {
		String info = "모바일페이 - " + super.toString() 
						+ String.format(" | 제공사: %s", payVendor);
		return info;
	}
		
	
	
	

}
