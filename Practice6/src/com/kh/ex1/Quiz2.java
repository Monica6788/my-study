package com.kh.ex1;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] fruits = {"사과", "딸기", "바나나", "키위", "복숭아"};
		System.out.print("찾으시는 과일 이름을 입력하세요 : ");
		String f = sc.next();
		int count = 0;
		
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals(f) == true) {
				System.out.printf("%s는 배열의 %d번 인덱스에 있습니다.\n", fruits[i], i);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("찾으시는 과일이 없습니다.");
		}
		sc.close();
	}

}
