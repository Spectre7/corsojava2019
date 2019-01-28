package com.overnet.hellojava;

public class Hello {
	
	
	// **** Dati
	private String greet;
	private int v;
	
	
	
	// **** Costruttori
	public Hello(){
		this.greet = "String di default";
	}
	
	public Hello(String greet){
		this.greet = greet;
	}
	
	public Hello(String greet, int v){
		this.greet = greet;
		this.v = 10;
	}



	// **** Operazioni sui dati
	// Getter della proprietà greet
	public String getGreet(){
		return this.greet;
	}
		
	// Setter della proprietà greet
	public void setGreet(String greet){
		this.greet = greet;
	}
		
	public char charAt(int index){
		return this.greet.charAt(index);
	}

}