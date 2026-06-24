package com.kh.ex2;

public class Rectangle implements Shape {
	private double w;
	private double h;
	
	public Rectangle(double w, double h) {
		this.w = w;		this.h = h;
	}
	
	@Override
	public double calculateArea() {
		// Shape에서 double calculateArea()라고만 썼지만 자동으로 public 메소드가 됨.
		// 오버라이드 하려면 원본의 접근제한 범위 이상이 되어야 하므로 필수로 적어야 함.
		double area = w * h;
		return area;
	}

}
