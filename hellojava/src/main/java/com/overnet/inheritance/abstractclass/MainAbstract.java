package com.overnet.inheritance.abstractclass;

public class MainAbstract {

	public static void main(String[] args) {
		Shape s1 = new Rettangolo();
		Shape s2 = new Cerchio();
		Rettangolo r = new Rettangolo();
		Cerchio c = new Cerchio();
		
		unMetodo(s1);
		unMetodo(r);
		unMetodo(c);
	}
	
	
	public static void unMetodo(Shape s) {
		s.draw();
	}

}
