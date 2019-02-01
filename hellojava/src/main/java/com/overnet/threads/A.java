package com.overnet.threads;

public class A {

	public static void main(String[] args) throws InterruptedException {
		Account account = new Account(100);
		
		
		(new B(account)).start();
		(new C(account)).start();
		
	
		account.stampaSaldo();
	}
}
