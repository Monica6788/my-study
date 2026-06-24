package com.kh.ex2;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape[] sList = new Shape[2];
		
		for(int i = 0; i < sList.length; i++) {
			System.out.println("=== 도형을 선택하세요 ===");
			System.out.println("1. 원\n2. 직사각형");
			int num = sc.nextInt();
			sc.nextLine();
			
			// 입력받는 동작을 for문 밖에 쓰면 한 번만 입력받게 되므로 1 입력시 두 번 다 1로 처리됨.
			// 각각 입력받아야 하니 넘버 받는 것도 for문 안에
			
			if(num == 1) {
				System.out.print("반지름을 입력하세요: ");
				double r = sc.nextDouble();
				sList[i] = new Circle(r);
			} else if(num == 2) {
				System.out.print("가로 길이를 입력하세요: ");
				double w = sc.nextDouble();
				System.out.print("세로 길이를 입력하세요: ");
				double h = sc.nextDouble();
				sList[i] = new Rectangle(w, h);
			}
		}
		
		for(Shape s : sList) {
			if(s instanceof Circle) {
				System.out.print("원의 넓이: " + s.calculateArea());
			} else if(s instanceof Rectangle) {
				System.out.println("직사각형의 넓이: " + s.calculateArea());
			}
		}
		
		
		
		sc.close();
	}

}
