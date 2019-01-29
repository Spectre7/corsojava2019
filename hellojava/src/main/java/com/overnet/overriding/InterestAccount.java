package com.overnet.overriding;

public class InterestAccount extends Account {
	private int rate;
	
	public InterestAccount(int saldo, int rate) {
		super(saldo);
		this.rate = rate;
	}
	
	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	
	// OVERRIDING
	@Override
	public int getSaldo() {
		return super.getSaldo() + (super.getSaldo()*this.rate/100);
	}
	
	// OVERLOADING
	public void setSaldo() {
		
	}
	
	public void setSaldo(int a, int b) {
		
	}
	
	public void altroMetodo() {
		
	}

}
