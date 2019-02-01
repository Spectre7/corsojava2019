package com.overnet.threads;

public class C extends Thread{
	public void run() {
		System.out.println("istruzione 1 thread C");
		System.out.println("istruzione 2 thread C");
		System.out.println("istruzione 3 thread C");
		System.out.println("istruzione 4 thread C");
		System.out.println("istruzione 5 thread C");
		System.out.println("istruzione 6 thread C");
		System.out.println("istruzione 7 thread C");
		System.out.println("istruzione 8 thread C");
		System.out.println("istruzione 9 thread C");
		System.out.println("istruzione 10 thread C");
		System.out.println("istruzione 11 thread C");
		System.out.println("istruzione 12 thread C");
		
		for(int i=0;i<10000;i++) {
			System.out.println(i + " di C");
		}
	}
}
