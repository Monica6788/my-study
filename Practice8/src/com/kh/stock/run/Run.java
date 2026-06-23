package com.kh.stock.run;

import com.kh.stock.model.Device;
import com.kh.stock.model.SmartPhone;
import com.kh.stock.model.Tablet;

public class Run {
	public static void main(String[] args) {
		Device[] devices = new Device[3];
		devices[0] = new SmartPhone("Apple", "iPhone", 1250000, "iOS");
		devices[1] = new SmartPhone("Samsung", "Galaxy S24", 1150000, "Android");
		devices[2] = new Tablet("Samsung", "Galaxy Tab S9", 980000, true);
		
		System.out.println("=== 매장 보유 디바이스 재고 목록 ===");
		for(Device d : devices) {
			System.out.println(d.getInformation());
		}
		System.out.println("========================");
	}

}
