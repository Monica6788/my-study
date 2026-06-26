package com.kh;

public class C_StringBuilder {
	// java.lang.StringBuilder: 같은 메모리 공간에서 값을 변경 (가변)
	public static void main(String[] args) {
		// StringBuilder 객체 생성: String 변수 필요
		String str = "summer";
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(sb);
		// System.out.println(sb.toString());으로 재정의 되어 있음.
		// toString 재정의 되어 있음. 저장된 값을 리턴!
		
		int hash = System.identityHashCode(sb);
		System.out.println(hash);
		
		// 값을 변경(추가): append()
		sb.append(" is fucking hot!!!");
		sb.append(" T.T");

		System.out.println(sb);
		
		int hash2 = System.identityHashCode(sb);
		System.out.println(hash2);
		// 주소값이 바뀌지 않음.
		// 메모리를 마구잡이로 사용하지 않으므로 값을 자주 변경해야 하는 문자열의 경우에는 스트링빌더를 쓸 수 있음.
	}

}
