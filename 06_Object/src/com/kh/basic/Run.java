package com.kh.basic;
// 만들어 놓은 Person 등의 클래스를 실행시키기 위한 클래스
import java.util.Scanner;

public class Run {
	/*
	 * 객체 생성 및 사용법
	 * 
	 * - 변수 선언 (참조 변수 공간 확보)
	 * 		클래스명 변수명;
	 * 
	 * - 객체 생성 및 할당 (메모리에 실제 객체를 올리고 주소를 연결)
	 * 		new 생성자;	// 생성
	 * 		new 클래스명();	// 기본생성자(디폴트생성자)
	 * 		변수명 = new 생성자;
	 * 
	 * - 선언과 동시에 할당
	 * 		클래스명 변수명 = new 생성자;
	 * 
	 * - 객체 멤버(변수, 메소드)에 접근하기 : 연결 연산자(.) 사용
	 * 		멤버 변수 접근 : 참조변수.멤버변수	// 참조변수 : 클래스명
	 * 		멤버 메소드 접근 : 참조변수.메소드명()
	 * 
	 * - 생성자 활용 참고
	 * 		기본 생성자 사용 : 멤버 변수 값을 나중에 하나하나 저장.
	 * 					=> 우선, 각 자료형의 기본값으로 채워짐.
	 *  	// 참조 자료형 기본값 : null => 멤버변수에 있는 배열의 기본값도 null
	 * 		매개변수가 있는 생성자 사용 : 객체를 만드는 동시에 특정 값을 멤버변수에 저장.
	 */

	public static void main(String[] args) {
		// 정수형 변수는 int n; 문자형 변수는 char ch;
		// 사람의 정보를 담을 변수 => Person p1;
		Person p1;	// 선언만 한 경우 : 스택에 p1 공간 생성.
		// 해당 변수 p1은 null값을 가지고 있다. 왜냐면 얘는 참조 변수니까!!!
		Scanner sc = new Scanner(System.in);
		
		// Person 객체 생성 및 할당
		p1 = new Person();
		
		// 이름, 나이, 성별에 값을 저장 (대입)
		p1.name = "이고은";
		p1.age =28;
		p1.gender = 'F';
		
		// 자기소개 기능 호출 -> introduce()
		p1.introduce();
		// Person.introduce();는 안 되고 p1.introduce();는 되는 이유
		// 일단 introduce 메소드는 static이 아니라서 메모리에 올리기 전까지 갖다 쓸 수가 없음.
		// p1은 위에서 객체 생성 및 할당(p1 = new Person();)이 완료됨.
		// 따라서 힙 메모리에 올라간 상태니까 p1.introduce();는 작동 가능.
		// 만일 p1이 Person p1;으로 선언만 된 상태였다면, p1.introduce();도 사용불가.
		
		// 선언과 생성을 동시에
		Person p2 = new Person(sc.next());
		p2.introduce();
		
		// 모든 정보를 객체 생성 시 저장.
		// 생성자와 함께 정의했던 매개변수의 순서대로!
		Person p3 = new Person(sc.next(), sc.nextInt(), sc.next().charAt(0));
		p3.introduce();
				
		sc.close();

	}

}
