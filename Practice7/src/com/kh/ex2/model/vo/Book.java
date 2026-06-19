package com.kh.ex2.model.vo;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {
	}
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	// 자료형이 같은 매개변수가 있을 때에는 순서에 주의!
	public Book(String title, String author, String publisher,
								int price, double discountRate) {
//		this.title = title;
//		this.publisher = publisher;
//		this.author = author;
		this(title, author, publisher);
		// 위에 매개변수 3개짜리 생성자 있으니까 그걸 불러오는 거라고 보면 됨!
		
		this.price = price;
		this.discountRate = discountRate;
	}
	// Alt + Shift + S ( + r): 누르면 Generate Getters Setters 있음!
	
	/*public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return this.title;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return this.discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	*/
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public void inform() {
		System.out.println("도서명: " + title + " 저자명: " + author + " 출판사: " 
					+ publisher + " 가격: " + price + " 할인율: " + discountRate);
		System.out.printf("도서명:  %s 저자명: %s 출판사: %s 가격: %d 할인율; %.2f\n"
				, title, author, publisher, price, discountRate);
		// 더 정확하게는 this.title, this.author, ...로 해야 함.
	}
	
}
