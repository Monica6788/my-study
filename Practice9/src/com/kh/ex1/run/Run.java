package com.kh.ex1.run;

import com.kh.ex1.model.vo.Audio;
import com.kh.ex1.model.vo.RemoteControl;
import com.kh.ex1.model.vo.Television;

public class Run {
	public static void main(String[] args) {
//		RemoteControl tv = new Television();
//		RemoteControl audio = new Audio();
//		
//		tv.turnOn();
//		tv.setVolume(7);
//		tv.turnOff();
//		System.out.println("---");
//		audio.turnOn();
//		audio.setVolume(5);
//		audio.turnOff();
		
		RemoteControl[] re = new RemoteControl[2];
		re[0] = new Television();
		re[1] = new Audio();
		
		for(RemoteControl r : re) {
			r.turnOn();
			if(r instanceof Television) {
				r.setVolume(7);
			} else if (r instanceof Audio) {
				r.setVolume(5);
			}
			r.turnOff();
		}
		
	}

}
