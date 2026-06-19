package com.kh.encapsulation;
/*
 * 캡슐화 (교재 정보은닉 파트 참조)
 * 	: 객체의 속성(데이터)과 기능(메소드)을 하나로 묶어 내부에서 스스로 관리하게 하는 것.
 * 	  대표적인 원칙으로는 "정보 은닉"이 사용됨.
 * 
 * 	정보 은닉
 * 	[1] 접근 제한자를 사용해 외부의 무분별한 데이터 접근을 차단.
 * 	[2] 외부에 공개된 제한된 메소드만을 허용한다.
 * 
 * 	장점
 * 	- 데이터 보호 : 외부로부터 내부 데이터에 직접 접근 방지.
 * 	- 무결성 유지 : 객체가 자신의 데이터를 스스로 검증, 관리하여 데이터 오염을 막는다.
 * 	- 유지보수성 향상 : 내부 구현이 바뀌어도 외부에 미치는 영향을 최소화한다.
 * 
 * 	구현 방법
 * 	[1] 필드(변수)는 'private' 접근 제한자를 사용하여 직접 접근 차단.
 * 	[2] 필요에 따라 'public' 메소드를 통해서만 간접 접근 허용.
 * 		(getter, setter, 또는 그 외의 메소드)
 */

public class Run {

	public static void main(String[] args) {
		// Monster 생성
		Monster mon = new Monster();
		
		// int hp = mon.hp;
		// hp는 private이므로 직접 접근 불가. 메소드를 통한 간접 접근만 가능하다.
		
		System.out.printf("현재 몬스터 체력 : %d\n", mon.getHp());
		
		// mon.hp = 999;
		// 직접 접근이 불가능하므로 이런 치트도 불가능.
		
		mon.attack(100);
		System.out.printf("현재 몬스터 체력 : %d\n", mon.getHp());
	}

}
