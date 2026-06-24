package com.kh.ex1.model.vo;

public class Audio implements RemoteControl {
	private int volume;
	
	public Audio() {
		this.volume = 0;
	}
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > 10) {
			System.out.println("최대 볼륨(10)보다 크게 조절할 수 없습니다.");
		} else if(volume < 0) {
			System.out.println("최소 볼륨(0)보다 작게 조절할 수 없습니다.");
		} else {
			this.volume = volume;
		System.out.printf("Audio의 볼륨을 %d로 조절합니다.\n", volume);
		}
		
	}

}
