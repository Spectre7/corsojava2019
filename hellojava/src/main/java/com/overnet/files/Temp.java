package com.overnet.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Temp {
	public static void main(String[] args) {
		String filename = "C:\\Users\\Administrator\\Documents\\temp.txt";
		
		try {
			FileReader fileReader = new FileReader(filename); // <---???

			BufferedReader bufferedReader = new BufferedReader(fileReader);
		
			String line;
			int riga = 1;
		
			while((line = bufferedReader.readLine()) != null) {
				System.out.println("Riga " + riga + " = " + line);
				riga++;
			}
			
			bufferedReader.close();
			fileReader.close();
			
		} catch(FileNotFoundException ee) {
			System.out.println("Il file non esiste");
		} catch(IOException ioex) {
			System.out.println("Errore di i/o");
		} catch(Exception e) {
			System.out.println("Eccezione generica");
		}
		
		System.out.println("L'esecuzione continua");
		
		try {
			metodo3();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("");
			
		}
		
	}
	
	public static void metodo1() throws Exception {
		throw new Exception();
	}
	
	public static void metodo2() throws Exception {
		metodo1();
		System.out.println("back to 2");
	}
	
	public static void metodo3() throws Exception {
		metodo2();
		System.out.println("back to 3");
	}
}
