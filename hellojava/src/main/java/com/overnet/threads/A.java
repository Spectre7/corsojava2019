package com.overnet.threads;

public class A {

	public static void main(String[] args) throws InterruptedException {
		Account account = new Account(100);
		
		Thread b = new B(account);
		Thread c = new C(account);
		
		b.start();
		c.start();
		
		b.join();
		c.join();
	
		account.stampaSaldo();
	}
}
