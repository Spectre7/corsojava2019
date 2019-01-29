package com.overnet.inheritance.abstractclass.strategy;

public abstract class Strategy {
	private void passo1() {
		System.out.println("Passo 1");
	}
	
	private void passo2() {
		System.out.println("Passo 2");
	}
	
	public abstract void passoX();
	
	private void passoN() {
		System.out.println("Passo N");
	}
	
	public void performaAlgoritmo() {
		passo1();
		passo2();
		passoX();
		passoN();
	}
}
