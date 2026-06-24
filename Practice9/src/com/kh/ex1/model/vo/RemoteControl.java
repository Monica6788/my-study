package com.kh.ex1.model.vo;

public interface RemoteControl {
	final int MAX_VOLUME = 10;
	final int MIN_VOLUME= 0;
	
	// turnOn은 클래스 다이어그램상에서 기울임체로 쓰임. abstract라는 뜻.
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);

}
