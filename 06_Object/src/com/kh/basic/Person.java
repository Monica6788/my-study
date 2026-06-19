package com.kh.basic;
// 객체를 추가하기 위한 클래스는 보통 main 없이 쓴다.

/*
 * 클래스 구조
 * 		접근제한자 class 클래스명 {
 * 			// 변수부 (필드부)
 * 			// : 데이터를 저장할 공간을 선언하는 부분
 * 			// 생성자부
 * 			// : 객체를 생성하기 위한 특별한 메소드를 정의하는 부분
 * 			// => 데이터를 초기화하기 위한 목적으로 정의
 * 			// 메소드부
 * 			// : 기능을 정의하는 부분
 * 		}
 */
public class Person {
	/*
	 *  추상화 : 객체를 어떻게 표현할 것인지 정리하는 과정
	 *  
	 *  "사람" 객체를 설계
	 *  [1] 떠오르는 것들을 나열해보기 (꼭 명사일 필요는 x. 브레인스토밍이다 생각하고 막 던지기)
	 *  	이름, 나이, 성별, 직업, 국적, 키, 취미, 걷다, 말하다, 뛰다, 울다, ...
	 *  [2] 필요한 항목만 추려내기
	 *  	이름, 나이, 성별, 말하다, 울다
	 *  	// 이름, 나이, 성별은 저장할 데이터가 필요하고, 말하다, 울다는 기능 정의가 필요함.
	 *  [3] 저장할 데이터의 형태를 정리해보기
	 *  	이름 : 문자열 (String)
	 *  	나이 : 정수 (int)
	 *  	성별 : 문자 (char, 'F', 'M')
	 */
	// ---------- 변수부 (필드부) --------------
	String name;	// 이름
	int age;		// 나이
	char gender;	// 성별 'F' or 'M'	
	// 이 변수들도 (default) String name;으로 정의된 것임.
	// ------------- 생성자부 ------------------
	// 생성자 특징 : 반환형 없다, 생성자명 = 클래스명
	public Person() {
		// 기본 생성자 : 정의된 생성자가 없으면 자동생성됨.
	}
	
	public Person(String name) {
		this.name = name;
		// 이 클래스(객체)의 멤버변수 name에 전달받은 name을 대입하겠다.
	}
	
	public Person(String name, int age, char gender) {
		// 매개변수가 있는 생성자
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	// ------------- 메소드부 -------------------
	/**
	 * 소개하는 메소드
	 * 	: 저장된 이름, 나이, 성별 정보를 출력
	 */
	//	접근제한자 예약어 반환형 메소드명(매개변수) {
			// 실행할 내용
	//	}
	public void introduce() {
		System.out.printf("%s, %d, %c\n", this.name, this.age, this.gender);
	}
	/**
	 * 말하다
	 * "안녕하세요." 출력
	 */
	public void talk() {
		System.out.println("안녕하세요.");
	}
	
	/**
	 * 울다
	 * "힝입니다." 출력
	 */
	public void cry() {
		System.out.println("힝입니다.");
	}

}
