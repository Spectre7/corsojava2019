package com.overnet.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// Reflection
		// DOMINIO: Class, Method, Annotation
		
		Class<MyClass> clazz = MyClass.class;
		
		
		
		Method[] metodi = clazz.getMethods();
		
		
		for (int i = 0; i < metodi.length; i++) {
			Method m = metodi[i];	
			
			Annotation[] annotazioni = m.getDeclaredAnnotations();			
			
			System.out.println(metodi[i].getName());
			for(int k=0;k<annotazioni.length;k++) {
				
				Annotation a = annotazioni[k];
				
				// riferimento alla classe che rappresenta la mia annotazione
				Class<? extends Annotation> annotazione = a.annotationType();
				
				System.out.println("--- " + annotazioni[k].toString());
				Method[] attributi = annotazione.getDeclaredMethods();
				for(int j=0;j<attributi.length;j++) {
					
					System.out.println("----- " + attributi[j].getName() + " " + attributi[j].invoke(annotazioni[k]));
				}
				
				
				
			}
		}

	}
}
