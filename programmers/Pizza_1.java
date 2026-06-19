package programmers;

import java.util.Scanner;
public class Pizza_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int plus = n % 7;
		
		if (plus == 0) {
			System.out.print(n / 7);			
		}
		else {
			System.out.print(n / 7 + 1);
		}
		
		sc.close();
	}

}
