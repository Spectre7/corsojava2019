package com.overnet.interfaces.listener;

public class ConcreteObserver2 implements Observer {

	public void update(int n, int saldo) {
		if(saldo<=-1000) {
			System.out.println("Conto corrente n. " + n + " estinto ");
		}		
	}
}
