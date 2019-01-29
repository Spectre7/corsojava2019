package com.overnet.inheritance.abstractclass.strategy;

public class Client {

	public static void main(String[] args) {
		Strategy s1 = new ConcreteStrategy1();
		Strategy s2 = new ConcreteStrategy2();
		
		//s1.performaAlgoritmo();		
		//s2.performaAlgoritmo();

		metodo(s1);
		metodo(s2);
	}
	
	
	public static void metodo(Strategy s) {
		s.performaAlgoritmo();
	}

}
