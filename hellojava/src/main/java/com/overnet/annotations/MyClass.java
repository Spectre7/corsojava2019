package com.overnet.annotations;

@MyAnnotation(name = "un nome")
public class MyClass {	
	
	@MyAnnotation(name="excel",attributoIntero=100)
	public void metodo1() {}
	
	@MyAnnotation(name="no")
	public void metodo2() {}
	
	@MyAnnotation(name="", attributoIntero=15)
	public void metodo3() {}
	
	@MyAnnotation(name="")
	public void metodo4() {}
	
	
	public void metodd() {}
}	
