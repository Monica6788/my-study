package com.kh;

public class B_String {

	public static void main(String[] args) {
//		test1();
		test2();
	}
	
	public static void test1() {
		String str1 = "Friday";
		String str2 = "Friday";
		
		System.out.println(str1 == str2);
		// 결과가 true인 이유?
		// 문자열 값 자체(리터럴)를 대입하게 되면 "상수풀"이라는 공간에 저장되어
		// 같은 곳을 가리키게 된다! (즉, 주소값이 동일하다!!!)
		
		System.out.println(str1 == "Friday");
		// str1이 가리키고 있는 주소(상수풀)와 "Friday"라는 값 자체가 저장된 주소를 비교
		// 둘 다 같은 곳을 가리키게 된다.(둘 다 상수풀에 있다.)
		
		System.out.println("========================");
		
		String str3 = new String("Friday");
		String str4 = new String("Friday");
		
		System.out.println(str3 == str4);
		// 결과가 false인 이유?
		// new를 통해 만들어지면 항상 Heap 영역에 새로운 공간이 할당된다.
		// 상수풀이 아니라 Heap 영역에서 각각 다른 곳을 가리키고 있다.
		// 문자열 객체를 생성해서 값을 대입하게 되면
		// 메모리에 새로운 영역에 할당하므로 각각 다른 위치에 값이 저장된다.
		// 주소가 다르므로 false
		
		System.out.println(str3 == "Friday");
		// str3은 Heap 영역에, "Friday"는 상수풀에 있다.
		// str3는 새로운 공간을 참조하고, "Friday"라는 값 자체는 상수풀에 저장되어 있어 주소값이 다르다.
		
		// 문자열의 값을 비교하고자 할 때: equals() 
		System.out.println(str3.equals("Friday"));
		// 저장되어 있는 값 자체를 비교하는 메서드이므로 true
		
		System.out.println("========================");
		
		String str5 = "Good";
		String str6 = "Luck";
		
//		System.out.println(str5.toString());
		System.out.println(str5);
		
		// Object의 toString() => 클래스명@해시값
		// String은 오버라이드를 해놔서 str5를 그대로 뽑아도 나오는 것임~
		
		// 주소값(해시값)을 반환: System.identityHashCode(참조변수)
		int hash = System.identityHashCode(str5);
		System.out.println(hash);
		
		// 문자열을 합쳐주는 메서드: concat()
		// (앞에 넣을 값).concat(합칠 값)
		str5 = str5.concat(str6);
		System.out.println(str5);
		int hash2 = System.identityHashCode(str5);
		System.out.println(hash2);
		// str5의 값이 달라졌기 때문에 해시값(주소값)도 달라진다.
	}

	public static void test2() {
		String str1 = "Hello";
		
		// toUpperCase(): 문자열의 알파벳을 모두 대문자로 변환하여 리턴
		// toLowerCase(): 문자열의 알파켓을 모두 소문자로 변환하여 리턴
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		// contains: 문자열 내에 특정 문자열이 포함되어 있는지 여부(boolean)를 리턴
		System.out.println(str1.contains("he"));
		System.out.println(str1.contains("h e"));
		
		// indexOf: 문자열 내에 특정 문자열이 포함되어 있는 시작 위치를 리턴(int)
		System.out.println(str1.indexOf("lo"));
		System.out.println(str1.indexOf("h e"));
		
		// substring
		// 문자열.substring(시작인덱스): 문자열의 시작인덱스부터 마지막 위치까지 부분을 추출하여 리턴
		// 문자열.substring(시작인덱스, 끝인덱스): 문자열의 [시작인덱스, 끝인덱스) 범위를 추출하여 리턴
		
		System.out.println(str1.substring(4));
		System.out.println(str1.substring(0, 3));
		
		// repeat: 문자열을 지정한 개수만큼 반복하여 리턴
		System.out.println(str1.repeat(5));
		System.out.println("=".repeat(10));
		
		// split: 문자열을 특정 구분자를 기준으로 분리하여 문자열 배열 형태로 리턴
		// .split("구분용문자")
		String str2 = "JAVA#SQL#HTML#CSS";
		String[] arr = str2.split("#");
		
		for (String s : arr) {
			System.out.println(s);
		}
		// 구분 문자를 공백으로 두고 배열을 다시 합치는 메서드를 만들면?
		// toUpperCase(), toLowerCase()처럼 검색 기능 구현할 때 편할 듯?
	}
}
