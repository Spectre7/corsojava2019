package com.overnet.files;

import java.io.*;

public class ReadingTextFile {

	public static void main(String[] args) throws Exception   {
		
		System.out.println("Prima dell'eccezione");
		
			apriFile(null);

	
		System.out.println("Dopo l'eccezione");		
	}
	

	public static void apriFile(String filename) throws Exception {
		if(filename!=null) {
			System.out.println("Tutto ok eseguo quello che devo fare");
		} else {
			throw new Exception();
		}
	}

	
	

}
