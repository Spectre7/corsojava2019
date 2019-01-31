package com.overnet.interfaces.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.io.IOException;
import java.awt.BorderLayout;

public class MainImg {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainImg window = new MainImg();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public MainImg() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImagePanel panel = new ImagePanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
	}

}
