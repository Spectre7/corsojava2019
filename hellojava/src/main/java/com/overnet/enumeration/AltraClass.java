package com.overnet.enumeration;

public class AltraClass implements Costanti {
		public static String field;
	
	public static void main(String[] args) {
		
	
		
		
		String i = "SUMMERs";
		
		Stagioni aa=null;
		
		Stagioni aaa = Stagioni.SUMMER;
		
		try {
			aa = Stagioni.valueOf(i);
		} catch(Exception e) {
			System.out.println("aiai");
		}

		System.out.println("Val: " + aa);
		
		
		
		
	}
	
	
	public void metodo(int stagione) {
		switch(stagione) {
		case SUMMER:
			System.out.println("");
		}
	}
}
