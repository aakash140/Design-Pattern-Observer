package com.java.observer;

public class BinaryObserver extends Observer {

	BinaryObserver(Subject subject){
		this.subject=subject;
		this.subject.attachObserver(this);
	}
	
	@Override
	public void update() {
		System.out.println("Binary: "+Integer.toBinaryString(subject.getState()));
	}
}