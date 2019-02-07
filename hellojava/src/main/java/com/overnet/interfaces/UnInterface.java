package com.overnet.interfaces;

public interface UnInterface {
	// Costante
	final int costante = 10;	
	
	// Signatures
	public String metodoX();
	
	// da Java8 - default
	default String metodoDiDefault() {
		System.out.println("metodo di default");
		return "hello";
	}
	
	// da Java8 - metodi statici	
	static String metodoStatico() {
		System.out.println("metodo statico");
		return "hello";
	}
}
