package test;

public class test0617 {

	public static void main(String[] args) {
		num3();
		num4();
		//num5();
		//num8();
		//num10();
		num10_1();
	}
	public static void num3() {
		/* 문제 내용
		 * 다음 중 자바의 변수 명명 규칙으로 올바르지 않은 것을 모두 고르시오.
		 * 1) int 1stNumber;
		 * 2) int _value;
		 * 3) int totalSum;
		 * 4) int class;
		 * 
		 * 작성한 답안 : 1, 2, 4
		 * 실제 답안 : 1, 4
		 * 
		 * 관련 개념 정리
		 * 	변수명은 숫자로 시작할 수 없고 자바의 예약어는 변수명으로 설정할 수 없다.
		 * 	특수문자는 _와 $만 사용할 수 있는데, 특수문자로 시작하지 말란 법은 없다.
		 */
		
	}
	public static void num4() {
		/* 문제 내용
		 * 다음 코드가 실행되었을 때 콘솔에 출력되는 결과는 무엇인가요?
		 * 
		 * int a = 10;
		 * int b = a++;
		 * 
		 * System.out.println("a:" + a + ", b:" + b);
		 * 
		 * ----- 작성한 답안 -----
		 * 	a: 10, b: 11
		 * 
		 * ----- 실제 답안 -----
		 * 	a: 11, b: 10
		 * 
		 * 관련 개념 정리 : b에 원래 a값을 대입한 후 a의 값이 1 증가.
		 * 				처음에 생각했던 정답을 반대로 작성함. 정신을 똑바로 차려야겠다.
		 */
	}
	public static void num5() {
	/* 문제내용
	 * 다음 switch문 코드를 동일한 결과가 나오도록 if-else문으로 변환하여 작성하시오
	 * 
		char grade = 'B';
		switch(grade) {
			case 'A' : System.out.println("우수"); break;
			case 'B' : System.out.println("보통"); break;
			default : System.out.println("노력");
		
		------ 작성한 답안 -----
		
		char grade = 'B';
		if (char == A) {
			System.out.println("우수");
		}
		else if (char == 'B') {
			System.out.println("보통");
		}
		else {
			System.out.println("노력");
		}
	 */
	// 실제 답안
		char grade = 'B';
		if (grade == 'A') { // 작성한 답안에서 작은 따옴표 안 씀. 변수명을 char로 씀
			System.out.println("우수");
		}
		else if (grade == 'B') { // 여기도 변수명 char로 씀
			System.out.println("보통");
		}
		else {
			System.out.println("노력");
		}
		
	/*
	 * 관련 개념 정리 : char 타입에 값을 저장할 때는 '' 필요.
	 * char는 자료형이고 이 문제에서 변수명은 grade
	 */
	}
	public static void num8() {
	/* 문제 내용
	* 아래 코드의 실행 결과와 왜 그런 결과가 발생하는지 자바의 '형변환' 개념을 포함하여 기술하시오.
	*/
	// int num1 = 5;
	// int num2 = 2;
	// double result = num1 / num2;
	 
	// System.out.println(result);
	/* ----- 작성한 답안 -----
	* 	결과: 2.5
	* 	num1은 int(4B), result는 double(8B)
	* 	=> num1: 덜 정밀한(작은) 자료형에서 더 정밀한(큰) 자료형으로 자동 형변환.
	* 		result = 5.0 / 2 = 2.5
	* ----- 실제 답안 ------
	* 	결과 : 2.0
	* 	double result = num1 / num2;의 연산 순서는 나눗셈의 몫 -> 대입
	* 	따라서 5 /2 = 2인데, result의 자료형이 double이므로 int에서 double로 자동 형변환.
	* 	=> (double)2 = 2.0
	*/
	}
	public static void num10() {
		/* 문제 내용
		 * 1부터 50까지 진행되는 369 게임 프로그램을 작성하시오.
		 * 	규칙은 다음과 같습니다.
		 * 	[규칙 1] 숫자에 3, 6, 9가 포함되어 있다면 그 개수만큼 "짝"을 출력해야 합니다.
		 * 		예: 3 -> "짝"
		 * 		예: 33 -> "짝짝"
		 * 		예: 36 -> "짝짝"
		 * 	[규칙 2] 3, 6, 9가 하나도 포함되어 있지 않다면 숫자 자체를 출력합니다.
		 * 
		 * 	조건에 대해 참고하시오
		 * 	[조건 1] 클래스 이름은 자유롭게 지정할 수 있습니다.
		 * 	[조건 2] 나누기 연산자(/)와 나머지 연산자(%)를 사용하여 십이 자리 숫자와 일의 자리
		 * 			숫자를 분리하여 판별하시오.
		 * 	[조건 3] 한 줄에 숫자나 "짝"을 하나씩 출력하되, 아래의 출력 형식을 따르시오.
		 * 	1
		 * 	2
		 * 	짝
		 * 	4
		 * 	5
		 * 	짝
		 * 	...
		 * 	28
		 * 	짝 (-> 9가 있으므로 "짝")
		 * 	짝 (-> 30은 십의 자리가 3이므로 "짝")
		 * 	짝 (-> 31은 십의 자리가 3이므로 "짝")
		 * 	짝 (->32)
		 * 	짝짝 (-> 33은 십의 자리 3, 일의자리 3이므로 "짝짝")
		 * 	...
		 * 	50
		 */
		// ----- 작성한 답안 -----
		/*public class Game369 {
			public static void main(String[] args) {
				for (int i = 1; i < 51; i++) {
					int sib = i / 10;
					int il = i % 10;
					if(sib % 3 != 0 && il % 3 != 0) {
						System.out.println(i);
					}
					else {
						if(sib % 3 == 0 && il % 3 == 0) {
						// 이 경우 한 자리 수와 10의 배수는 "짝" 또는 "짝짝"이 출력됨.
						// 예를 들어 3 -> "짝짝" 출력됨.
							System.out.println("짝짝");
						}
						System.out.println("짝");
					}
				}
			}
		}
		// 관련 개념 정리 : 나누어지는 수가 0이면 나머지는 항상 0임을 간과함.
		/// 			십의 자리나 일의 자리가 0인 경우와 둘 다 0이 아닌 경우로 조건을 나누어 설계.
		*/
// --------------- 실제 답안 ------------------------
//public class Game369{
	//public static void main(String[] args){
		for (int i = 1; i < 51; i++) {
			int sib = i / 10;
			int il = i % 10;
			if(sib == 0 || il == 0) {
				// 전제조건 : 십의 자리나 일의 자리가 0
				if(sib == 0 && il % 3 == 0) { 
					// 조건1 : (한 자리 수) && (일의 자리가 3의 배수)
					System.out.println("짝");
				}
				else if (sib % 3 == 0 && il == 0) { 
					// 조건2: (10의 배수) && (십의 자리가 3의 배수)
					System.out.println("짝");
				}
				else {
					// 조건1, 조건2 외의 경우
					System.out.println(i);
				}
			}
			else {
				// 전제조건이 거짓 -> 십의 자리와 일의 자리가 모두 0이 아님!!!
				if(sib % 3 == 0 && il % 3 == 0) {
					System.out.println("짝짝");
				}
				else if(sib % 3 == 0 || il % 3 == 0) {
					System.out.println("짝");
				}
				else {
					System.out.println(i);
				}
				
			}
		}
	//}
//}
	}
	public static void num10_1() {
		// 다른 방법으로 구현 (쌤 풀이에서 아이디어만 봤어요)
		// 클래스{}, 메인{}은 제외하고 작성.
		for(int i = 1; i < 51; i++) {
			int sib = i / 10;
			int il = i % 10;
			boolean clap10 = sib == 3 || sib == 6 || sib == 9;
			boolean clap1 = il == 3 || il == 6 || il == 9;
			
			if(clap10 && clap1) {
				System.out.println("짝짝");
			}
			else if(clap10 || clap1) {
				// 위의 if에서 교집합이 참이면 if문으로 들어감
				// else if 부분에서는 합집합 전체가 아니라 합집합-교집합일 때 들어감
				System.out.println("짝");
			}
			else {
				System.out.println(i);
			}
		}
		// 표현하고 싶은 집합의 부분을 일단 변수로 선언하면 조건식을 쓸 때 편하다!!!
		// 변수의 유지보수성?
		
	}
}

