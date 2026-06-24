package com.kh.ex1.model.vo;

public class Television implements RemoteControl {
	private int volume;
	
	public Television() {
		this.volume = 0;
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > -1 && volume < 11) {
			this.volume = volume;
			System.out.printf("TV의 볼륨을 %d로 조절합니다.\n", volume);
		} else {
			System.out.println("볼륨은 0부터 10까지 조절 가능합니다.");
		}
	}
	
	
	

}
