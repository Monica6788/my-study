package com.kh.ex2.controller;

import com.kh.ex2.model.GalaxyNote9;
import com.kh.ex2.model.Phone;
import com.kh.ex2.model.V40;

public class PhoneController {
	
	private String[] result;
	Phone[] list = {new GalaxyNote9(), new V40()};
	// 부모 클래스인 SmartPhone은 추상 클래스이므로 객체를 생성할 수 없다.
	public String[] method() {
		// 클래스는 변수와 메소드만으로 구성될 수 있다.
		// 배열에 인덱스로 접근하기, 반복문은 연산에 해당하므로 메소드 내부에 작성되어야 한다.
		Phone[] phones = new Phone[2];
		phones[0] = new GalaxyNote9();	
		phones[1] = new V40();
	
		int i = 0;		// 결과를 담을 result 배열에서 사용할 인덱스
	
		for(Phone p : phones) {
			// Phone 타입은 printInformation()을 알 수 없음.
			// => 다운캐스팅!
			if(p instanceof GalaxyNote9) {		// 혹은 p instanceof SmartPhone
				result[i] = ((GalaxyNote9)p).printInformation();
			} else if(p instanceof V40) {
				result[i] = ((V40)p).printInformation();
			}
			i++;
		}
	

//			result = new String[2];
//			for (Phone p : list) {
//				if(p instanceof GalaxyNote9) {
//					result[i++] = ((GalaxyNote9)p).printInformation();
////					System.out.println();
//				} else if(p instanceof V40) {
//					result[i++] = ((V40)p).printInformation();
//				}
////				i++;
//			}
			return result;
	}
}
