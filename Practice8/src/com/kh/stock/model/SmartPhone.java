package com.kh.stock.model;

public class SmartPhone extends Device {
	private String os;
	
	public SmartPhone() {
		super();
	}

	public SmartPhone(String brand, String name, int price, String os) {
		super(brand, name, price);
		this.os = os;
	}

	@Override
	public String getInformation() {
//		String info = String.format("브랜드: $s, 제품명: %s, 가격: %d원 | OS: %s", 
//								brand, name, price, os);
		// [스마트폰] 브랜드: Apple, 제품명: iPhone 15, 가격: 1250000원 | OS: iOS
//		String info = "[스마트폰] " + super.getInformation() + String.format(" | OS: %s", os);
		String info = "[스마트폰] " + super.getInformation() + " | OS: " + os;
		return info;
	}
	
	
	
	

}
