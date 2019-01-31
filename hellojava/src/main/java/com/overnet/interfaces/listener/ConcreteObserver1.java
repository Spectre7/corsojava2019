package com.overnet.interfaces.listener;

public class ConcreteObserver1 implements Observer {

	@Override
	public void update(int saldo) {
		if(saldo<0)
			System.out.println("Warning saldo negativo");
	}

}
