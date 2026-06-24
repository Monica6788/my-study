package com.kh.ex1;
// 클래스로 생성했더라도 class 부분을 interface로만 바꿔주면 알아서 인터페이스가 된다~

// [접근제한자] interface(키워드) 인터페이스명 {}
public interface Animal {
	// 상수 필드와 추상 메소드로 구성되어 있다.
	
	//움직인다
	public abstract void move();
	// 추상 메소드니까 몸체 {} 없이 ;로 종결
	
	// 먹는다
	public /*abstract */ void eat();
	// abstract 예약어 생략해도 자동으로 추가된 상태라고 보면 됨.
	
	// 소리를 낸다.
	/* public abstract */ void makeSound();
	// 반환형, 메소드 이름, 매개변수 정보처럼 달라질 수 있는 부분들 외에는 생략 가능.
	
	// ㄴ> 추상 메소드: 몸체(구현부)가 없는 메소드. 즉, 미완성 메소드.

}
