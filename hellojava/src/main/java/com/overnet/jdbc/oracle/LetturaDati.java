package com.overnet.jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class LetturaDati {

	public static void main(String[] args) {
		
		ResultSet risultato = null;
		int contatore = 1;
		
		String codDip = JOptionPane.showInputDialog(null, "Inserire il codice dipartimento:",
				                                          "IMMISSIONE PARAMETRO",
				                                          JOptionPane.QUESTION_MESSAGE);
		
		String istruzioneSql = "SELECT RPAD(LAST_NAME||' '||FIRST_NAME,25), " +
                   			   "       RPAD(JOB_ID,12), " + 
                   			   "       RPAD(PHONE_NUMBER,14), " + 
                   			   "       LPAD(TRIM(TO_CHAR(SALARY,'L999,999,999.00')),12) " + 
                			   "  FROM EMPLOYEES " +
                   			   " WHERE DEPARTMENT_ID = " + codDip;
		
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
			//Eseguo la query
			risultato = istruzione.executeQuery(istruzioneSql);
			
			System.out.println("Stampa impegati dipartimento: " + codDip + 
					           "\n================================\n");
			
			while(risultato.next()) {
				System.out.println(contatore + "° " +
			                       risultato.getString(1) + " " + 
			                       risultato.getString(2) + " " +
			                       risultato.getString(3) + " " +
			                       risultato.getString(4));
				contatore++;
				
			}
			
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
	}

}
