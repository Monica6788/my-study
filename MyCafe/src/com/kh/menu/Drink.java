package com.kh.menu;

public class Drink {
	private String name;
	private int price;
	
	
	public Drink(String name, int price) {
		super();	// 부모타입(Object 클래스)의 기본 생성자
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	

	public void order() {
		System.out.println("음료를 준비합니다.");
	}
	
	

}
