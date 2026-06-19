package com.kh.ex1.run;
import com.kh.ex1.model.vo.Product;
// Ctrl + Shift + o

public class Run {

	public static void main(String[] args) {
		// 기본 생성자를 통해 2개의 Product 객체를 생성
		Product p1 = new Product();
		p1.setProductName("아이폰16");
		p1.setPrice(1000000);
		p1.setBrand("애플");
		
		Product p2 = new Product();
		p2.setProductName("갤럭시 S25");
		p2.setPrice(1350000);
		p2.setBrand("삼성");
		
		p1.information();
		p2.information();
	}

}
