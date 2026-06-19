package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		
		int input = sc.nextInt();
		String announce;
		
		switch(input) {
			case 1 : announce = "입력 메뉴입니다.";
					break;
			case 2 : announce = "수정 메뉴입니다.";
					break;
			case 3 : announce = "조회 메뉴입니다.";
					break;
			case 4 : announce = "삭제 메뉴입니다.";
					break;			
			case 7 : announce = "프로그램이 종료됩니다.";
					break;
			default : announce = "잘못 누르셨습니다.";
					break;
		}
		System.out.println(announce);
		
		sc.close();
	}

}
