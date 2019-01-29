package com.overnet.overriding;

public class FixedInterestAccount extends Account {
	
	public FixedInterestAccount(int saldo) {
		super(saldo);
	}
	
	public int getSaldo() {
		return super.getSaldo() + (super.getSaldo()*10/100);
	}
	
	public void metodoBloa() {
		
	}
}
