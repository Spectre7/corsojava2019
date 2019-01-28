package com.overnet.gestionestudenti;

public class EqualityTests {

	public static void main(String[] args) {

		Studente s1 = new Studente("mario", "rossi");
		Studente s2 = new Studente("mario", "rossi");
		Studente s3;
		
		s3 = s1.clone();
		
		s3.setCognome("verdi");
		
		
		System.out.println(s1.getCognome());
		
		/*
		if( s1.equals(s2)) {
			System.out.println("Sono uguali");
		} else {
			System.out.println("Sono diversi");
		}
		*/
		
		/*
		String n1 = new String("mario");
		String n2 = new String("mario");
		
		if( n1.equals(n2) ) {
			System.out.println("Sono uguali");
		} else {
			System.out.println("Sono diversi");
		}
		*/
	}

}
