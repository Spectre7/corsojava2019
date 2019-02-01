package com.overnet.threads;

public class Account {
	private int saldo;
	
	public Account(int s) {
		saldo = s;
	}
	
	public void versamento(int a) {
		int b = this.saldo;
		b+=(a+10);
		this.saldo=b;
	}
	
	public void stampaSaldo() {
		System.out.println("Saldo =  " + this.saldo);
	}
}
