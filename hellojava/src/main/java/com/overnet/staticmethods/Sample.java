package com.overnet.staticmethods;

public class Sample {
	private String campo;
	
	public static void main(String[] args) {
		Math.pow(10, 2);
		
		String s = "10";
		Integer i;		
		
		i = Integer.parseInt(s);	
		
		max(10,30);
	}
	
	public static int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

}
