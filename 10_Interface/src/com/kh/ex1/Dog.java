package com.kh.ex1;

public class Dog implements Animal, Baby {
	/*
	 * implements를 쓰는 순간
	  void move();
	  void eat();
	  void makeSound();
	 * 를 모두 받아오게 되는데, 아직 재정의를 통해 추상 메소드를 완성하지 않아서 오류 발생.
	 * 컴퓨터 입장에서는 이 상태에서 Dog 객체를 생성하면 어라 지금 move 호출되면 어캄 상태가 됨.
	 * 따라서 아예 생성도 못하게 막아버리는 것.
	 * Dog 앞에 이 클래스도 미완성이라고 abstract를 쓰든, 추상 메소드를 구현해서 완성하든 해야 함.
	 */
	
	// 오버라이딩
	// 여기서 완성할 거니까 메소드명() 뒤에 ; 말고 평소 하던 대로 몸체 만들어서 완성하면 됨.
	
	public Dog() {
		
	}
	
	@Override
	public void move() {
		System.out.println("네 발로 걸어갑니다...");		
	}
	@Override
	public void eat() {
		System.out.println("고구마를 먹습니다.");
	}
	@Override
	public void makeSound() {
		System.out.println("앍앍앍");
	}
	@Override
	public void suck() {
		System.out.println("젖먹이입니다.");
	}
	

}
