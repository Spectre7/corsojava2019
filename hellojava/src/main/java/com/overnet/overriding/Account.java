package com.overnet.overriding;

public class Account {
	private int saldo;

	public Account() {
		System.out.println("chiamato costruttore di default di Account");
	}
	
	public Account(int saldo) {
		System.out.println("chiamato costruttore di Account");
		this.saldo = saldo;
	}
	
	public int getSaldo() {
		return saldo;
	}

	public final void setSaldo(int saldo) {
		this.saldo = saldo;
	}
}
