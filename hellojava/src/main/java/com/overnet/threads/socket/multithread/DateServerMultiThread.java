package com.overnet.threads.socket.multithread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class DateServerMultiThread {
	public static void main(String[] args) throws IOException {
		System.out.println("Waiting for a connection on port 7654.");
			
		ServerSocket serverSock = new ServerSocket(7654);				
		while(true) {
			Socket connectionSock = serverSock.accept();
			
			
			ServiceHandler s = new ServiceHandler(connectionSock);
			Thread t = new Thread(s);
			t.start();
			
			//(new Thread(new ServiceHandler(connectionSock))).start();
			
		
		}
	}
}
