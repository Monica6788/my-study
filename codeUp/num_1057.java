package codeUp;
import java.util.Scanner;

public class num_1057 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		int i1 = s.nextInt();
		int i2 = s.nextInt();
		
		boolean b1 = (i1 == 1)? true : false;
		boolean b2 = (i2 == 1)? true : false;
		
		if(b1 == b2) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		s.close();
	}

}