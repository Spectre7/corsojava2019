package com.overnet.exceptions;

public class TestCustomException {

	public static void main(String[] args) {
		try {
			metodo2();
		} catch (UncheckedCustomException e) {
			System.out.println("Il valore significativo al momento dell'eccezione era: " + e.getValoreSignificativo());
			
			int a = e.getValoreSignificativo();
			
			if (a>10) {
				System.out.println("Ripristino a > 10");
			} else {
				System.out.println("Ripristino a <= 10");
			}
			
		}
	}
	
	public static void metodo() throws CheckedCustomException {
		throw new CheckedCustomException();
	}
	
	@Deprecated
	public static void metodo2() throws UncheckedCustomException {
		int a = 10;
		throw new UncheckedCustomException(a);
	}

}
