package com.overnet.generics;

public class Lista {
	Elemento head;
	
	public Lista() {
		this.head = null;
	}
	
	public void add(Object valore) {
		// 1 Creo un elemento
		Elemento nuovo = new Elemento();
		// 2 Imposto il valore dell'elemento
		nuovo.valore = valore;
		// 3 Imposto a null il successivo dell'ultimo elemento
		nuovo.successivo = head;
		
		// 4 Imposto il puntatore della coda al nuovo elemento
		head = nuovo;
	}
	
	public void stampa() {
		// 
	}
}
