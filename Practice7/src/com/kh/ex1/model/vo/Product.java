package com.kh.ex1.model.vo;

public class Product {
	private String productName;
	private int price;
	private String brand;
	
	public Product() {
	}
	
	// productName getter :  해당 필드의 값을 반환하는 메소드
	public String getProductName() {
		return this.productName;
	}
	//productName setter : 해당 필드에 전달받은 값을 저장하는 메소드
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	// price getter :  해당 필드의 값을 반환하는 메소드
	public int getPrice() {
		return this.price;
	}	
	//price setter : 해당 필드에 전달받은 값을 저장하는 메소드
	public void setPrice(int price) {
		this.price = price;
	}
	
	// brand getter :  해당 필드의 값을 반환하는 메소드
	public String getBrand() {
		return this.brand;
	}
	//brand setter : 해당 필드에 전달받은 값을 저장하는 메소드
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void information() {
		System.out.printf("%s / %d / %s\n", productName, price, brand);
	}
	
}
