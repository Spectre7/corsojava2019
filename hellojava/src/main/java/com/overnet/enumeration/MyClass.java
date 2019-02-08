package com.overnet.enumeration;

public class MyClass {
	

	
	private final int SUMMER = 0;
	
	// ...
	
	private final int SUNDAY = 0;
	

	// Compile 
	int giornoX = SUMMER;
	
	public static void main(String[] args) {
		Stagioni s = Stagioni.SUMMER;
		
		Stagioni ss = null;
		
		System.out.println(s);
		
		metodo(Stagioni.SUMMER);
	}
	
	private static void metodo(Stagioni s) {
		switch(s) {
		case SUMMER:
			System.out.println("estate");
		}
	}
	
	
}
