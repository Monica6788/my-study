package com.kh.ex1;

import java.util.Scanner;

public class Quiz1_2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
			String name = sc.nextLine();
		System.out.print("나이: ");
			int age = sc.nextInt();
		System.out.print("키: ");
			double height = sc.nextDouble();	
		
		System.out.println("====================");
		System.out.printf("이름: %s \n", name);
		System.out.printf("나이: %d \n" , age);
		System.out.printf("키: %.1fcm \n", height);
		System.out.println("====================");
		
		sc.close();
	}

}
