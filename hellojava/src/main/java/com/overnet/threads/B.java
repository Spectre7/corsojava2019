package com.overnet.threads;

public class B extends Thread {
	private Account account;
	
	public B() {
		super();
	}
	
	public B(Account a) {
		super();
		this.account = a;
	}
	public void run() {
		this.account.versamento(100);
	}
}
