package com.overnet.interfaces.listener;

public class TestListener {

	public static void main(String[] args) {
		Account a = new Account(0);
		
		a.addObserver(new ConcreteObserver1());
		a.addObserver(new ConcreteObserver2());
		
		a.deposita(100);
		a.preleva(50000);
		
		
		
		// System.out.println("account negativo = " + saldo);
		
		// Requisiti
		// 1. Effettuare depositi e prelievi
		// 2. Avvisare l'utente se conto corrente <= 0 (osservatore 1)
		//    "Warning account negativo"
		// 3. Avvisare l'utente se conto corrente <= -1000 (osservatore 2) 
		//    "Il tuo conto corrente è stato chiuso"
		// 4. Dimostrare che aggiungendo un nuovo osservatore non devo cambiare nulla
		//    nella implementazione del conto corrente.
	}

}
