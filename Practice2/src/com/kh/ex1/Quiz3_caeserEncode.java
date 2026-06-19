package com.kh.ex1;

import java.util.Scanner;

public class Quiz3_caeserEncode {
	// 암호화 공식: C=(P+k) (mod26)
		// C: 암호문, P: 평문, k: 이동할 칸 수
		// 이 암호화 코드에서는 k=5

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("암호화 할 단어를 입력하세요(세 글자): ");
			String plain = sc.next();
			char ch0 = plain.charAt(0);
			char ch1 = plain.charAt(1);
			char ch2 = plain.charAt(2);
			
			int code0 = ch0 + 5;
			int code1 = ch1 + 5;
			int code2 = ch2 + 5;
			
			char[] codeResult = { (char)code0, (char)code1, (char)code2 };
			String codeString = new String(codeResult);
			
			System.out.println("입력하신 단어의 암호문은 " + codeString + "입니다.");
			
			sc.close();

		}


}
