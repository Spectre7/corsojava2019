package com.overnet.gestionestudenti;

public class App {

	public static void main(String[] args) {
		Corso c = new Corso();
		
		c.iscrivi(new Studente("giuseppe", "baudo"));
		c.iscrivi(new Studente("mario", "rossi"));
		c.iscrivi(new Studente("giuseppe", "verdi"));
		
		Studente s = c.getStudenteById(0);
		
		System.out.println(s.getCognome());
	}

}
