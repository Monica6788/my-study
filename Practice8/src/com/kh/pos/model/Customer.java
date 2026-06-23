package com.kh.pos.model;

public class Customer {
	private String name;
	private int age;
	private int points;
	
	
	public Customer() {
		super();
	}
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	public String toString() {
		return String.format("%d세 %s님의 현재 포인트 점수는 %d점입니다.", age, name, points);
	}
}
