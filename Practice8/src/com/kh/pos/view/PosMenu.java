package com.kh.pos.view;

import java.util.Scanner;

import com.kh.pos.controller.PosController;
import com.kh.pos.model.Customer;
import com.kh.pos.model.PaymentMethod;


public class PosMenu {
	private PosController pc;
	private Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {
		this.pc = new PosController();
		System.out.println("--- 자가 쇼핑 POS 등록 ---");
		System.out.print("고객 이름 입력: ");
		String name = sc.next();
		System.out.print("고객 나이 입력: ");
		int age = sc.nextInt();
//		sc.nextLine();		// 버퍼 비우기
		// 다음 입력도 메뉴 번호, 정수이므로 윗줄은 있어도 되고 없어도 됨.
		
		Customer c = new Customer(name, age);
		pc.insertCustomer(c);
		
		while(true) {
			System.out.println("------------------------");
			System.out.println("=== 스마트 POS 단말기 메뉴 ===");
			System.out.println("1. 마이페이지 (멤버십 정보)");
			System.out.println("2. 전체 사용 가능 결제수단 조회");
			System.out.println("3. 결제수단 검색");
			System.out.println("4. 결제(구매)하기");
			System.out.println("9. 시스템 종료");
			System.out.print("메뉴 번호: ");
			int number = sc.nextInt();
			sc.nextLine();	// 버퍼 비우기
			
			switch(number) {
			case 1 : System.out.println(pc.getCustomerInfo().toString());
				break;
			case 2 : printAllMethods();
				break;
			case 3 : searchMethod();
				break;
			case 4 : pc.processPayment(sc.nextInt());
				break;
			case 9 : return;	// 메소드 종료 -> 호출된 위치로 돌아간다.
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;	
			}
		}
		
		
	}
	public void printAllMethods() {
		PaymentMethod[] list = pc.selectAllMethods();
		for(int i = 0; i < list.length; i++) {
			System.out.printf("[%d번] %s\n", i, list[i].toString());
		}
		
	}
	public void searchMethod() {
		System.out.print("검색어를 입력하세요: ");
		String keyword= sc.nextLine();
		
		PaymentMethod[] result = pc.searchMethod(keyword);
		for(PaymentMethod method : result) {
			if(method != null) {
				System.out.println(method);
			}
		}
	}
	public void checkout() {
		pc.processPayment(sc.nextInt());
	}
	
//	sc.close();
}
