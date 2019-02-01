package com.overnet.threads;

public class C extends Thread{
	private Account account;
	
	public C() {
		super();
	}
	
	public C(Account a) {
		super();
		this.account = a;
	}
	
	public void run() {
		this.account.versamento(100);
	}
}
