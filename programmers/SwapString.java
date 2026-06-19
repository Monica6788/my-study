package programmers;

public class SwapString {
	public static void main(String[] args) {
		System.out.println(solution("dog"));
	}
	public static String solution(String my_string) {
       String answer = "";
		int l = my_string.length();
        char[] arr = new char[l];
        for(int i = 0; i < l; i++) {
            arr[l - 1 - i] = my_string.charAt(i);
        }
        for(int i = 0; i < l; i++) {
            answer += arr[i];
        }
        return answer;
    }
}
