package com.overnet.threads;

public class B extends Thread {

	public void run() {
		System.out.println("istruzione 1 thread B");
		System.out.println("istruzione 2 thread B");
		System.out.println("istruzione 3 thread B");
		System.out.println("istruzione 4 thread B");
		System.out.println("istruzione 5 thread B");
		System.out.println("istruzione 6 thread B");
		System.out.println("istruzione 7 thread B");
		System.out.println("istruzione 8 thread B");
		System.out.println("istruzione 9 thread B");
		System.out.println("istruzione 10 thread B");
		System.out.println("istruzione 11 thread B");
		System.out.println("istruzione 12 thread B");
		
		for(int i=0;i<10000;i++) {
			System.out.println(i + " di B");
		}
	}
}
