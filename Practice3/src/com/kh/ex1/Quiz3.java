package com.kh.ex1;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("나이: ");
		int age = s.nextInt();
		System.out.print("키: ");
		double height = s.nextDouble();
		
		boolean lim1 = age < 12;
		boolean lim2 = height <130;
		
		/* if (ageLimit || heightLimit) {
			System.out.println("보호자 동반 필수");
		}
		
		else {
			System.out.println("단독 탑승 가능");
		}
		*/
		
		String announce = (lim1 || lim2)? "보호자 동반 필수" : "단독 탑승 가능";
		System.out.println(announce);
		
		s.close();
	}

}