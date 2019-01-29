package com.overnet.overriding;

public class Account {
	private int saldo;
	
	public Account(int saldo) {
		this.saldo = saldo;
	}
	
	public int getSaldo() {
		return saldo;
	}

	public final void setSaldo(int saldo) {
		this.saldo = saldo;
	}
}
