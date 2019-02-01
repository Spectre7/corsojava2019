package com.overnet.threads;

public class A {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("istruzione 1 di A");
		System.out.println("istruzione 2 di A");
		System.out.println("istruzione 3 di A");
		
		B thread1 = new B();
		thread1.start();		

		C thread2 = new C();
		thread2.start();
		
		System.out.println("istruzione 4 di A");
		System.out.println("istruzione 5 di A");
		System.out.println("istruzione 6 di A");
		System.out.println("istruzione 7 di A");
		System.out.println("istruzione 8 di A");
		
		for(int i=0;i<10000;i++) {
			System.out.println(i + " di A");
		}
	}

}
