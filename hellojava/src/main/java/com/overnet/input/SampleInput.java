package com.overnet.input;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class SampleInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci il nome: ");		
		String nome = scan.nextLine();
		
		System.out.println("Iserisci l'età: ");
		int eta = scan.nextInt();
		
		System.out.println("Thank you " + nome + ", " + eta);
		
		scan.close();

		
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				String s;
				s = JOptionPane.showInputDialog("Inserisci un valore");
				
				int res;
				res = JOptionPane.showConfirmDialog(null, "confermi?");
				
				if(res==1)
					System.out.println(res);
				
			}
			
		});
		

	}

}
