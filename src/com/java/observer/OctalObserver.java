package com.java.observer;

public class OctalObserver extends Observer {

	OctalObserver(Subject subject){
		this.subject=subject;
		this.subject.attachObserver(this);
	}
	@Override
	public void update() {
		System.out.println("Octal: "+Integer.toOctalString(subject.getState()));
	}
}