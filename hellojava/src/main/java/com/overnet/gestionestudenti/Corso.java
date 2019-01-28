package com.overnet.gestionestudenti;

import java.util.ArrayList;

public class Corso {
	private ArrayList<Studente> studenti = new ArrayList<Studente>();
	
	public void iscrivi(Studente s) {
		this.studenti.add(s);
	}
	
	public Studente getStudenteById(int id) {
		return this.studenti.get(id);
	}
}
