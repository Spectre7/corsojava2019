package com.overnet.tipididato;

public class Sample {

	public static void main(String[] args) {
		int a;
		Integer i;		
		a = 10;
		i = a;  //<-- boxing
		
		Integer i2; Integer i3;
		i2 = new Integer(10);  // <--
		
		int b;
		
		b = i2;   //<--- unboxing
		i3 = i2;  //<--- assegnamento di ???
		
		b = 100;
		
	}

}
