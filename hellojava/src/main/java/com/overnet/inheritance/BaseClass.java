package com.overnet.inheritance;

public class BaseClass {
	private String nome;
	
	public BaseClass() {
		
	}
	
	public BaseClass(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		String s= calcola();
		return this.nome;
	}
	
	private String calcola() {
		return null;
	}
	
	protected String getCalcola() {
		return null;
	}
	
}
