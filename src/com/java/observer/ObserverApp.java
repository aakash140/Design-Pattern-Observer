package com.java.observer;

public class ObserverApp {

	public static void main(String[] args) {
		Subject subject=new Subject();
		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		
		subject.setState(15);
	}

}
