package com.overnet.interfaces.listener;

public class ConcreteObserver2 implements Observer {
	@Override
	public void update(int saldo) {
		if(saldo<=-1000) {
			System.out.println("Conto corrente estinto");
		}		
	}
}
