package programmers;
import java.util.Scanner;
import java.util.Arrays;
public class Americano {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int [] answer = {};
		int cup = money / 5500;
		int change = money - 5500 * cup;
		answer = new int[] {cup, change};
		
		// System.out.print(answer);로 치면 메모리 주소(해시코드)가 출력됨.
		// import.java.util.Arrays (호출) 후 Array.toString() 활용
		// 배열 안의 모든 요소를 [1, 2, 3] 같은 형태의 문자열로 변환해주는 메서드
		System.out.print(Arrays.toString(answer));
		
		sc.close();
	}

}
/*
 * return arr과 System.out.print(arr)의 차이
 * return은 메서드의 종료를 알림.
 * 계산된 배열의 결과 데이터를 다른 메서드나 호출부에서 이어서 사용하도록 데이터 전달.
 * System.out.print(arr)은 배열의 실제 값을 보여주는 게 아님.
 * 내부적으로 Arrays.toString()을 호출하여 메모리 해시코드(주소)만 띄움.
 */