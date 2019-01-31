package com.overnet.interfaces;

public class MainInterfaces {
	private Listener l;
	
	public static void main(String[] args) {
		MainInterfaces m = new MainInterfaces();
		
		m.setListener( new ConcreteListener(), 10 );
		
		m.setListener( new ConcreteListener2(), 5 );
	}

	
	public void setListener(Listener l, int a) {
		// Polimorfismo
		l.notifica();
		
		int temp = a*5;
	}


}
