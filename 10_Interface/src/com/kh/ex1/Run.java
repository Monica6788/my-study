package com.kh.ex1;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);

		// 사용자가 선택한 메뉴에 따라 동물 객체를 저장 (배열 크기 3)
		Animal[] animal = new Animal[3];
		
		for(int i = 0; i < animal.length; i++) {
			System.out.println("==== 동물을 선택하세요 ====");
			System.out.println("1. 강아지");
			System.out.println("2. 닭");
			System.out.print(" : ");
			
			int num = sc.nextInt();
			
			switch(num) {
				case 1 : animal[i] = new Dog();
						break;
				case 2 : animal[i] = new Chicken();
						break;
				default : break;
			}
			
			// [처음 선택한 동물 객체, 두 번째 동물 객체, 세 번째 선택 동물 객체]

		}
		
		for(Animal a : animal) {
			a.makeSound();
			if(a instanceof Baby) {
				((Baby) a).suck();
			} else {a.move();}
		}
		
		sc.close();

	}

}
