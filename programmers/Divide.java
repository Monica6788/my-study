package programmers;
import java.util.Scanner;
public class Divide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int answer;
		double result = (double) num1 / num2;
		// (double) (num1 / num2)로 작성하면 나눗셈 연산을 먼저 함.
		// 나눗셈 연산 먼저 하면 소수점 아래 빼고 정수 부분만 계산된 후 double로 표시되니 주의!
		
		answer = (int) (result * 1000);
		System.out.println(answer);
		
		sc.close();
	}

}
