package com.overnet.jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConnessioneOracle {

	public static void main(String[] args) {

		
		String istruzioneSql = "CREATE TABLE AULA " +
		                       "(COD_ALLIEVO NUMBER(4) NOT NULL," +
		                       " COGNOME     VARCHAR2(20), " + 
		                       " NOME        VARCHAR2(13))";
		Connection dbxe = null;
		
		//Registro e carico in memoria i driver che mi permetteranno di
		//collegarmi ad Oracle
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"ATTENZIONE.... errore caricamento Driver",
					                           "REGISTRAZIONE DRIVER FALLITA",
					                           JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		//Eseguo la connessione fisica al Database xe
		//tramite l'utente hr
		try {
			dbxe = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"ATTENZIONE.... errore connessione al DB\n" +
			                                   "Verificare user e password o, eventualmente, la porta.....",
					                           "CONNESSIONE DATABASE FALLITA",
					                           JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		JOptionPane.showMessageDialog(null,"DATABASE CONNESSO.....",
                                           "CONNESSIONE EFFETTUATA",
                                           JOptionPane.INFORMATION_MESSAGE);
		
		try {
			//Creo una variabile di tipo statement(istruzione)
			Statement istruzione = dbxe.createStatement();
			//Eseguo l'istruzione sql
			istruzione.execute(istruzioneSql);
		} catch (SQLException e1) {
			
			JOptionPane.showMessageDialog(null,"ATTENZIONE.... errore istruzione sql\n" +
                                               "Verificare la sintassi del comando.....",
                                               "ERRORE COMANDO SQL",
                                               JOptionPane.ERROR_MESSAGE);
		}finally {
			try {
				dbxe.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
		
		System.out.println("Programma terminato...");
	}

}
