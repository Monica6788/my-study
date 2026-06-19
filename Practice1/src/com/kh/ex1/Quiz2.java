package com.kh.ex1;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		//println을 쓸 경우 이름 입력 칸이 바로 옆이 아니라 아랫줄에 뜨게 됨.
		//printf를 쓸 수도 있지만 특정 자료형을 지정하고 싶을 때 쓰는 거니까 굳이 안 써도 됨.
		
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.println(name +"님(" + age +"세)의 자바 학습을 환영합니다!");
		
		sc.close();
	
		
	}

}
