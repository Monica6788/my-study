package codeUp;
import java.util.Scanner;

public class num_1024 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int len = str.length();
		int c = 0;
		char ch = str.charAt(c);
		
		while (c < len) {
			ch = str.charAt(c++);
			System.out.printf("'%c'\n", ch);
		}
		
		sc.close();
	}
}