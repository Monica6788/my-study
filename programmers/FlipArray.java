package programmers;

//import java.util.Arrays;

public class FlipArray {
	public static void main(String[] args) {
		solution();
	}
	
	public static void solution() {
        int [] num_list = {1, 2, 3, 4, 5};
        int leng = num_list.length;
        int [] answer = new int[leng];
        for (int i = 0; i < leng; i++) {
            answer[i] = num_list[leng-1-i];
        }
        for (int i = 0; i < leng; i++) {
        	System.out.println(answer[i]);
        }
               
	}
}