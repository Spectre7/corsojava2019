package com.overnet.interfaces.listener;

public class ConcreteObserver1 implements Observer {

	private static ConcreteObserver1 instance = null;
	
	private ConcreteObserver1() {}
	
	@Override
	public void update(int n, int saldo) {
		if(saldo<0)
			System.out.println("Warning saldo negativo sul cc n. " + n);
	}

	public static ConcreteObserver1 getInstance() {
		if(instance == null) {
			instance = new ConcreteObserver1();
		}
		return instance;
	}
}
