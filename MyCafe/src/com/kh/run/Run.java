package com.kh.run;
// Ctrl + Shift 'O'로 import
import com.kh.menu.Drink;
import com.kh.menu.Americano;
import com.kh.menu.Latte;

public class Run {

	public static void main(String[] args) {
		Drink[] menu = new Drink[2];
		menu[0] = new Americano("아메리카노", 2000);
		menu[1] = new Latte("라떼", 3000);
		
		System.out.println("========= My Cafe=========");
		
		for(Drink m : menu) {
			System.out.printf("[%s] 가격: %d원\n", m.getName(), m.getPrice());
			m.order();
		}

	}

}
