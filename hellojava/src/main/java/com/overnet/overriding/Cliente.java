package com.overnet.overriding;

public class Cliente {
	private Account conto;
	
	public Cliente(Account conto) {
		this.conto = conto;
	}
	
	public int getPatrimonio() {
		return this.conto.getSaldo();  // Polimorfismo attuato con l'ereditarietà
	}
}
