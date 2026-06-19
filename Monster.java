package com.kh.encapsulation;

public class Monster {
	// -------------- 필드 -----------------
	private int hp;	// 체력
	
	// -------------- 생성자 ------------------
	// 기본 생성자
	public Monster() {
		this.hp = 100;	// 체력을 100으로 초기화
		// 여기서는 this 생략 가능하지만 명확하게 쓰기 위해 그냥 생략 안함.
	}
	
	//--------------- 메소드 -------------------
	// 공격 당함 => 체력을 깎는 메소드 (hp 변수의 값을 감소)
	public void attack(int damage) {
		if (damage > 100) {
			System.out.println("레벨 범위보다 낮아서 공격할 수 없습니다.");
			return;	// 메소드 종료!!!
		}
		this.hp -= damage;
		if(this.hp == 0) {
			System.out.println("몬스터 처치 완료!");
		}
	}
	// 체력 확인 => 체력 값을 확인하는 메소드 (hp 변수의 값을 반환)
	public int getHp() {
		return this.hp;
	}

}
