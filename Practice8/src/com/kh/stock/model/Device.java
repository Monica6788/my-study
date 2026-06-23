package com.kh.stock.model;

public class Device /* extends Object */ {
	protected String brand;
	protected String name;
	protected int price;
	
	// protected로 접근 범위를 정해주었으므로 우회접근메소드인 getter setter가 지금은 필요 없음.
	
	public Device() {
		
	}
	
	public Device(String brand, String name, int price) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	public String getInformation() {
//		String info = "브랜드: " + brand  + ", 제품명: " + name + ", 가격: " + price + "원";
		// String.format("문자열 형식", 사용할 값, ...)
		// printf()처럼 쓸 수 있는 혜자 메소드
		return String.format("브랜드: %s, 제품명: %s, 가격: %d원", brand, name, price);
	}
	
	
}
