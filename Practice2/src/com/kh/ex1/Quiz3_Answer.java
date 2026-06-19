// 수업 중 문제풀이 시간에 받아적은 코드

package com.kh.ex1;

import java.util.Scanner;

public class Quiz3_Answer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 소문자를 저장할 char 변수 선언
		char a;
		
		// 소문자 입력 받기
		System.out.print("소문자 입력: ");
		String str = sc.next();
		
		// 문자열 길이: str.length()
		
		// 특정 위치의 한 문자를 추출: 문자열.charAt(위치);
		// 위치: 0부터 시작.
		
		/* ex) "happy" -> "happy".charAt(0) => 'h'
		 *  			  "happy".charAt(2) => 'p'
		 * 				  "happy".charAt(3) => 'p'
		 * 				  "happy".charAt(4) => 'y'
		 */
		
		a = str.charAt(0);
		
		//System.out.println("입력 받은 값: " + str);
		//System.out.println("추출한 값: " + a);
		
		// 소문자를 대문자로 변환
		char result = (char)(a -32);
		// a(char, 2B) - 32(int, 4B)
		// a (char->int) - 32 => (int) : 97 - 32 = 65
		// 계산이 완료된 a-32 전체 앞에 (char)를 사용하여 강제 형 변환 
		//=> result(char)65;
		
		System.out.println("소문자: " + a);
		System.out.println("대문자: " + result);
		
		sc.close();
		
	}
}


/*Quiz3 문제풀이 코드와 내 코드 차이점 정리

1. 문제풀이 코드: 
    a. 소문자를 저장할 char 변수 선언
    b. Scanner를 이용한 String 타입의 소문자 입력 받기
    c. 문자열.charAt(위치)를 이용하여 String 변수에서 char 변수 추출
    d. 추출한 소문자를 대문자로 변환하는데, 이때 캐스팅 연산자 (자료형) 변수; 사용
    e. 출력
2. 내 코드
    a. 입력 받은 String에서 바로 char small 추출
    b. int capital 선언하고 아스키코드 값 바꾸기. 이때 char 변수 small은 char에서 int로 자동 형 변환
    c. (char)caital 이용하여 문자형으로 출력
*/