package com.kh.menu;

public class Americano extends Drink {
	
	public Americano(String name, int price) {
		super(name, price);
		// super();		// --> Drink 클래스의 기본생성자.
		// Drink 클래스에 기본생성자 없어서 위의 코드처럼 매개변수 적어주어야 함.
		// 부모클래스에 정의된 생성자를 호출해주는 것.
	}
	
	@Override
	public void order() {
		System.out.println("에스프레소 샷을 추출하고 얼음을 채웁니다.");
	}

}
