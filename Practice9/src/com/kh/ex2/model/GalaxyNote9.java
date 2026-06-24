package com.kh.ex2.model;

public class GalaxyNote9 extends SmartPhone 
implements Phone, Camera, CellPhone, TouchDisplay, NotePen {
	
	public GalaxyNote9() {
		setMaker("삼성");
	}
	
	@Override
	public String makeCall() {
		String make = "번호를 누르고 통화 버튼을 누름";
		return make;
	}

	@Override
	public String takeCall() {
		String take = "수신 버튼을 누름";
		return take;
	}
	
	@Override
	public String picture() {
		String pic = "1200만 듀얼 카메라";
		return pic;
	}
	
	@Override
	public String charge() {
		String charge = "고속 충전, 고속 무선 충전";
		return charge;
	}


	@Override
	public String touch() {
		String touch = "정전식, 와콤펜 지원";
		return touch;
	}

	@Override
	public boolean bluetoothPen() {
		return true;
	}

	@Override
	public String printInformation() {
		String info = String.format("갤럭시 노트9은 %s에서 만들어졌고 제원은 다음과 같다.\n" +
									"%s\n" +
									"%s\n" +
									"%s\n" +
									"%s\n" +
									"%s\n" +
									"블루투스 펜 탑재 여부: %b\n",
									getMaker(),
									makeCall(),
									takeCall(),
									picture(),
									charge(),
									touch(),
									bluetoothPen());
		return info;
	}
	
}
