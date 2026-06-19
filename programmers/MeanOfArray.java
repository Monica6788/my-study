package programmers;

public class MeanOfArray {

	public static void main(String[] args) {
		int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int leng = numbers.length;
		int sum = 0;
		
		for (int i = 0; i < leng; i++) {
			sum += numbers[i];
		}
		
		double answer = (double) sum / leng;
		System.out.println(answer);
		
	}

}
