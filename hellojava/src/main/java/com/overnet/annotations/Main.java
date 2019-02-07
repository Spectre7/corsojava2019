package com.overnet.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		// Reflection
		// DOMINIO: Class, Method, Annotation

		Class<MyClass> clazz = MyClass.class;
		Method[] metodi = clazz.getMethods();
		
		for (int i = 0; i < metodi.length; i++) {
			Method m = metodi[i];			
			Annotation[] annotazioni = m.getDeclaredAnnotations();			
			System.out.println(metodi[i].getName());
			for(int k=0;k<annotazioni.length;k++) {
				System.out.println("--- " + annotazioni[k].toString());
			}
		}

	}
}
