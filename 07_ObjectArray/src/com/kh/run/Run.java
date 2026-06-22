package com.kh.run;
import java.util.Arrays;
import java.util.Scanner;
import com.kh.model.Student;
// import HotKey: Ctrl + Shift + 'O'
// 똑같은 클래스가 있을 때 단축키를 쓰는 경우에는 경로 확인 필수!!!

public class Run {
	/*
	 * 객체 배열: 여러 개의 객체를 저장하여 관리하는 구조
	 * !! 주의 !!
	 * 	배열을 생성(new 클래스명[크기])한다고 해서 실제 객체를 생성하는 것이 아니라, 
	 * 	객체의 주소를 담을 참조변수(배열명)만 만들어진 것.(기본값: null)
	 * - 선언: 클래스명[] 배열명;
	 * - 할당(생성): 배열명 = new 클래스명[배열크기];
	 * - 값 대입(객체 생성): 배열명[인덱스] = new 생성자; // 생성자: 클래스명();
	 * - 초기화
	 * 		변수명 = {new 생성자, new 생성자, ... };
	 */

	public static void main(String[] args) {
		// 크기가 3인 정수형 배열 선언 및 할당
		int[] arr = new int[3]; // [0, 0, 0]
		// [1, 2, 3] 값 대입
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr));
		// 배열을 [1, 2, 3] 형태로 출력해주는 메소드.
		// Arrays를 import 해주어야 함.
		System.out.println("------------------------------------");
		
		// 학생 객체 생성
		Student s1 = new Student();
		// Stack: s1 -> Heap:|name(null)|age(0)|score(0.0)|
		
		// 학생 배열 생성
		Student[] sArr = new Student[3];
		// stack: sArr -> Heap:|null|null|null|
		
		// 배열의 각 위치에 학생 정보를 저장(대입)
		sArr[0] = new Student("이고은", 28, 51.2);
		// stack: sArr -> Heap:|이고은 학생의 정보가 저장된 메모리의 주소값|null|null|
		sArr[1] = new Student("이우진", 39, 100.0);
		sArr[2] = new Student("오범영", 29, 100.0);
		
//		for문 사용하여 객체 생성 (기본 생성자로만 생성할 경우에만 쓸 수 있음.)
//		아니어도 사실 쓸 수는 있는데 if 들어가고 난리남... 효율 와장창.
//		for(int i = 0; i < sArr.length; i++) {
//			sArr[i] = new Student();
//		}
		
		// 두 번째 학생 정보 출력
		// 1) 배열에서 몇 번째 위치의 값으로 접근할 것인지
		// 2) 학생 정보 출력 기능(메소드)이 있는지 (없으면 getter 메소드 활용!)
		
		System.out.println(sArr[2].getName() + " " + sArr[2].getAge() 
									+ " " + sArr[2].getScore());
		sArr[1].printInfo();
		// sArr.printInfo();는 사용 불가.
		// sArr[0]은 Student 클래스의 객체이지만 sArr은 배열이므로 Student 클래스에 없음.
		// printInfo라는 기능은 sArr이 아닌 Student 클래스에 정의된 메소드.
		// 배열 sArr은 printInfo라는 기능을 가지고 있지 않음.
		
		// 세 번째 학생 정보 삭제
		sArr[2] = null;
		// sArr[2].printInfo(); // NullPointerException 발생!!
		// 객체가 제거되었는데 기능을 호출하려고 했기 때문.
		
		System.out.println("---------------------------------------");
		
		// 값을 입력받아 학생 정보 저장.
		Scanner sc = new Scanner(System.in);
		
		Student[] sArr2 = new Student[2];
		
		// 반복문을 사용하여 입력받은 값을 배열에 저장.
		for(int i = 0; i < sArr2.length; i++) {
			System.out.print("이름: ");
			String name = sc.next();
			
			System.out.print("나이: ");
			int age = sc.nextInt();
			
			System.out.print("점수: ");
			double score = sc.nextDouble();
			
			// i번째 위치에 입력받은 학생 정보로 객체를 생성.
			sArr2[i] = new Student(name, age, score);
		}
		
		// 출력
		System.out.println("-------------- 학생 정보 --------------");
		// 향상된 for문 사용
		// for (자료형 변수명: 배열명){}
		for(Student s : sArr2) {
			s.printInfo();
		}
		
	
		sc.close();

		
		
	}

}
