package com.kh.ex1;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정사각형의 한 변의 길이: ");
		
		int side = s.nextInt();
		int perimeter = side * 4;
		int area = side * side;
		//int area2 = (int)Math.pow(side, 2);
		
		System.out.printf("둘레의 길이: %d\n", perimeter);
		System.out.printf("넓이: %d\n", area);
		//System.out.printf("넓이: %d\n", area2);
		
		s.close();		

	}

}