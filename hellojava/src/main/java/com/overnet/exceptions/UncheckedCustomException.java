package com.overnet.exceptions;

public class UncheckedCustomException extends RuntimeException {
	private int valoreSignificativo;
	
	public int getValoreSignificativo() {
		return valoreSignificativo;
	}

	public void setValoreSignificativo(int valoreSignificativo) {
		this.valoreSignificativo = valoreSignificativo;
	}

	public UncheckedCustomException(int valoreSignificativo) {
		this.valoreSignificativo = valoreSignificativo;
	}
	
	public void printInfoErrore() {
		System.out.println("Errore perchè bal bla");
	}
	
	
}
