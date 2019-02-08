package com.overnet.enumeration;

public enum Stagioni {
	SUMMER(3,5), WINTER(4,3), FALL(6,6), SPRING(8,9);
	
	private final int a;
	private final int b;
	
	
	
	private Stagioni(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	
	public int a() {return this.a;}
	
	public static void main(String[] args) {
		Stagioni s = SUMMER;
		
		s.a();
	}
}
