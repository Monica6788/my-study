package programmers;
import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
	    int x = 1;
	    int even = 2 * x;
	        
	    while (even <= n) {
	    	answer += even;
	    	x++; // x만 업데이트된 상태. 아랫줄에서 even도 업데이트
	    	even = 2 * x;
	    }
	        
	    System.out.print(answer);
	    sc.close();
	}

}