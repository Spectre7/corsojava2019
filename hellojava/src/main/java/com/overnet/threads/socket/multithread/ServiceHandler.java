package com.overnet.threads.socket.multithread;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Date;

public class ServiceHandler implements Runnable {
	Socket connectionSock;
	
	public ServiceHandler(Socket s) {
		this.connectionSock = s;
	}

	public void run() {
		Date now = new Date();
		
		try {
			BufferedReader clientInput = new BufferedReader(new InputStreamReader(connectionSock.getInputStream()));
			DataOutputStream clientOutput = new DataOutputStream(connectionSock.getOutputStream());
		
			System.out.println("Connection made, waiting for client " + "to send their name.");
			
			while(true) {
				String clientText = clientInput.readLine();
			
				String replyText = "Welcome, " + clientText + ", Today is " + now.toString() + "\n";
				clientOutput.writeBytes(replyText);
				System.out.println("Sent: " + replyText);
			}
			//clientOutput.close();
			//clientInput.close();
			//connectionSock.close();
		} catch(IOException ioe) {

			
			
			
		}
	}

}
