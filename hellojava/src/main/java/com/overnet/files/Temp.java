package com.overnet.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Temp {
	public static void main(String[] args) throws IOException {
		String filename = "C:\\Users\\Administrator\\Documents\\temp.txt";
		
		FileReader fileReader = new FileReader(filename);	
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String line;
		int riga = 1;
		
		//while((line = bufferedReader.readLine()) != null) {
		//	System.out.println("Riga " + riga + " = " + line);
		//}
		
		bufferedReader.close();
		fileReader.close();

	}
}
