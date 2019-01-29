package com.overnet.gestionestudenti;

/**
 * 
 * Questa classe serve per bla bla
 * 
 * 
 * @author Administrator
 * @since version 1
 * 
 */

public class Studente extends Object {
	private String nome;
	private String cognome;
	
	/**
	 * Questo è il costruttore standard
	 * 
	 * @param nome - nome dello studente
	 * @param cognome - cognome dello studente
	 */
	public Studente(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public boolean equals(Studente s2) {
		return this.nome.equals(s2.getNome()) && this.cognome.equals(s2.getCognome());
	}
	
	public String toString() {
		return this.cognome + " - " + this.nome;
	}
	
	public Studente clone() {
		Studente s = new Studente(this.nome, this.cognome);
		return s;
	}
}
