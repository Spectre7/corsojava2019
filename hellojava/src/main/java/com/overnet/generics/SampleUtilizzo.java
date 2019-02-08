package com.overnet.generics;

import java.util.ArrayList;

public class SampleUtilizzo {
	
	private static class Utente {
		
	}
	
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("stringa");
		
		ArrayList<Integer> listaDiInteri = new ArrayList<Integer>();
		listaDiInteri.add(10);
	
		ArrayList<Utente> listaDiUtente = new ArrayList<Utente>();
		listaDiUtente.add(new Utente());
		
		Utente[] u = new Utente[10];
		
	
	}
}
