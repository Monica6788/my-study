package com.kh.pos.controller;

import com.kh.pos.model.CardPayment;
import com.kh.pos.model.Customer;
import com.kh.pos.model.MobilePay;
import com.kh.pos.model.PaymentMethod;

public class PosController {
	private Customer customer = null;
	private PaymentMethod[] paymentList= new PaymentMethod[4];
	
	public PosController() {
		paymentList[0] = new MobilePay("네이버페이", 12, 1000000, "NAVER");
		paymentList[1] = new MobilePay("토스페이", 14, 2000000, "Toss");
		paymentList[2] = new CardPayment("국민 나라사랑카드", 12, 500000, true);
		paymentList[3] = new CardPayment("신한 체크카드", 8, 300000, false);
	}
	
	
	public void insertCustomer(Customer c) {
		this.customer = c;
	}
	public Customer getCustomerInfo() {
		return customer;	
	}
	public PaymentMethod[] selectAllMethods() {
		return paymentList;		
	}
	public PaymentMethod[] searchMethod(String keyword) {
		PaymentMethod[] result = new PaymentMethod[paymentList.length];
		int index = 0;
		
		for(PaymentMethod method : paymentList) {
			String methodName = method.getName();
			if(methodName.contains(keyword)) {
				result[index++] = method;				
			}/* else {result = null;} */
			// => if문에서 i = 0일 때 포함된 문자열이 없을 경우 바로 else로 넘어가버림.
			// => 이러면 searchMethod 바로 아래에서 result = 페이먼트[4] 해놓은 것까지 없어짐.
			// => result라는 참조변수만 남고 할당한 칸까지 싹 다 사라짐!!!
			// => 할당한 칸도 없는데 배열의 요소에 접근하려고 해도 할 수가 없으니 널포인터익셉션 오류 발생.
			// 문자열.contains(키워드) : 문자열 내에 키워드가 포함되어 있으면 true, 없으면 false
			// ex) "application".contains("cat") = true
			//		"application".contains("c a t") = false
		}
		return result;
		
	}
	public int processPayment(int index) {
		PaymentMethod method = paymentList[index];
		int customerAge = customer.getAge();
		int methodMinAge = method.getMinAge();
		
		if(method instanceof MobilePay && customerAge <= methodMinAge + 3) {
			return 1;
		}
		
		if(method instanceof CardPayment && ((CardPayment)method).isHasCashback()) {
			int currPoint = customer.getPoints();
			customer.setPoints(currPoint + 500);
			return 2;
		}
		
		if(customerAge <= methodMinAge) {
			return 1;
		}
		return 0;
	}

}
